import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class StaticTable {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        List<WebElement> allRows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));

        for (WebElement row:allRows){
            System.out.println(row.getText());
        }

        List<WebElement> row3=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[3]"));
        for (WebElement row:row3){
            System.out.println(row.getText());
        }

        List<WebElement> statuses=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));

        int count=1;
        for (WebElement status:statuses){
            if (status.getText().equals("in progress")){
                WebElement particularRow=driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr["+count+"]"));
                System.out.println(particularRow.getText());
            }
            count++;
        }



    }
}
