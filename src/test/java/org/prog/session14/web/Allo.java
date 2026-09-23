package org.prog.session14.web;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.time.Duration;

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
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.manage().window().maximize();
        driver.get("https://allo.ua/");
        WebElement searchForm = driver.findElement(By.id("search-form__input"));
        searchForm.sendKeys("IPhone 16");
        searchForm.sendKeys(Keys.ENTER);

         WebElement pictures = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("product-card__pictures")));

         Actions actions = new Actions(driver);
         actions.moveToElement(pictures);
         actions.click();
         actions.perform();
         WebElement codeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("p-view__header-content")));
         WebElement priceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("v-pb")));

         System.out.println("Код товару:" + codeElement.getText());
         System.out.println("Ціна товару:"+ priceElement.getText());


    }
}
