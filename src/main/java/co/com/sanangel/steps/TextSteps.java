package co.com.sanangel.steps;

import co.com.sanangel.pageObject.TextPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;

public class TextSteps {
    @Page
    TextPage text;

    @Step("Imprimir mensaje")
    public void imprimirMensaje() {
        WebElement texto = text.getDriver().findElement(text.getPrint_text());
        String texto2 = texto.getText();
        System.out.println("Mensaje encontrado: " + texto2);
    }
}
