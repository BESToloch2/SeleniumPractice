package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class BasicCalendar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        WebElement login = driver.findElement(By.cssSelector("input#txtUsername"));
        login.sendKeys("Admin");

        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("Hum@nhrm123");

        WebElement logBut = driver.findElement(By.cssSelector("input#btnLogin"));
        logBut.click();
        driver.findElement(By.cssSelector("a#menu_leave_viewLeaveModule")).click();
        driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[1]")).click();

        WebElement monthDD= driver.findElement(By.cssSelector("select.ui-datepicker-month"));
        Select monthSel=new Select(monthDD);
        monthSel.selectByVisibleText("Jul");

        WebElement yearDD= driver.findElement(By.cssSelector("select.ui-datepicker-year"));
        Select yearSel=new Select(yearDD);
        yearSel.selectByVisibleText("2010");

        List<WebElement> table=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement cell:table){
            if (cell.getText().equals("25")){
               cell.click();
                break;
            }
        }




    }
}
