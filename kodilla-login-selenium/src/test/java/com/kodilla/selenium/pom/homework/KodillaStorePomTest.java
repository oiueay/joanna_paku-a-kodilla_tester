package com.kodilla.selenium.pom.homework;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KodillaStorePomTest {

    KodillaStorePom storePom;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new KodillaStorePom(driver);
    }
    @Test
    public void testStorePage_CheckPositiveValidation() throws InterruptedException {
        int searchIn = storePom.enterSth("Notebook", 2);
        int searchIn2 = storePom.enterSth("NotEbooK", 2);
        int searchIn3 = storePom.enterSth("SchOOl", 1);
        int searchIn4 = storePom.enterSth("School", 1);
        int searchIn5 = storePom.enterSth("Brand", 1);
        int searchIn6 = storePom.enterSth("BRAND", 1);
        int searchIn7 = storePom.enterSth("Business", 0);
        int searchIn8 = storePom.enterSth("BusIneSS", 0);
        int searchIn9 = storePom.enterSth("Gaming", 1);
        int searchIn10 = storePom.enterSth("GAmiNg", 1);
        int searchIn11 = storePom.enterSth("Powerful", 0);
        int searchIn12 = storePom.enterSth("POWerfUl", 0);
        assertEquals(2, searchIn);
        assertEquals(2, searchIn2);
        assertEquals(1, searchIn3);
        assertEquals(1, searchIn4);
        assertEquals(1, searchIn5);
        assertEquals(1, searchIn6);
        assertEquals(0, searchIn7);
        assertEquals(0, searchIn8);
        assertEquals(1, searchIn9);
        assertEquals(1, searchIn10);
        assertEquals(0, searchIn11);
        assertEquals(0, searchIn12);
    }
}