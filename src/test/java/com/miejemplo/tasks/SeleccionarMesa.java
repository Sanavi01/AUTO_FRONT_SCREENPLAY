package com.miejemplo.tasks;

import com.miejemplo.ui.SeleccionMesaUI;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.annotations.Step;

public class SeleccionarMesa implements Task {

    private final String numeroMesa;

    public SeleccionarMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    @Step("{0} selecciona la mesa #numeroMesa")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SeleccionMesaUI.MESA.of(numeroMesa))
        );
    }

    public static SeleccionarMesa numero(String numeroMesa) {
        return new SeleccionarMesa(numeroMesa);
    }
}