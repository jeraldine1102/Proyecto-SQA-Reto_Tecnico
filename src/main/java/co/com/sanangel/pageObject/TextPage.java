package co.com.sanangel.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class TextPage extends PageObject {
    private By print_text = By.xpath("//h1[@class='entry-title' and text()='Finalizar compra']");

    public By getPrint_text() {
        return print_text;
    }
}
