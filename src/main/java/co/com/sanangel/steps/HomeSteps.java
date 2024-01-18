package co.com.sanangel.steps;

import co.com.sanangel.pageObject.HomePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class HomeSteps {
    @Page
    HomePage home;

    @Step("Abrir el navegador")
    public void abrirNavegador() {
        home.openUrl("https://sanangel.com.co/");
    }

    @Step("Da clic al producto")
    public void clicProucto() {
        home.getDriver().findElement(home.getSelect_product()).click();
    }
}
