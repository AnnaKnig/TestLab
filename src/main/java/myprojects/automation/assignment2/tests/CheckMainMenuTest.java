package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckMainMenuTest extends BaseScript{

    public static void main(String[] args) throws InterruptedException {
       // TODO Script to check Main Menu items

        WebDriver driver = getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);




        WebElement login = driver.findElement(By.id("email"));
        login.sendKeys("webinar.test@gmail.com");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("Xcg7299bnSmMuRLp9ITw");
        WebElement loginbutton = driver.findElement(By.name("submitLogin"));
        loginbutton.click();

        WebElement ul_element = driver.findElement(By.cssSelector("#nav-sidebar > ul"));
        List<WebElement> allElements = ul_element.findElements(By.className("maintab"));
        int s = allElements.size();
        System.out.println(s);

        for(int i=0; i<s; i++) {
            System.out.println(i);

            allElements = driver.findElements(By.cssSelector(".menu > li.maintab,.main-menu > li.link-levelone"));
            allElements.get(i).click();
            String title = driver.getTitle();
            System.out.println("Page title is " + title);
            driver.navigate().refresh();
            Assert.assertEquals(title, driver.getTitle());


        }

        driver.close();


        /*


        // Dashboard

        WebElement dashboard = driver.findElement(By.cssSelector("#tab-AdminDashboard > a > span"));
        dashboard.click();
        //WebElement pagetitle = driver.findElement(By.cssSelector("#content > div.bootstrap > div > h2"));
        String title1 = driver.getTitle();
        System.out.println("Page title is " + title1);
        driver.navigate().refresh();
        Assert.assertEquals(title1, driver.getTitle());
       // Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Orders

        WebElement orders = driver.findElement(By.cssSelector("#subtab-AdminParentOrders > a > span"));
        orders.click();
        String title2 = driver.getTitle();
        System.out.println("Page title is " + title2);
        driver.navigate().refresh();
        Assert.assertEquals(title2, driver.getTitle());
        //Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        // Catalog

        WebElement catalog = driver.findElement(By.cssSelector("#subtab-AdminCatalog > a > span"));
        catalog.click();
        String title3 = driver.getTitle();
        System.out.println("Page title is " + title3);
        driver.navigate().refresh();
        Assert.assertEquals(title3, driver.getTitle());
        //Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Customer

        WebElement customer = driver.findElement(By.linkText("Клиенты"));
        customer.click();
        String title4 = driver.getTitle();
        System.out.println("Page title is " + title4);
        driver.navigate().refresh();
        Assert.assertEquals(title4, driver.getTitle());
        //Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Customer Service

        WebElement service = driver.findElement(By.cssSelector("#subtab-AdminParentCustomerThreads > a > span"));
        service.click();
        String title5 = driver.getTitle();
        System.out.println("Page title is " + title5);
        driver.navigate().refresh();
        Assert.assertEquals(title5, driver.getTitle());
        //Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Statistics

        WebElement statistics = driver.findElement(By.cssSelector("#subtab-AdminStats > a > span"));
        statistics.click();
        String title6 = driver.getTitle();
        System.out.println("Page title is " + title6);
        driver.navigate().refresh();
        Assert.assertEquals(title6, driver.getTitle());
        //Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        // Modules

        WebElement modules = driver.findElement(By.partialLinkText("Modules"));
        modules.click();
        String title7 = driver.getTitle();
        System.out.println("Page title is " + title7);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().refresh();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(title7, driver.getTitle());
        //Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Design

        WebElement design = driver.findElement(By.linkText("Design"));
        design.click();
        String title8 = driver.getTitle();
        System.out.println("Page title is " + title8);
        driver.navigate().refresh();
        Assert.assertEquals(title8, driver.getTitle());
        //Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        // Delivery

        WebElement delivery = driver.findElement(By.cssSelector("#subtab-AdminParentShipping > a > span"));
        delivery.click();
        String title9 = driver.getTitle();
        System.out.println("Page title is " + title9);
        driver.navigate().refresh();
        Assert.assertEquals(title9, driver.getTitle());
        //Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Payment

        WebElement payment = driver.findElement(By.cssSelector("#subtab-AdminParentPayment > a > span"));
        payment.click();
        String title10 = driver.getTitle();
        System.out.println("Page title is " + title10);
        driver.navigate().refresh();
        Assert.assertEquals(title10, driver.getTitle());
        //Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // International

        WebElement international = driver.findElement(By.cssSelector("#subtab-AdminInternational > a > span"));
        international.click();
        String title11 = driver.getTitle();
        System.out.println("Page title is " + title11);
        driver.navigate().refresh();
        Assert.assertEquals(title11, driver.getTitle());
        //Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        // Shop Parameters

        WebElement shopParam = driver.findElement(By.cssSelector("#subtab-ShopParameters > a > span"));
        shopParam.click();
        String title12 = driver.getTitle();
        System.out.println("Page title is " + title12);
        driver.navigate().refresh();
        Assert.assertEquals(title12, driver.getTitle());
        //Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        // Configuration

        WebElement configuration = driver.findElement(By.cssSelector("#subtab-AdminAdvancedParameters > a > span"));
        configuration.click();
        String title13 = driver.getTitle();
        System.out.println("Page title is " + title13);
        driver.navigate().refresh();
        Assert.assertEquals(title13, driver.getTitle());
        //Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        */



      //  driver.close();
    }
}
