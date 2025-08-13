package com.mycompany.parqueadero;

public class Camion extends Vehiculo {
    private double capacidadCarga; // en toneladas

    public Camion(String placa, String marca, String modelo, double capacidadCarga) {
        super(placa, marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularCosto() {
        long minutos = obtenerMinutosEstadia();
        return (minutos / 60.0) * 5000; // tarifa por hora
    }
}
