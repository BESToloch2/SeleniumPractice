package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/upload-image.php");

        WebElement b1= driver.findElement(By.id("image-file"));
        b1.sendKeys("/Users/oleksandrmazin/QAProject/SeleniumPractice/src/screenshot/img.png");
    }
}
