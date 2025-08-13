package com.mycompany.parqueadero;

public class Motocicleta extends Vehiculo {
    private int cilindraje;

    public Motocicleta(String placa, String marca, String modelo, int cilindraje) {
        super(placa, marca, modelo);
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularCosto() {
        long minutos = obtenerMinutosEstadia();
        return (minutos / 60.0) * 1000; // tarifa por hora
    }
}
