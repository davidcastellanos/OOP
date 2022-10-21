package com.david.mundopc;

public class Teclado extends DispositivoEntrada {
    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
    }
    {
        idTeclado = ++Teclado.contadorTeclados;
    }

    public int getIdTeclado() {
        return this.idTeclado;
    }

    public static int getContadorTeclados() {
        return Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return String.format("");
    }
}
