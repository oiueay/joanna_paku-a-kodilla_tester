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
        int searchIn2 = storePom.enterSth("School", 1);
        int searchIn3 = storePom.enterSth("Brand", 1);
        int searchIn4 = storePom.enterSth("Business", 0);
        int searchIn5 = storePom.enterSth("Gaming", 1);
        int searchIn6 = storePom.enterSth("Powerful", 0);
        assertEquals(2, searchIn);
        assertEquals(1, searchIn2);
        assertEquals(1, searchIn3);
        assertEquals(0, searchIn4);
        assertEquals(1, searchIn5);
        assertEquals(0, searchIn6);
    }
}

////Następnie rozbuduj testy o weryfikację, czy wyszukiwarka ignoruje wielkość znaków przy wyszukiwaniu
//// (ilość wyników powinna być taka sama niezależnie od wielkości znaków).