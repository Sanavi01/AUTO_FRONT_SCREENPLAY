package com.miejemplo.stepdefinitions;

import com.miejemplo.hooks.AbrirNavegador;
import com.miejemplo.questions.PedidoConfirmado;
import com.miejemplo.tasks.*;
import com.miejemplo.util.Constantes;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class PedidoStepDefinitions {

    private Actor actor;

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
        actor = OnStage.theActorCalled(Constantes.ACTOR);
    }

    @Given("el cliente está en la pantalla de selección de mesa")
    public void clienteEstaEnPantallaSeleccionMesa() {
        actor.attemptsTo(
                AbrirNavegador.enUrl(Constantes.URL_SELECCION_MESA));
    }

    @When("selecciona la mesa {string} desde el menú")
    public void seleccionaLaMesa(String mesa) {
        actor.attemptsTo(
                SeleccionarMesa.numero(mesa));
    }

    @And("agrega la opción {string} al pedido")
    public void agregaOpcionAlPedido(String opcionProducto) {
        actor.attemptsTo(
                AgregarProducto.enPosicion(opcionProducto));
    }

    @And("aumenta {string} vez\\(ces) la cantidad de la opción {string}")
    public void aumentaCantidad(String vecesAumentar, String opcionProducto) {
        actor.attemptsTo(
                AumentarCantidad.delProducto(opcionProducto, Integer.parseInt(vecesAumentar)));
    }

    @And("disminuye {string} vez\\(ces) la cantidad de la opción {string}")
    public void disminuyeCantidad(String vecesDisminuir, String opcionProducto) {
        actor.attemptsTo(
                DisminuirCantidad.delProducto(opcionProducto, Integer.parseInt(vecesDisminuir)));
    }

    @And("hace click en Comprar")
    public void haceClickEnComprar() {
        actor.attemptsTo(
                ClickComprar.enMenu());
    }

    @And("confirma el pedido desde el carrito")
    public void confirmaPedidoDesdeCarrito() {
        actor.attemptsTo(
                ConfirmarPedido.desdeElCarrito());
    }

    @Then("recibe la confirmación de que la cocina ha recibido el pedido")
    public void recibeConfirmacion() {
        actor.should(
                seeThat(PedidoConfirmado.enPantalla(), containsString("Pedido confirmado")));
    }
}