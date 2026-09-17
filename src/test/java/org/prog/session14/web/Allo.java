package org.prog.session14.web;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Allo {

    @Test
    public void WebTestAllo() {

     WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://allo.ua/");
//        WebElement searchForm = driver.findElement(By.id("search-form__input"));
//        searchForm.sendKeys("IPhone");
//        WebElement button = driver.findElement(By.name("disabled"));
//        button.click();

    }
}
