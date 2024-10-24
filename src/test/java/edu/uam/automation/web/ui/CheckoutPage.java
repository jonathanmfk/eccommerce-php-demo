package edu.uam.automation.web.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {

    public static final Target PAYMENT_METHOD = Target.the("Payment method").locatedBy("//span[@id='select2-advFieldsStatus-container']");
    public static final Target PAYMENT_OPTION = Target.the("Payment option").locatedBy("//li[text()='{0}']");
    public static final Target TRANSACTION_TEXT_AREA = Target.the("transaction text area").located(By.name("transaction_info"));
    public static final Target PAY_NOW_BUTTON = Target.the("Pay now button").located(By.name("form3"));
    public static final Target BACK_TO_DASHBOARD_BUTTON = Target.the("Back to dashboard button").locatedBy("//a[text()='Back to Dashboard']");
}
