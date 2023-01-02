package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class KodillaStorePom {

    @FindBy(css = "input[name='search']")
    WebElement searchField;

   @FindAll({@FindBy(css = "#elements-wrapper > div")})
    public List<WebElement> results;
    WebDriver driver;

    private int numberOfResults;

    public KodillaStorePom(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public int enterSth(String search, int numberOfResults) throws InterruptedException {
        this.numberOfResults = numberOfResults;
        searchField.clear();
        searchField.sendKeys(search);
        Thread.sleep(10000);
        System.out.println(results.size() == numberOfResults);
        System.out.println(results.size());
        return numberOfResults;
    }
}


// zbudować selektor css dla div zawierającego listę innych divów-> stackoverflow


