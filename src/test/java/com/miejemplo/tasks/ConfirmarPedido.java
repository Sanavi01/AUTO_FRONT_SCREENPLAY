package com.miejemplo.tasks;

import com.miejemplo.ui.CarritoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.annotations.Step;

public class ConfirmarPedido implements Task {

    @Step("{0} confirma el pedido desde el carrito")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CarritoUI.BTN_CONFIRMAR_PEDIDO)
        );
    }

    public static ConfirmarPedido desdeElCarrito() {
        return Tasks.instrumented(ConfirmarPedido.class);
    }
}