package com.miejemplo.questions;

import com.miejemplo.ui.ConfirmacionUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PedidoConfirmado implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(ConfirmacionUI.CONFIRMACION_TITULO)
                .answeredBy(actor)
                .equalsIgnoreCase("Pedido confirmado");
    }

    public static PedidoConfirmado enPantalla() {
        return new PedidoConfirmado();
    }
}