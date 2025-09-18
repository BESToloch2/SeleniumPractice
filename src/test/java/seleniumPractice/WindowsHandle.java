package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.Set;

public class WindowsHandle {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");

        WebElement inst= driver.findElement(By.xpath("//a[text()=' Follow On Instagram ']"));
        WebElement face= driver.findElement(By.xpath("//a[text()=' Like us On Facebook ']"));
        inst.click();
        face.click();

        Set<String> allHandles = driver.getWindowHandles();

        for ( String handle:allHandles ){

            driver.switchTo().window(handle);
            String url= driver.getCurrentUrl();
            if (url.equals("https://www.facebook.com/syntaxtechs/")){
                WebElement emailTB= driver.findElement(By.cssSelector("input#_r_3_"));
                emailTB.sendKeys("befanalex2@gmail.com");
                break;
            }
        }





    }
}
