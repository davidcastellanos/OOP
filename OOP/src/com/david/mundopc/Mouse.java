package com.david.mundopc;

public class Mouse extends DispositivoEntrada{
    private int idMouse;
    private static int contadorMouses;

    public Mouse(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
    }
    {
        idMouse = ++Mouse.contadorMouses;
    }

    public int getIdMouse() {
        return this.idMouse;
    }

    public static int getContadorMouses() {
        return Mouse.contadorMouses;
    }

    @Override
    public String toString() {
        return String.format("Id: %s", this.getIdMouse());
    }
}
