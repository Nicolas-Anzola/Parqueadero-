package com.mycompany.parqueadero;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Vehiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected LocalDateTime horaEntrada;
    protected LocalDateTime horaSalida;

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void registrarEntrada(LocalDateTime h) {
        this.horaEntrada = h;
    }

    public void registrarSalida(LocalDateTime h) {
        this.horaSalida = h;
    }

    public long obtenerMinutosEstadia() {
        if (horaEntrada != null && horaSalida != null) {
            return Duration.between(horaEntrada, horaSalida).toMinutes();
        }
        return 0;
    }

    public abstract double calcularCosto();

    public String getPlaca() { return placa; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public LocalDateTime getHoraEntrada() { return horaEntrada; }
    public LocalDateTime getHoraSalida() { return horaSalida; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", entrada=" + horaEntrada +
                ", salida=" + horaSalida +
                '}';
    }
}
