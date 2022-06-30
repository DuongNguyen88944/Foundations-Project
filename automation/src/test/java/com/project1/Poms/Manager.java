package com.project1.Poms;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manager {

    @FindBy(id = "createDefects")
    public WebElement defectInput; 

    @FindBy(id = "testersInput")
    public WebElement testerInput;

    @FindBy(id = "assignButton" )
    public WebElement assignButton;

    public Manager(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void enterDefect(String defect){
        this.defectInput.sendKeys(defect);
    }

  
    public void clickAssignButton(){
        this.assignButton.click();
    }

   

}

