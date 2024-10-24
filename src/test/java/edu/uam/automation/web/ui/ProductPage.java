package edu.uam.automation.web.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductPage {

    public static final Target ADD_TO_CARD = Target.the("Add to cart button").locatedBy("//a[text()='Add to Cart']");
    public static final Target ADD_TO_CART_PRODUCT = Target.the("Add to cart button").located(By.name("form_add_to_cart"));
}
