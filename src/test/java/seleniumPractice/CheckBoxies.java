package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxies {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo-homework.php");

        WebElement chb1= driver.findElement(By.cssSelector("input#newsletter"));
        chb1.click();

        List<WebElement> chbOpt=driver.findElements(By.cssSelector("input.cb-element"));
        for (WebElement chb:chbOpt){
            if (!chb.isSelected()){
                chb.click();
                Thread.sleep(2000);
            }
        }

        List<WebElement> cb2Opt=driver.findElements(By.cssSelector("div.interest_section input.checkbox-field"));
        WebElement hideBut= driver.findElement(By.cssSelector("button#toggleCheckboxButtons"));
        for (WebElement cb2:cb2Opt){
            if (!cb2.isDisplayed()) {
                hideBut.click();
                Thread.sleep(2000);

                if (cb2.getAttribute("value").equals("Music")) {
                    cb2.click();
                    Thread.sleep(2000);
                }
            }else {
                if (cb2.getAttribute("value").equals("Music")) {
                    cb2.click();
                    Thread.sleep(2000);
                }
            }
        }






    }
}
