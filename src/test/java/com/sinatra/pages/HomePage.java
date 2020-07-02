package com.sinatra.pages;

import com.sinatra.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    @FindBy(css="section p")
    WebElement mensajeBienvenida; 

    @FindBy(css="src=['/images/sinatra.jpg']")
    WebElement imgSinatra;
    
    @FindBy(css= "[href='/login']")
    WebElement linkLogin;

    @FindBy(css="[href='/songs']")
    WebElement linkSongs;

    public HomePage(WebDriver wd) {
        super(wd);
        PageFactory.initElements(wd, this);
    }

    public void navegarSitio() {
        driver.get(Properties.URL);
    }

    public void verificarPagina() {

    }

    public void navegarMenu(String opcionMenu) {
        linkSongs.click();
    }

    public void login(String username, String password) {
    }
}
