import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class IlkClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","recources/drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com");
//deneme
//deneme
//deneme
        System.out.println("deneme");
        System.out.println("deneme 2");
        System.out.println("deneme 3");
        System.out.println("deneme 4");
        System.out.println("deneme 5");
        System.out.println("deneme6");

    }
}
