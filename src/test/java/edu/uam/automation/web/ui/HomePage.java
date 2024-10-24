package edu.uam.automation.web.ui;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://cesaragudelo.com.co/demosite")
public class HomePage extends PageObject {

    public static final Target LINK_OPTION = Target.the("Link option").locatedBy("//a[text()=' Login']");
    public static final Target USERNAME = Target.the("Username").located(By.name("cust_email"));
    public static final Target PASSWORD = Target.the("Password").located(By.name("cust_password"));
    public static final Target SUBMIT = Target.the("Password").located(By.name("form1"));
    public static final Target SEARCH_INPUT = Target.the("Search input").located(By.name("search_text"));
    public static final Target SEARCH_BUTTON = Target.the("Search button").locatedBy("//button[text()='Search']");
    public static final Target ADD_TO_CARD_OPTION_NAV = Target.the("Add to card option nav").locatedBy("//a[contains(text(),'Cart')]");
    public static final Target ORDERS_BUTTON = Target.the("Orders button").locatedBy("//button[text()='Orders']");
    public static final Target PRODUCT_NAME = Target.the("Product name").locatedBy("//td[contains(text(), '{0}')]");

}
