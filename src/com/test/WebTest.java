package com.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by nkondratiev on 10.10.15.
 */
public class WebTest {
    @Test
    public void simpleTest() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.seleniumhq.org");

        WebElement downloadMenuItem =
                driver.findElement(By.linkText("Download"));
        downloadMenuItem.click();

        WebElement webDriverLink =
                driver.findElement(By.linkText("WebDriver"));
        webDriverLink.click();

        WebElement header = driver.findElement(By.className("package-page-heading"));
        Assert.assertEquals("Selenium WebDriver 2.48.0", header.getText());

        driver.close();

    }

}
