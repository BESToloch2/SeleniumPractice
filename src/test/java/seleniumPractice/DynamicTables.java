package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DynamicTables {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        WebElement login= driver.findElement(By.cssSelector("input#txtUsername"));
        login.sendKeys("Admin");

        WebElement password= driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("Hum@nhrm123");

        WebElement logBut= driver.findElement(By.cssSelector("input#btnLogin"));
        logBut.click();

        driver.findElement(By.cssSelector("a#menu_pim_viewPimModule")).click();

        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        int count=1;
        for (WebElement ID:allIDs){
            if (ID.getText().equals("1234567999")){
                driver.findElement(By.xpath("//table/tbody/tr["+count+"]/td[1]")).click();
                break;
            }
            count++;
        }





    }
}
