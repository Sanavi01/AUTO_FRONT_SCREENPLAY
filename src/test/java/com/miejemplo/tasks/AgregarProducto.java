package com.miejemplo.tasks;

import com.miejemplo.ui.SeleccionPedidoUI;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.annotations.Step;

public class AgregarProducto implements Task {

    private final String opcionProducto;

    public AgregarProducto(String opcionProducto) {
        this.opcionProducto = opcionProducto;
    }

    @Step("{0} agrega el producto en posición #opcionProducto")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SeleccionPedidoUI.BOTON_AGREGAR.of(opcionProducto))
        );
    }

    public static AgregarProducto enPosicion(String opcionProducto) {
        return new AgregarProducto(opcionProducto);
    }
}