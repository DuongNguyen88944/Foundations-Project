package com.project1.steps;



import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.project1.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterSteps {
   
    
    @Given("The tester is on the tester page")
    public void the_tester_is_on_the_tester_page() {
       TestRunner.driver.get("File://C:/Users/duong/Revature/Project1/Automation/automation/src/test/resources/webpages/bellatrix-lestrange.html");
    }
    
    @When("The tester click on the Check for defect button")
    public void the_tester_click_on_the_Check_for_defect_button() {
        TestRunner.tester.checkButton();
    }
    @Then("The tester should be able to see the assigned defect")
    public void the_tester_should_be_able_to_see_the_assigned_defect() {
         TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("defectTable")));
    }
   
    @Given("The tester is on the tester page and see the assigned defect")
    public void the_tester_is_on_the_tester_page_and_see_the_assigned_defect() {
        TestRunner.driver.get("File://C:/Users/duong/Revature/Project1/Automation/automation/src/test/resources/webpages/bellatrix-lestrange.html");
        TestRunner.tester.checkButton();
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("defectTable")));
}
    
// Step to reject the defect
    @When("The tester enter the defect ID to reject")
    public void the_tester_enter_the_defect_ID_to_reject() {
        TestRunner.tester.defectIdInput("41699");
}
    @When("The tester select reject from the selector")
    public void the_tester_select_reject_from_the_selector() {
      Select rejectOption = new Select(TestRunner.driver.findElement(By.id("optionAR")));
      rejectOption.selectByVisibleText("Reject");
       
    }
    @When("The tester click the save button")
    public void the_tester_click_the_save_button() {
        TestRunner.tester.saveButton();
}   
@Then("The defect should be rejected")
    public void the_defect_should_be_rejected() {
        TestRunner.driver.switchTo().alert().accept();
}


// Step to accept the defect
    @When("The tester enter the defect ID to accept")
    public void the_tester_enter_the_defect_ID_to_accept() {
        TestRunner.tester.defectIdInput("96553");
}
    @When("The tester select accept from the selector")
    public void the_tester_select_accept_from_the_selector() {
        Select acceptOption = new Select(TestRunner.driver.findElement(By.id("optionAR")));
        acceptOption.selectByVisibleText("Accept");
}
    @When("The tester select one of the action option")
    public void the_tester_select_one_of_the_action_option() {
        Select actionOption = new Select(TestRunner.driver.findElement(By.id("Action")));
        actionOption.selectByVisibleText("Shelve");
}
    @Then("The defect should be accepted and updated")
    public void the_defect_should_be_accepted_and_updated() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String text = TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("Mission Accomplished!", text);
        TestRunner.driver.switchTo().alert().accept();
}










}
