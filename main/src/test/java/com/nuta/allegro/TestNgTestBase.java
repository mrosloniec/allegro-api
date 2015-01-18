package com.nuta.allegro;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import ru.stqa.selenium.factory.WebDriverFactory;
import com.nuta.allegro.util.PropertyLoader;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestNgTestBase {

	protected WebDriver driver;
	protected String baseUrl;

	@BeforeClass
	public void init() throws IOException {
		baseUrl = PropertyLoader.loadProperty("site.url");
		Capabilities capabilities = PropertyLoader.loadCapabilities();

		driver = WebDriverFactory.getDriver(capabilities);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		if (driver != null) {
			WebDriverFactory.dismissDriver(driver);
		}
	}
}
