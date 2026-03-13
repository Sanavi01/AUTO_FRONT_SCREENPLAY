package com.miejemplo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoUI {

        public static final Target TITULO_PAGINA = Target.the("Título de la pantalla de confirmación del pedido")
                        .locatedBy("h1");

        public static final Target BTN_CONFIRMAR_PEDIDO = Target.the("Botón confirmar pedido")
                        .locatedBy("//button[text()='Confirmar pedido']");

}
