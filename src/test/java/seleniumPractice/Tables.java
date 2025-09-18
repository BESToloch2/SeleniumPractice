package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Tables {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement row2=driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[2]"));
        System.out.println(row2.getText());
        System.out.println();
    }
}
