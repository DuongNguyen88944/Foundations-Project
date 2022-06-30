// @Given("The tester is on the tester page and the defect already generated")
//     public void the_tester_is_on_the_tester_page_and_the_defect_already_generated() {
//         TestRunner.driver.get("File://C:/Users/duong/Revature/Project1/Automation/automation/src/test/resources/webpages/tester-page.html");
//         TestRunner.tester.clickButton();
//         Assert.assertTrue(TestRunner.tester.displayTable());
// }
//     @When("The tester enter the defect ID")
//     public void the_tester_enter_the_defect_ID() {
//         TestRunner.tester.defectIdInput("88087");
// }

//     @When("The tester select reject or accept")
//     public void the_tester_select_reject_or_accept() {
        
// }

//     @When("The tester select one of the actions")
//     public void the_tester_select_one_of_the_action(Integer int1) {
       
// }
//     @When("The tester click on the save button")
//     public void the_tester_click_on_the_save_button() {
//         TestRunner.tester.saveButton();
// }
//     @Then("The defect should be updated")
//     public void the_defect_should_be_updated() {
    
// }

// Scenario: As a tester I want to be able to update the defect
//     Given The tester is on the tester page and the defect already generated
//     When The tester enter the defect ID
//     When The tester select reject or accept
//     When The tester select one of the actions
//     When The tester click on the save button 
//     Then The defect should be updated 

 public Boolean displayTable(){
        return this.displayDefectsTable.isDisplayed();

        Assert.assertTrue(TestRunner.tester.displayTable());

        // driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);