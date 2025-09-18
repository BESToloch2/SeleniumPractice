package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFramr {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/handle-iframe.php");

        driver.switchTo().frame(0);

        WebElement topicTB= driver.findElement(By.xpath("//input[@name='Topic']"));
        topicTB.sendKeys("Java Selenium");


        driver.switchTo().defaultContent();

        driver.switchTo().frame("dropdownIframe");
        WebElement dD= driver.findElement(By.cssSelector("select#animals"));
        Select sel=new Select(dD);
        sel.selectByValue("babycat");

        driver.switchTo().defaultContent();

        driver.switchTo().frame(0);
        WebElement frameNum3=driver.findElement(By.cssSelector("iframe#checkboxIframe"));
        driver.switchTo().frame(frameNum3);
        WebElement chbFrame3= driver.findElement(By.cssSelector("input.cb1-element"));
        chbFrame3.click();







    }
}
