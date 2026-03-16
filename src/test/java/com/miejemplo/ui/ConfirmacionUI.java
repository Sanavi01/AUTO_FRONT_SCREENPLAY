package com.miejemplo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmacionUI {

    public static final Target CONFIRMACION_TITULO = Target.the("Título de confirmación del pedido")
            .locatedBy("//h1[contains(@class,'text-4xl')]");
}
