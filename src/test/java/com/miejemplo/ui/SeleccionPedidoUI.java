package com.miejemplo.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SeleccionPedidoUI {

    public static final Target TITULO_PAGINA = Target.the("Título de la pantalla del menú")
            .locatedBy("h1");

    public static final Target BOTON_AGREGAR = Target.the("Botón agregar del producto en posición {0}")
            .locatedBy(
                    "(//button[normalize-space()='Agregar' or (contains(.,'Agregar') and not(contains(.,'unidad')))])[{0}]");

    public static final Target BOTON_AUMENTAR = Target.the("Botón aumentar cantidad del producto en posición {0}")
            .locatedBy(
                    "(//div[contains(@class,'bg-accent/10')]//button[contains(@aria-label,'Agregar una unidad')])[{0}]");

    public static final Target BOTON_DISMINUIR = Target.the("Botón disminuir cantidad del producto en posición {0}")
            .locatedBy(
                    "(//div[contains(@class,'bg-accent/10')]//button[contains(@aria-label,'Quitar una unidad')])[{0}]");

    public static final Target BOTON_COMPRAR = Target.the("Botón comprar del carrito")
            .locatedBy("//button[.//span[text()='Comprar']]");

}
