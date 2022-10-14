package com.alesta.pages;

import com.alesta.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAdd {

    public UserAdd() {
        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(css = "#username")
    public WebElement username;


    @FindBy(css = "#password")
    public WebElement password;

    @FindBy(css = "#firstname")
    public WebElement firstname;

    @FindBy(css = "#lastname")
    public WebElement lastname;
    @FindBy(css = "#email")
    public WebElement email;
    @FindBy(css = ".PrivateSwitchBase-input[value='adminCompany']")
    public WebElement adminRole;

    @FindBy(css = "div.css-e53awj-MuiStack-root[value='submit']")
    public WebElement userRole;

    @FindBy(css = ".MuiButton-containedPrimary>span")
    public WebElement sendButton;




    //MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeLarge MuiButton-sizeLarge
}