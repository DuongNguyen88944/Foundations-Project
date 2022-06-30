package com.project1.steps;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.project1.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateDefectSteps {




@Given("The manager is on the manager page")
    public void the_manager_is_on_the_manager_page() {
    TestRunner.driver.get("File://C:/Users/duong/Revature/Project1/Automation/automation/src/test/resources/webpages/manager-page.html");
}

@When("The manager enter in the Defect")
public void the_manager_enter_in_the_Defect() {
    TestRunner.manager.enterDefect("Automation Testing");
}
@When("The manager select the tester name")
public void the_manager_select_the_tester_name() {
    Select testerOption = new Select(TestRunner.driver.findElement(By.id("testers")));
      testerOption.selectByVisibleText("Bellatrix Lestrange");
}

@When("The manager click the assign button")
public void the_manager_click_the_assign_button() {
    TestRunner.manager.clickAssignButton();
}


@Then("The manager should see an alert")
public void the_manager_should_see_an_alert() {
   TestRunner.wait.until(ExpectedConditions.alertIsPresent());
   String text = TestRunner.driver.switchTo().alert().getText();
    Assert.assertEquals("Mission Assigned!", text);
    TestRunner.driver.switchTo().alert().accept();
}


}
