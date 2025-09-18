package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScript {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        String []st={"a","b","c"};
        driver.get("https://syntaxprojects.com/");
        String url=driver.getCurrentUrl();
        System.out.println("Currant url : "+url);
        driver.quit();
    }
}
