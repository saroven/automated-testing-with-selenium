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


public class RegistrationPageTest {
    
    private String url;
    private WebDriver driver;
    public RegistrationPageTest(String url) {
        this.url = url;
        System.setProperty("webdriver.chrome.driver", "/home/saroven/Downloads/chromedriver_linux64/chromedriver");

        
    }
    
    
    public boolean test(String name, String email, String password,  String address, String mobile, String gender) throws InterruptedException{
        this.driver = new ChromeDriver();
        this.driver.get(this.url);
        
        
        this.driver.findElement(By.id("name")).sendKeys(name);
        
        this.driver.findElement(By.id("email")).sendKeys(email);
        

        this.driver.findElement(By.id("password")).sendKeys(password);
        
        this.driver.findElement(By.id("confirmPassword")).sendKeys(password);

        
        this.driver.findElement(By.id("address")).sendKeys(address);
        
        this.driver.findElement(By.id("mobile")).sendKeys(mobile);
        
        this.driver.findElement(By.id("gender")).sendKeys(gender);
        
        Thread.sleep(2000);

        
        this.driver.findElement(By.xpath("//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div/div[2]/form/div[5]/div/button")).click();
        
        String actual = this.driver.getCurrentUrl();
        
        this.driver.close();
        
        return "http://127.0.0.1:8000/".equals(actual);
                
    }
}
