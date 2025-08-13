package com.mycompany.parqueadero;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public void registrarEntrada(Vehiculo v, LocalDateTime h) {
        v.registrarEntrada(h);
        vehiculos.add(v);
    }

    public double registrarSalida(String placa, LocalDateTime h) {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equalsIgnoreCase(placa) && v.getHoraSalida() == null) {
                v.registrarSalida(h);
                return v.calcularCosto();
            }
        }
        return 0.0;
    }

    public List<Vehiculo> consultarEstado() {
        return vehiculos;
    }
}
