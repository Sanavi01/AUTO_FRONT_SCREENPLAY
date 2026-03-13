package com.miejemplo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionMesaUI {

    public static final Target TITULO_PAGINA = Target.the("Título de la pantalla de selección de mesa")
            .locatedBy("h1");

    public static final Target MESA = Target.the("Mesa número {0}")
            .locatedBy("//button[contains(text(),'{0}')]");
}