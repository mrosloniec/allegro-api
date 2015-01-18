package com.nuta.allegro.service;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

@Service
public class ImageService {

	private static final String IMAGES_HOSTING = "http://www.freeimagehosting.net/";
	private static final By BROWSE_BUTTON_ELEMENT = By.xpath("html/body/center/table[2]/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/table/tbody/tr[6]/td/form/input[1]");
	private static final By UPLOAD_BUTTON_ELEMENT = By.id("b");
	private static final By LINK_ELEMENT = By.xpath("html/body/center/table[2]/tbody/tr/td/img");

	public String getImageLink(String fileName, byte[] bytes) {
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_17);
		driver.get(IMAGES_HOSTING);

		File file = createTempFile(fileName, bytes);

		if (file == null) {
			return null;
		}

		File resizedFile = resizeFile(fileName, file);
		String link = handleImageLinkGet(driver, resizedFile);
		removeTempFile(resizedFile);
		removeTempFile(file);
		return link;
	}

	private File resizeFile(String fileName, File file) {
		File resizedFile = null;
		try {
			BufferedImage image = ImageIO.read(file);
			int type = image.getType() == 0? BufferedImage.TYPE_INT_ARGB : image.getType();

			int width = image.getWidth() / 4;
			int height = image.getHeight() / 4;

			BufferedImage resizedImage = resizeImageWithHint(image, type, width, height);

			resizedFile = new File("resized_" + fileName);
			ImageIO.write(resizedImage, fileName.substring(fileName.lastIndexOf(".") + ".".length(), fileName.length()), resizedFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resizedFile;
	}

	private BufferedImage resizeImageWithHint(BufferedImage originalImage, int type, int width, int height){
		BufferedImage resizedImage = new BufferedImage(width, height, type);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(originalImage, 0, 0, width, height, null);
		g.dispose();
		g.setComposite(AlphaComposite.Src);
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		return resizedImage;
	}

	private File createTempFile(String fileName, byte[] bytes) {
		File file = null;
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(fileName);
			outputStream.write(bytes);
			file = new File(fileName);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			IOUtils.closeQuietly(outputStream);
		}
		return file;
	}

	private String handleImageLinkGet(WebDriver driver, File file) {
		WebElement browseButton = driver.findElement(BROWSE_BUTTON_ELEMENT);
		browseButton.sendKeys(file.getAbsolutePath());
		WebElement uploadButton = driver.findElement(UPLOAD_BUTTON_ELEMENT);
		uploadButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement link = wait.until(ExpectedConditions.visibilityOfElementLocated(LINK_ELEMENT));
		return link.getAttribute("src");
	}

	private void removeTempFile(File file) {
		file.delete();
	}

}
