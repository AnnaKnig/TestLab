package myprojects.automation.assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseScript {

    /**
     *
     * @return New instance of {@link WebDriver} object.
     */
    public static WebDriver getDriver() {
        // TODO return  WebDriver instance

   //     System.setProperty("webdriver.chrome.driver",BaseScript.class.getResource("/chromedriver").getPath());
        System.setProperty("webdriver.chrome.driver",
                "/Users/admin/Desktop/AQ/HomeWork2/qatestlab_automation-lecture-2-1209ed550f7e 3/src/main/resources/chromedriver");
        return  new ChromeDriver();

    }
}
