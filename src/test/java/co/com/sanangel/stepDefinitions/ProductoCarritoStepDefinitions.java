package co.com.sanangel.stepDefinitions;

import co.com.sanangel.steps.HomeSteps;
import co.com.sanangel.steps.ProductSteps;
import co.com.sanangel.steps.TextSteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.thucydides.core.annotations.Steps;

public class ProductoCarritoStepDefinitions {

    @Steps
    HomeSteps home;
    @Steps
    ProductSteps product;
    @Steps
    TextSteps text;

    @Dado("que estoy en la pagina de san angel")
    public void queEstoyEnLaPaginaDeSanAngel() {
        home.abrirNavegador();
    }

    @Y("selecciono los productos y sus cantidades")
    public void seleccionoLosProductosYSusCantidades() {
        home.clicProucto();
        product.cantidadProducto();
    }

    @Cuando("los agrego al carro de compra")
    public void losAgregoAlCarroDeCompra() {
        product.carroProducto();
    }

    @Entonces("valido el mensaje de confirmación")
    public void validoElMensajeDeConfirmación() {
        text.imprimirMensaje();
    }

}
