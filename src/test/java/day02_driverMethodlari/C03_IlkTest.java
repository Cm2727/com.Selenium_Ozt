package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {
        /*  1- https://www.amazon.com url'ine gidin
            2- Basligin Amazon kelimesi icerdigini test edin
            3- Url'in "https://www.amazon.com" a esit oldugunu test edin
            4- sayfayi kapatin
         */

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //  1- https://www.amazon.com url'ine gidin
        driver.get("https://www.amazon.com");


        //  2-Basligin Amazon kelimesi icerip icermedigini test edin
        String actualTitel = driver.getTitle();
        String ararnanKelime = "Amazon";
        if (actualTitel.contains(ararnanKelime)) {
            System.out.println("Titel " + ararnanKelime + "'yi iceriyor, titel testi PASSED");
        } else System.out.println("Titel " + ararnanKelime + "'yi icermiyor, titel testi FAILED");

       // System.out.println("actualTitel = " + actualTitel);


        //    3- Url'in "https://www.amazon.com" a esit oldugunu test edin
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com/";
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("url testi PASSED");
        } else System.out.println("actual Url: " + actualUrl + " beklenen URL'den farkli, test FAILED");

        // 4- sayfayi kapatin

        driver.close();


    }

}
