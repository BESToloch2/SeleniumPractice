package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/input-form-locator.php");

        WebElement fn = driver.findElement(By.id("first_name"));
        fn.sendKeys("John");
         WebElement ln= driver.findElement(By.name("last_name"));
         ln.sendKeys("doe");
         WebElement email= driver.findElement(By.name("email"));
         email.sendKeys("sadda@gmail.com");
         WebElement button= driver.findElement(By.id("submit_button"));
         button.click();
         WebElement clickHere= driver.findElement(By.linkText("Click Here."));
         clickHere.click();
         WebElement link = driver.findElement(By.partialLinkText("ink"));

    }
}
