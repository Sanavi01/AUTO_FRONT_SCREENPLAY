package com.miejemplo.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PedidoMesaStepDefinitions {

    @Given("el cliente está en la pantalla de selección de mesa")
    public void elClienteEstaEnLaPantallaDeSeleccionDeMesa() {
        // TODO: implementar con Screenplay
    }

    @When("selecciona la mesa {string} desde el menú")
    public void seleccionaLaMesaDesdeElMenu(String mesa) {
        // TODO: implementar con Screenplay
    }

    @And("agrega la opción {string} al pedido")
    public void agregaLaOpcionAlPedido(String opcionProducto) {
        // TODO: implementar con Screenplay
    }

    @And("aumenta {string} vez\\(ces\\) la cantidad de la opción {string}")
    public void aumentaLaCantidadDeLaOpcion(String vecesAumentar, String opcionProducto) {
        // TODO: implementar con Screenplay
    }

    @And("disminuye {string} vez\\(ces\\) la cantidad de la opción {string}")
    public void disminuyeLaCantidadDeLaOpcion(String vecesDisminuir, String opcionProducto) {
        // TODO: implementar con Screenplay
    }

    @And("hace click en Comprar")
    public void haceClickEnComprar() {
        // TODO: implementar con Screenplay
    }

    @And("confirma el pedido desde el carrito")
    public void confirmaElPedidoDesdeElCarrito() {
        // TODO: implementar con Screenplay
    }

    @Then("recibe la confirmación de que la cocina ha recibido el pedido")
    public void recibelaConfirmacionDeLaCocina() {
        // TODO: implementar con Screenplay
    }
}
