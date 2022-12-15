package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppCSS {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");


        driver.findElement(By.xpath("//*[@id=\"opbox-gdpr-consents-modal\"]/div/div[2]/div/div[2]/button[1]")).click();


        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.main-wrapper > div > div > div > div > div > div > div:nth-child(3) > header > div > div > div > div > form > div.mpof_5r.mpof_ki_s.mp7g_oh.m389_6m.mjyo_6x.mse2_40.mp4t_0.mr3m_0.mli2_0.mx7m_1.m911_co.mnyp_co.mdwl_co.mefy_5r.msts_pt.mlkp_6x._535b5_iZ-SS > div > select")));

        WebElement element = driver.findElement(By.cssSelector("body > div.main-wrapper > div > div > div > div > div > div > div:nth-child(3) > header > div > div > div > div > form > div.mpof_5r.mpof_ki_s.mp7g_oh.m389_6m.mjyo_6x.mse2_40.mp4t_0.mr3m_0.mli2_0.mx7m_1.m911_co.mnyp_co.mdwl_co.mefy_5r.msts_pt.mlkp_6x._535b5_iZ-SS > div > select"));
        Select elementSelect = new Select(element);
        elementSelect.selectByIndex(3);

        Thread.sleep(2000);

        WebElement drone = driver.findElement(By.cssSelector("#string"));
        drone.sendKeys("Mavic mini");
        drone.click();

        List<WebElement> drones = driver.findElements(By.cssSelector("#search-results > div:nth-child(5) > div > div > div:nth-child(1) > div > div > section:nth-child(1) > article:nth-child(1) > div > div"));
        System.out.println("Number of elements:" +drones.size());

        for (int i=0; i<drones.size();i++){
            System.out.println("text:" + drones.get(i).getText());
        }
    }
}
