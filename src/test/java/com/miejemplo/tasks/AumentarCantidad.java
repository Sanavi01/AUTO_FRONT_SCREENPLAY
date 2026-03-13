package com.miejemplo.tasks;

import com.miejemplo.ui.SeleccionPedidoUI;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.annotations.Step;

public class AumentarCantidad implements Task {

    private final String opcionProducto;
    private final int veces;

    public AumentarCantidad(String opcionProducto, int veces) {
        this.opcionProducto = opcionProducto;
        this.veces = veces;
    }

    @Step("{0} aumenta #veces vez(ces) la cantidad del producto en posición #opcionProducto")
    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < veces; i++) {
            actor.attemptsTo(
                    Click.on(SeleccionPedidoUI.BOTON_AUMENTAR.of(opcionProducto))
            );
        }
    }

    public static AumentarCantidad delProducto(String opcionProducto, int veces) {
        return new AumentarCantidad(opcionProducto, veces);
    }
}