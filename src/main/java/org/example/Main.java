package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.crome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        WebElement usernameinput = driver.findElement(By.xpath("//input[@id=\"userName\"]"));
        usernameinput.click();
        usernameinput.sendKeys("Anton");
        WebElement useremailinput = driver.findElement(By.xpath("//input[@id='userEmail']"));
        useremailinput.sendKeys("gg@yandex.com");
        WebElement useradressinput = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        useradressinput.sendKeys("Kursk");
        WebElement useradresinput = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        useradresinput.sendKeys("Kursk1");
        WebElement userbattoninput = driver.findElement(By.xpath("//button[@id='submit']"));
        userbattoninput.click();
        String name;
        WebElement usernameoutput = driver.findElement(By.xpath("//p[@id='name']"));
        usernameoutput.getRect();
        WebElement useremailoutput = driver.findElement(By.xpath("//p[@id='email']"));
        useremailoutput.getRect();
        WebElement useradressoutput = driver.findElement(By.xpath("//p[@id='Current Address']"));
        useradressoutput.getRect();
        WebElement useradresoutput = driver.findElement(By.xpath("//p[@id='permanentAddress']"));
        useradresoutput.getRect();
        name = usernameoutput.getText();
        String email = useremailoutput.getText();
        String adress = useradressoutput.getText();
        String adres = useradresoutput.getText();

    }
}