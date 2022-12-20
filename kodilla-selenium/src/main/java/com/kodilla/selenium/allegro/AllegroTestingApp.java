package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"opbox-gdpr-consents-modal\"]/div/div[2]/div/div[2]/button[1]")).click();

        Thread.sleep(2000);

        WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div[3]/header/div/div/div/div/form/div[3]/div/select"));
        Select elementSelect = new Select(element);
        elementSelect.selectByIndex(3);

        Thread.sleep(2000);

        WebElement inputField = driver.findElement(By.name("string"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
  }
}
