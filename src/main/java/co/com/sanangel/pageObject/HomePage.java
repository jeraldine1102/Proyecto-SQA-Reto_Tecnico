package co.com.sanangel.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    private By select_product = By.xpath("(//*[@class='woocommerce-loop-product__title'])[1]");

    public By getSelect_product() {
        return select_product;
    }
}
