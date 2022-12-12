package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AllegroTestingApp {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        WebElement element = driver.findElement(By.xpath("//*[contains(@class,"mp7g")]/select[0]"));
        Select elementSelect = new Select(element);
        elementSelect.selectByIndex(2);
    }
}
