import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SS_TC1 {
    @Test
    public void Login() {


        WebDriverManager.getInstance(CHROME).setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rb-shoe-store.herokuapp.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        //Get the title of the page
        driver.getTitle();
        //close Browser
        driver.close();
    }
}
