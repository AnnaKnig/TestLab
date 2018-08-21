package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseScript {

    public static void main(String[] args) throws InterruptedException {
        // TODO Script to execute login and logout steps

        WebDriver driver = getDriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");


        WebElement login = driver.findElement(By.id("email"));
        login.sendKeys("webinar.test@gmail.com");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement loginbutton = driver.findElement(By.name("submitLogin"));
        loginbutton.click();
        Thread.sleep(2000);
        WebElement profileIcon = driver.findElement(By.xpath("//*[@id=\"employee_infos\"]/a/span/img"));
        profileIcon.click();
        WebElement logoutbutton = driver.findElement(By.id("header_logout"));
        logoutbutton.click();
        driver.close();
    }
}
