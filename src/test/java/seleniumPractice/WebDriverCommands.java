package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.navigate().to("https://syntaxprojects.com/");
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.quit();



    }
}
