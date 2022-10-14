package com.alesta.pages;

import com.alesta.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);

    }

    @FindBy(xpath = "(//div[@class ='divLeftButton'])[1]")
    public WebElement settingIcon;

    @FindBy(css = "div.addCompany>svg")
    public WebElement addCompany;


    @FindBy(css = "#companyname")
    public WebElement nameCompany;

    @FindBy(css = "#address")
    public WebElement addressCompany;

    @FindBy(xpath = "//span[.='Send']")
    public WebElement sendButton;

    @FindBy(xpath = "//span[.='USERS']")
    public WebElement createNewUser;

    @FindBy(css = "div>svg[data-testid='AddBoxOutlinedIcon']")
    public WebElement clickNewUser;



}