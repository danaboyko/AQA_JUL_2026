package org.prog.session14.web;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Allo {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {

     ChromeOptions options = new ChromeOptions();
     options.addArguments("--disable-notifications");
     options.addArguments("start-maximized");
     driver = new ChromeDriver(options);
}
     @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

     @Test
    public void WebTestAllo() {

       WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://allo.ua/");
        WebElement searchForm = driver.findElement(By.id("search-form__input"));
        searchForm.sendKeys("IPhone");
        searchForm.sendKeys(Keys.ENTER);

    }
}
