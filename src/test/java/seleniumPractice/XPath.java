package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath-homework.php");

        WebElement yourHobbieTB= driver.findElement(By.xpath("//input[@id='yourHobbiesId']"));
        yourHobbieTB.sendKeys("Gym");
        WebElement clickHereBut= driver.findElement(By.xpath("//button[text()='Click Here']"));
        clickHereBut.click();
        WebElement favMovieTB=driver.findElement(By.xpath("//input[contains(@name,'favorite')]"));
        favMovieTB.sendKeys("Naruto");
        WebElement paragraf= driver.findElement(By.xpath("//label[contains(text(),'Lorem ipsum')]"));
        System.out.println(paragraf.getText());

    }
}
