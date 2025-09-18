package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DDSingleSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        WebElement dD= driver.findElement(By.cssSelector("select#select-demo"));
        Select sel=new Select(dD);

        sel.selectByIndex(1);
        Thread.sleep(2000);
        sel.selectByValue("Wednesday");
        Thread.sleep(2000);
        sel.selectByVisibleText("Friday");

        List<WebElement> dDOpt=sel.getOptions();

        for (WebElement opt:dDOpt){
            System.out.println(opt.getText());
        }







    }
}
