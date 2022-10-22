package com.david.mundopc;

public class Orden {
    private int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrdenes;
    private final int MAX_COMPUTADORAS = 10;
    private int cantCompusAgregados;

    {
        computadoras = new Computadora[MAX_COMPUTADORAS];
        this.idOrden = ++Orden.contadorOrdenes;
    }

    public void agregarComputadora(Computadora computadora) {
        if (computadora != null && this.cantCompusAgregados < MAX_COMPUTADORAS){
            computadoras[cantCompusAgregados++] = computadora;
        } else {
            System.out.println("Ha excedido el máximo de computadoras que puede agregar");
        }

    }

    public void mostrarOrden() {
        System.out.println("Productos de la orden: ");
        for (Computadora computadora: computadoras) {
            if (computadora != null) {
                System.out.println(computadora);
            }
        }

    }
}
