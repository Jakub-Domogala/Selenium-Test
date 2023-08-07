package com.domo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.GoogleMainPage;

public class Main {
    static WebDriver driver;
    static String BASE_URL = "https://www.google.com";
    static GoogleMainPage mainPage;

    public static void main(String[] args) {
        try {
            System.out.println("Hello world!");


            System.setProperty(
                    "webdriver.chrome.driver",
                    "C:\\Users\\kubad\\Desktop\\selenium1Tutorial\\selenium1\\src\\main\\resources\\chromedriver.exe"
            );

            driver = new ChromeDriver();
            mainPage = PageFactory.initElements(driver, GoogleMainPage.class);
            driver.get(BASE_URL);

            Thread.sleep(1000);


            Thread.sleep(1000);
            mainPage.searchForText("cats");


            Thread.sleep(50000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.close();


    }
}