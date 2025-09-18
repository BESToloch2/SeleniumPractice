package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement bt1= driver.findElement(By.cssSelector("button#show_alert"));
        bt1.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert=driver.switchTo().alert();
       alert.accept();

       WebElement b2= driver.findElement(By.cssSelector("button#changetext_button"));
       WebElement text= driver.findElement(By.cssSelector("h2#headingtext"));
        System.out.println("Old text: "+text.getText());
       b2.click();
       wait.until(ExpectedConditions.textToBe(By.cssSelector("h2#headingtext"),"Ssyntaxtechs"));
        System.out.println("New text: "+text.getText());





    }
}
