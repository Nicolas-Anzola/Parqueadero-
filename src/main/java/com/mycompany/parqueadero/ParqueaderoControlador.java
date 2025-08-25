package com.mycompany.parqueadero;

import java.awt.event.*;
import java.time.LocalDateTime;

public class ParqueaderoControlador {
    private Parqueadero modelo;
    private ParqueaderoVista vista;

    public ParqueaderoControlador(Parqueadero modelo, ParqueaderoVista vista) {
        this.modelo = modelo;
        this.vista = vista;

        // Acción botón entrada
        vista.btnEntrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarEntrada();
            }
        });

        // Acción botón salida
        vista.btnSalida.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarSalida();
            }
        });

        // Acción botón estado
        vista.btnEstado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                consultarEstado();
            }
        });
    }

    private void registrarEntrada() {
        String placa = vista.txtPlaca.getText();
        String marca = vista.txtMarca.getText();
        String modeloVeh = vista.txtModelo.getText();
        String tipo = (String) vista.cbTipoVehiculo.getSelectedItem();
        String extra = vista.txtExtra.getText();

        Vehiculo vehiculo = null;
        switch (tipo) {
            case "Automovil" -> vehiculo = new Automovil(placa, marca, modeloVeh, extra);
            case "Motocicleta" -> vehiculo = new Motocicleta(placa, marca, modeloVeh, Integer.parseInt(extra));
            case "Camion" -> vehiculo = new Camion(placa, marca, modeloVeh, Double.parseDouble(extra));
        }

        modelo.registrarEntrada(vehiculo, LocalDateTime.now());
        vista.txtAreaEstado.append("Entrada registrada: " + placa + "\n");
    }

    private void registrarSalida() {
        String placa = vista.txtPlaca.getText();
        double costo = modelo.registrarSalida(placa, LocalDateTime.now());
        vista.txtAreaEstado.append("Salida registrada: " + placa + " | Costo: $" + costo + "\n");
    }

    private void consultarEstado() {
        vista.txtAreaEstado.setText("--- Vehículos en parqueadero ---\n");
        for (Vehiculo v : modelo.consultarEstado()) {
            vista.txtAreaEstado.append(v.toString() + "\n");
        }
    }
}
