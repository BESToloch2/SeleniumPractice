package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CalendarWithNavigationBar {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://syntaxprojects.com/bootstrap-date-picker-demo.php");

        driver.findElement(By.xpath("//input[@id='start_date']")).click();

        WebElement currentDate= driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[2]"));

        //click next
        WebElement nextButton=driver.findElement(By.xpath("//table[@id='table-day']/thead/tr[2]/th[3]"));

            boolean notFound=true;
            while (notFound){

                if(currentDate.getText().equals("April 2026")){
                    notFound=false;
                }else {
                    nextButton.click();
                }
            }

            List<WebElement> allDays=driver.findElements(By.xpath("//table[@id='table-day']/tbody/tr/td"));
            for (WebElement day:allDays){
                if (day.getText().equals("3")){
                    day.click();
                    break;
                }
            }


    }
}
