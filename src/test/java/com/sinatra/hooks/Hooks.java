package com.sinatra.hooks;

import com.sinatra.sites.SinatraSite;
import com.sinatra.utils.Properties;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public WebDriver driver;
    public SinatraSite sinatraSite;

    public WebDriver getDriver() {
        return driver;
    }

    public SinatraSite getSinatraSite() {
        return sinatraSite;
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Properties.SHORT_WAIT, TimeUnit.SECONDS);
        sinatraSite = new SinatraSite(driver);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
