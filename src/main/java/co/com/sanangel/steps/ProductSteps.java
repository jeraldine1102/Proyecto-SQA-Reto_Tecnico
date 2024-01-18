package co.com.sanangel.steps;

import co.com.sanangel.pageObject.ProductPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;

public class ProductSteps {
    @Page
    ProductPage product;

    @Step("Escribir la cantidad")
    public void cantidadProducto() {
        WebElement campoProducto = product.getDriver().findElement(product.getSelect_quantity());
        campoProducto.clear();
        String cantidad = Integer.toString(5);
        campoProducto.sendKeys(cantidad);
    }

    @Step("Agrego el producto al carro de compras")
    public void carroProducto() {
        product.getDriver().findElement(product.getSelect_cart()).click();
    }
}
