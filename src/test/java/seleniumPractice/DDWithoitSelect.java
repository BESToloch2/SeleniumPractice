package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DDWithoitSelect {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php");

        WebElement dD= driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
        dD.click();

        List<WebElement> dDOpts=driver.findElements(By.cssSelector("ul.dropdown-menu a"));

        for (WebElement opt:dDOpts){
            if (opt.getText().equals("japan")){
                opt.click();
            }
        }



    }
}
