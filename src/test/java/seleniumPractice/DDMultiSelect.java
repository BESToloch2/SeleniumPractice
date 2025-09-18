package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DDMultiSelect {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        WebElement dD= driver.findElement(By.cssSelector("select#multi-select"));
        Select sel=new Select(dD);
        sel.selectByIndex(0);
        sel.selectByValue("Texas");
        sel.selectByVisibleText("New Jersey");

        sel.deselectAll();






    }
}
