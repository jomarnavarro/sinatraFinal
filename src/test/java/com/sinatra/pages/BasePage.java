package com.sinatra.pages;

import com.sinatra.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver wd) {
        this.driver = wd;
        wait = new WebDriverWait(driver, Properties.LONG_WAIT);
    }
}
