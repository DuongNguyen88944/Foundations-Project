package com.project1.steps;


import org.openqa.selenium.support.ui.ExpectedConditions;

import com.project1.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
@Given("The employee is on the login page")
    public void the_employee_is_on_the_login_page() {
    TestRunner.driver.get("File://C:/Users/duong/Revature/Project1/Automation/automation/src/test/resources/webpages/login-page.html");
    }
@When("The employee click the Login button")
    public void the_employee_click_the_Login_button() {
    TestRunner.login.clickButton();
}

// Manager Login Steps

@When("The manager enters his correct username")
    public void the_manager_enters_his_her_correct_username() {
    TestRunner.login.enterUsername("Voldemort");
}
@When("The manager enters his correct password")
    public void the_manager_enters_his_her_correct_password() {
    TestRunner.login.enterPassword("password");
}

@Then("The manager should be logged in to the manager home page")
    public void the_manager_should_be_logged_in_to_the_manager_home_page() {
    TestRunner.wait.until(ExpectedConditions.titleIs("Lord Voldemort"));
    String title = TestRunner.driver.getTitle();
    Assert.assertEquals("Lord Voldemort", title);
}

// Tester login steps

@When("The tester enters his correct username")
    public void the_tester_enters_his_her_correct_username() {
    TestRunner.login.enterUsername("Bellatrix");
}
@When("The tester enters his correct password")
    public void the_tester_enters_his_her_correct_password() {
    TestRunner.login.enterPassword("password");
}

@Then("The tester should be logged in to the tester home page")
    public void the_tester_should_be_logged_in_to_the_tester_home_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Bellatrix Lestrange"));
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Bellatrix Lestrange", title);
}



















}
