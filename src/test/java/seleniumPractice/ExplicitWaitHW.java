package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitHW {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-explicit-wait.php");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement b3= driver.findElement(By.cssSelector("button#display_button"));
        b3.click();
        WebElement enableButton= driver.findElement(By.xpath("//button[text()='Enabled']"));
        wait.until(ExpectedConditions.visibilityOf(enableButton));
        enableButton.click();

        WebElement b4= driver.findElement(By.cssSelector("button#enable_button"));
        b4.click();
        WebElement clickableButton= driver.findElement(By.xpath("//button[text()='Button']"));
        wait.until(ExpectedConditions.elementToBeClickable(clickableButton));
        clickableButton.click();

        WebElement b5 = driver.findElement(By.cssSelector("button#checkbox_button"));
        b5.click();
        WebElement chb= driver.findElement(By.cssSelector("input#checkbox"));
        wait.until(ExpectedConditions.elementToBeSelected(By.cssSelector("input#checkbox")));
        System.out.println("Status of the checkBox is: "+chb.isSelected());





    }
}

