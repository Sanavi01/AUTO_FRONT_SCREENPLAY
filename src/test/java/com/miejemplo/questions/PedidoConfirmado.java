package com.miejemplo.questions;

import com.miejemplo.ui.ConfirmacionUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PedidoConfirmado implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        ConfirmacionUI.CONFIRMACION_TITULO
                .resolveFor(actor)
                .waitUntilVisible();
        return Text.of(ConfirmacionUI.CONFIRMACION_TITULO)
                .answeredBy(actor);
    }

    public static PedidoConfirmado enPantalla() {
        return new PedidoConfirmado();
    }
}