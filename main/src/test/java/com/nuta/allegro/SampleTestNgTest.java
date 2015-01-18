package com.nuta.allegro;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.nuta.allegro.pages.HomePage;

import java.io.File;

public class SampleTestNgTest extends TestNgTestBase {

	private HomePage homepage;

	@BeforeClass
	public void testInit() {
		driver.get(baseUrl);
		homepage = PageFactory.initElements(driver, HomePage.class);
	}

	@Test
	public void testHomePageHasAHeader() {

	}
}
