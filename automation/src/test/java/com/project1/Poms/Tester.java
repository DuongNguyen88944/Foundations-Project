package com.project1.Poms;








import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tester {
   
  
    @FindBy(id = "checkDefects")
    public WebElement defectsButton;

    @FindBy(id = "defectTable")
    public WebElement defectsTable;

    @FindBy(id = "defectId")
    public WebElement defectId;

   
    
    @FindBy(id = "saveButton")
    public WebElement saveButton;
   
    
    public Tester(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void checkButton(){
        this.defectsButton.click();
    }

    public void defectIdInput(String idInput){
        this.defectId.sendKeys(idInput);
    }
    
    public void saveButton(){
        this.saveButton.click();
    }

   

   

   
}
