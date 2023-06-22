/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
/**
 *
 * @author saroven
 */


public class LoginPageTest {
    
    private String url;
    private WebDriver driver;
    public LoginPageTest(String url) {
        this.url = url;
        System.setProperty("webdriver.chrome.driver", "/home/saroven/Downloads/chromedriver_linux64/chromedriver");

        
    }
    
    
    public boolean test(String email, String password) throws InterruptedException{
        this.driver = new ChromeDriver();
        this.driver.get(this.url);
        
        this.driver.findElement(By.id("email")).sendKeys(email);

        Thread.sleep(1000);

        this.driver.findElement(By.id("password")).sendKeys(password);

        Thread.sleep(2000);
        
        this.driver.findElement(By.xpath("//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div/div[2]/form/div[4]/button")).click();
        
        String actual = this.driver.getCurrentUrl();
        
        this.driver.close();
        
        return "http://127.0.0.1:8000/".equals(actual);
                
    }
}
