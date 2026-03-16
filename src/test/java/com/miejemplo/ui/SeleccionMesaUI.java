package com.miejemplo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionMesaUI {

    public static final Target MESA = Target.the("Mesa número {0}")
                    .locatedBy("//button[starts-with(normalize-space(.),'{0}')]");
}