package com.sinatra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SongInformationPage extends BasePage {

    @FindBy(css="div p")
    WebElement campoLikes;

    @FindBy(css="div [type='submit']")
    WebElement btnLike;

    public SongInformationPage(WebDriver wd) {
        super(wd);
        PageFactory.initElements(wd, this);
    }

    public void validarPagina() {

    }

    public int obtenerNumeroLikes() {
        return -1;
    }

    public void darLikeCancion() {

    }

    
}
