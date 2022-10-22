package com.david.mundopc.app;

import com.david.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {
        DispositivoEntrada dispositivoEntrada1 = new DispositivoEntrada("SVG", "MICROSOFT");
        Mouse mouse1 = new Mouse("USB", "Logitech");
        Teclado teclado1 = new Teclado("USB", "HP");
        Monitor monitor1 = new Monitor("SAMSUNG", 19.2);
        Computadora computadora1 = new Computadora("LENOVO IDEAPAD", monitor1, teclado1, mouse1);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();


    }

}
