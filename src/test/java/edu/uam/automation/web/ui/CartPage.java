package edu.uam.automation.web.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {

    public static final Target PROCEED_TO_CHECKOUT = Target.the("Proceed to checkout button").locatedBy("//a[text()='Proceed to Checkout']");

}
