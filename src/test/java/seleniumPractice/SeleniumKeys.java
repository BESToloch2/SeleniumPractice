package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumKeys {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/keypress.php");

        WebElement tB= driver.findElement(By.cssSelector("input.form-control"));
        tB.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        tB.sendKeys(Keys.TAB);
    }
}
