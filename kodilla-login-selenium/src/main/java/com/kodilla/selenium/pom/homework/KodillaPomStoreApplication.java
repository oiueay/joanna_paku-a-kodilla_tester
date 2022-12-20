package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaPomStoreApplication {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\IdeaProjects\\kodilla-course\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        KodillaStorePom storePom = new KodillaStorePom(driver);
        storePom.noteBook("NoteBook");
        storePom.noteBook("school");
//        driver.close();
    }
}


