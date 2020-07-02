package com.sinatra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SongsPage extends BasePage {

    @FindBy(css="section h1")
    WebElement headerPagina;

    @FindBy(css="#songs")
    WebElement listaCanciones;

    @FindBy(css="[href='/songs/1']")
    WebElement linkPrimeraCancion;

    public SongsPage(WebDriver wd) {
        super(wd);
        PageFactory.initElements(wd, this);
    }

    public void verificarPagina() {

    }

    public void verificarListaCanciones() {

    }

    public void navegarCancionNumero(int numCancion) {

    }

}
