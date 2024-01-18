package co.com.sanangel.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {
    public By select_quantity = By.xpath("//input[@type='number']");

    public By getSelect_quantity() {
        return select_quantity;
    }

    public By select_cart = By.name("add-to-cart");

    public By getSelect_cart() {
        return select_cart;
    }
}
