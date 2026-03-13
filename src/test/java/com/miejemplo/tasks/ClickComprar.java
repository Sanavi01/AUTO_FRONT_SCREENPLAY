package com.miejemplo.tasks;

import com.miejemplo.ui.SeleccionPedidoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.annotations.Step;

public class ClickComprar implements Task {

    @Step("{0} hace click en el botón Comprar")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SeleccionPedidoUI.BOTON_COMPRAR)
        );
    }

    public static ClickComprar enMenu() {
        return Tasks.instrumented(ClickComprar.class);
    }
}