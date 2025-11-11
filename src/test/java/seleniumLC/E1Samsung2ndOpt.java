package seleniumLC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class E1Samsung2ndOpt {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

        WebElement continueShopingBtn= driver.findElement(By.xpath("//button[@type='submit']"));
        continueShopingBtn.click();
        driver.findElement(By.id("nav-hamburger-menu")).click();
        WebElement seeMore=driver.findElement(By.xpath("(//a[@class='hmenu-item hmenu-compressed-btn'])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(seeMore));
        seeMore.click();
        WebElement tvAndStuff=driver.findElement(By.xpath("//ul[@class='hmenu-compress-section']/li[2]/a"));
        wait.until(ExpectedConditions.elementToBeClickable(tvAndStuff));
        tvAndStuff.click();
        WebElement tvNVideo=driver.findElement(By.xpath("(//a[text()='TV & Video'])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(tvNVideo));
        tvNVideo.click();
        driver.findElement(By.id("apb-browse-refinements-checkbox_5")).click();
        Select dd=new Select(driver.findElement(By.id("s-result-sort-select")));
        dd.selectByVisibleText("Price: High to Low");
        WebElement secondOpn= driver.findElement(By.xpath("(//div[@role='listitem'])[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(secondOpn));
        secondOpn.click();
        WebElement aboutInfo= driver.findElement(By.xpath("//h1[text()=' About this item ']"));


        driver.quit();
    }
}
