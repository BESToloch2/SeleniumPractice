package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ImplicitWait {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/synchronization-waits.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement b1= driver.findElement(By.cssSelector("button#show_text_synchronize"));
        b1.click();
        WebElement text= driver.findElement(By.cssSelector("div.card-body p"));
        System.out.println(text.getText());

        WebElement b2= driver.findElement(By.cssSelector("#show_text_synchronize_02"));
        b2.click();

        List<WebElement> opts=driver.findElements(By.xpath("//input[@type='radio']"));
        for (WebElement opt:opts){
            if (opt.getAttribute("value").equals("Female")){
                opt.click();
            }
        }



    }
}
