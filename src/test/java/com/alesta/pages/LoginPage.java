package com.alesta.pages;


import com.alesta.utilities.BrowserUtils;
import com.alesta.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(css = "#username")
    public WebElement usernameBox;

    @FindBy(css = "#password")
    public WebElement passwordBox;


    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement loginButton;




public void login(){
    usernameBox.sendKeys("admin");
    passwordBox.sendKeys("admin");
    BrowserUtils.waitFor(2);
    loginButton.click();
}








}
