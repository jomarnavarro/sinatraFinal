package com.sinatra.sites;

import com.sinatra.pages.HomePage;
import com.sinatra.pages.SongInformationPage;
import com.sinatra.pages.SongsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SinatraSite {
    private final WebDriver driver;

    public HomePage getHome() {

        return new HomePage(driver);
    }

    public SongsPage getSongs() {
        return new SongsPage(driver);
    }

    public SongInformationPage getSongInfo() {
        return new SongInformationPage(driver);
    }

    private HomePage home;
    private SongsPage songs;
    private SongInformationPage songInfo;

    public SinatraSite(WebDriver driver) {
        this.driver = driver;
    }
}
