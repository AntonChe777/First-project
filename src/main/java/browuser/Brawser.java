package browuser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

import static browuser.config.browser_TYPE;
import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class Brawser {
    public static WebDriver driver;
    public static WebDriver createDriver(){
        switch (browser_TYPE){
            case "chrome":
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Incorrect platform or browser name:" + browser_TYPE);
        }
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        return driver;
    }
}
