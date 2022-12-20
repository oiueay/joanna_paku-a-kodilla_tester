package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class KodillaStorePom {

    @FindBy(css = "input[type='text']")
    WebElement text;

    WebDriver driver;

    public KodillaStorePom(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void noteBook(String noteBook) {
        text.sendKeys(noteBook);
        text.click();
    }

    WebDriverWait wait = new WebDriverWait(driver, 20);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("my_Class")));

    public void school(String school) {
        text.sendKeys(school);
        text.click();
    }
}
