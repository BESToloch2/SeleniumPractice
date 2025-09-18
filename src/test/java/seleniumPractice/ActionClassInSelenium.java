package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class ActionClassInSelenium {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/simple_context_menu.php");

        Actions actions=new Actions(driver);
        WebElement b1=driver.findElement(By.xpath("//button[text()='Hover me!']"));
        actions.moveToElement(b1).perform();

        WebElement b2= driver.findElement(By.cssSelector("button#show_context_menu"));
        actions.contextClick(b2).perform();

        WebElement dragable= driver.findElement(By.id("draggable"));
        WebElement dropable=driver.findElement(By.id("droppable"));
        actions.dragAndDrop(dragable,dropable).perform();

    }
}
