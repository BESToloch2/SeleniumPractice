package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        WebElement b1= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        b1.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        WebElement b2= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        b2.click();
        Thread.sleep(2000);
        alert.dismiss();

        WebElement b3= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        b3.click();
        Thread.sleep(2000);
        alert.sendKeys("wqekqwdqwfjklqjfklj");
        Thread.sleep(2000);
        alert.accept();





    }
}
