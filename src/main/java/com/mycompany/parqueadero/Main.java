package com.mycompany.parqueadero;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();
        Scanner sc = new Scanner(System.in);

        System.out.println("===== SISTEMA DE PARQUEADERO =====");
        System.out.print("Ingrese la placa: ");
        String placa = sc.nextLine();
        System.out.print("Ingrese la marca: ");
        String marca = sc.nextLine();
        System.out.print("Ingrese el modelo: ");
        String modelo = sc.nextLine();
        System.out.print("Tipo de vehículo (Automovil, Motocicleta, Camion): ");
        String tipo = sc.nextLine();

        Vehiculo vehiculo = null;
        switch (tipo.toLowerCase()) {
            case "automovil" -> {
                System.out.print("Tipo de combustible: ");
                String combustible = sc.nextLine();
                vehiculo = new Automovil(placa, marca, modelo, combustible);
            }
            case "motocicleta" -> {
                System.out.print("Cilindraje: ");
                int cilindraje = Integer.parseInt(sc.nextLine());
                vehiculo = new Motocicleta(placa, marca, modelo, cilindraje);
            }
            case "camion" -> {
                System.out.print("Capacidad de carga (toneladas): ");
                double capacidad = Double.parseDouble(sc.nextLine());
                vehiculo = new Camion(placa, marca, modelo, capacidad);
            }
            default -> {
                System.out.println("Tipo de vehículo no válido.");
                return;
            }
        }

        parqueadero.registrarEntrada(vehiculo, LocalDateTime.now());
        System.out.println("Vehículo registrado.");

        System.out.println("\nPresione Enter para registrar salida...");
        sc.nextLine();
        double costo = parqueadero.registrarSalida(placa, LocalDateTime.now());
        System.out.printf("Costo total: $%.2f%n", costo);

        System.out.println("\n--- Estado del parqueadero ---");
        parqueadero.consultarEstado().forEach(System.out::println);

        sc.close();
    }
}
