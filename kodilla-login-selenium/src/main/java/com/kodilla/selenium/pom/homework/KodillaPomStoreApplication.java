package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaPomStoreApplication {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\IdeaProjects\\kodilla-course\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/login");
        KodillaStorePom storePom = new KodillaStorePom(driver);
        storePom.enterSth("NoteBook", 2);
        storePom.enterSth("School", 1);
        storePom.enterSth("Brand", 1);
        storePom.enterSth("Business", 0);
        storePom.enterSth("Gaming", 1);
        storePom.enterSth("Powerful", 0);
    }
}


