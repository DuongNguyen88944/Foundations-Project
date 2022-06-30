package com.project1.Poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    
    
    @FindBy(id = "Username")
    public WebElement usernameInput; 

    @FindBy(id = "Password")
    public WebElement passwordInput;

    @FindBy(tagName = "button")
    public WebElement loginButton;

    public Login(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void enterUsername(String username){
        this.usernameInput.sendKeys(username);
    }

    public void enterPassword(String password){
        this.passwordInput.sendKeys(password);
    }

    public void clickButton(){
        this.loginButton.click();
    }

}
