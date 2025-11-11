package seleniumLC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class E2Google {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement serchbar=driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']"));
        serchbar.sendKeys("5+5");
        serchbar.sendKeys(Keys.ENTER);

        WebElement result=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cwos")));
        String text= result.getText().trim();
        if (text.equalsIgnoreCase("10")){
            System.out.println("result is correct");
        }
    }
}
