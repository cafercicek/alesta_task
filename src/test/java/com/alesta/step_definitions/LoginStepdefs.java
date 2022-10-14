package com.alesta.step_definitions;

import com.alesta.pages.HomePage;
import com.alesta.pages.LoginPage;
import com.alesta.pages.UserAdd;
import com.alesta.utilities.BrowserUtils;
import com.alesta.utilities.ConfigurationReader;
import com.alesta.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Map;

public class LoginStepdefs {
    LoginPage loginPage= new LoginPage();
    HomePage homePage= new HomePage();
    UserAdd userAdd = new UserAdd();
    @Given("navigate login page")
    public void navigateLoginPage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @And("enter username {string}")
    public void enterUsername(String username) {
        Driver.get().findElement(By.id("username")).sendKeys(username);
    }

    @And("enter password {string}")
    public void enterPassword(String password) {

        loginPage.passwordBox.sendKeys(password);

    }

    @When("click the login button")
    public void clickTheLoginButton() {
        BrowserUtils.waitFor(1);
        loginPage.loginButton.click();
        BrowserUtils.waitFor(1);

    }

    @Then("check user is on homepage")
    public void checkUserIsOnHomepage() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(homePage.settingIcon.isDisplayed());
        BrowserUtils.waitFor(2);
    }

    @Given("user login successfully")
    public void userLoginSuccessfully() {
        BrowserUtils.waitFor(1);
        loginPage.login();
        BrowserUtils.waitFor(1);
    }

    @When("click addCompany")
    public void clickAddCompany() {
        BrowserUtils.waitFor(1);
        homePage.addCompany.click();
        BrowserUtils.waitFor(1);
    }

    @And("enter name of company and address")
    public void enterNameOfCompanyAndAddress(Map<String, String> list){
        BrowserUtils.waitFor(2);
        homePage.nameCompany.sendKeys(list.get("name"));
        homePage.addressCompany.sendKeys(list.get("address"));
        BrowserUtils.waitFor(1);


    }

    @And("click send button")
    public void clickSendButton() {
        BrowserUtils.waitFor(1);
        homePage.sendButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("check new company")
    public void checkNewCompany() {
        Assert.assertTrue(homePage.settingIcon.isDisplayed());
        BrowserUtils.waitFor(3);
    }

    @Then("create admin user for company")
    public void createAdminUserForCompany() {
        BrowserUtils.waitFor(1);
        homePage.createNewUser.click();
        BrowserUtils.waitFor(2);
    }

    @Then("click new user")
    public void clickNewUser() {
        BrowserUtils.waitFor(1);
        homePage.clickNewUser.click();
       // BrowserUtils.waitFor(2);
    }

    @And("add new user")
    public void addNewUser(Map<String, String> list) {
       // BrowserUtils.waitFor(2);
        userAdd.username.sendKeys(list.get("username"));
       // BrowserUtils.waitFor(1);
        userAdd.password.sendKeys(list.get("password"));
       // BrowserUtils.waitFor(1);
        userAdd.firstname.sendKeys(list.get("firstname"));
       // BrowserUtils.waitFor(1);
        userAdd.lastname.sendKeys(list.get("lastname"));
       // BrowserUtils.waitFor(1);
        userAdd.email.sendKeys(list.get("email"));
       // BrowserUtils.waitFor(1);
        userAdd.adminRole.click();
        BrowserUtils.waitFor(2);
        userAdd.sendButton.click();
        BrowserUtils.waitFor(3);



    }
}
