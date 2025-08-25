package com.mycompany.parqueadero;

public class Main {
    public static void main(String[] args) {
        Parqueadero modelo = new Parqueadero();
        ParqueaderoVista vista = new ParqueaderoVista();
        new ParqueaderoControlador(modelo, vista);
    }
}
