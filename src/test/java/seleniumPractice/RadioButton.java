package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo-homework.php");

        WebElement hideButton= driver.findElement(By.cssSelector("button#showRadioButtons"));
        WebElement enableButton= driver.findElement(By.cssSelector("button#enabledFruitradio"));
        List<WebElement> seasonOpt=driver.findElements(By.xpath("//input[@name='season']"));

        for (WebElement season:seasonOpt){

            if (!season.isEnabled()) {
                enableButton.click();
            }

            if (!season.isDisplayed()){
                hideButton.click();
            }

            season.click();
            Thread.sleep(2000);
        }






    }
}
