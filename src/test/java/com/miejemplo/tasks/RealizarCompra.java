package com.miejemplo.tasks;

import com.miejemplo.ui.CarritoUI;
import com.miejemplo.ui.SeleccionPedidoUI;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.annotations.Step;

public class RealizarCompra implements Task {

    @Step("{0} hace click en Comprar y confirma el pedido")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SeleccionPedidoUI.BOTON_COMPRAR),
                Click.on(CarritoUI.BTN_CONFIRMAR_PEDIDO)
        );
    }

    public static RealizarCompra ahora() {
        return new RealizarCompra();
    }
}