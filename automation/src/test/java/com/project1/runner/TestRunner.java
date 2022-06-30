package com.project1.runner;



import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.project1.Poms.Login;
import com.project1.Poms.Manager;
import com.project1.Poms.Tester;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features", glue="com/project1/steps", plugin = {"pretty", "html:src/test/resources/reports/html-reports.html"})


public class TestRunner {
   
    public static WebDriver driver;
    public static Login login;
    public static WebDriverWait wait;
    public static Manager manager;
    public static Tester tester;
    
    
    
 
    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        login = new Login(driver);
       
        manager = new Manager(driver);
        tester = new Tester(driver);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 5);
        
        
    }

    @AfterClass
    public static void teardown(){
        driver.quit();
        
    }

   

    

    
}
