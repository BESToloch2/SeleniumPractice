package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/selenium_commands_selector.php");

        WebElement textInputTB= driver.findElement(By.cssSelector("input#textInput"));
        textInputTB.clear();
        textInputTB.sendKeys("TextBox is cleared");

        WebElement rB1= driver.findElement(By.xpath("//input[@type='radio' and @value='option1']"));
        boolean statusRB1=rB1.isSelected();
        System.out.println("Status of radio button1 is: "+statusRB1);
        rB1.click();
        statusRB1=rB1.isSelected();
        System.out.println("Status of radio button1 is: "+statusRB1);
        WebElement rB2= driver.findElement(By.xpath("//input[@type='radio' and @value='option2']"));
        boolean statusRB2=rB2.isEnabled();
        System.out.println("Status of radio button2 is: "+statusRB2);







    }
}
