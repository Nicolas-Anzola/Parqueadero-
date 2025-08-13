package com.mycompany.parqueadero;

public class Automovil extends Vehiculo {
    private String tipoCombustible;

    public Automovil(String placa, String marca, String modelo, String tipoCombustible) {
        super(placa, marca, modelo);
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public double calcularCosto() {
        long minutos = obtenerMinutosEstadia();
        return (minutos / 60.0) * 2000; // tarifa por hora
    }
}
 