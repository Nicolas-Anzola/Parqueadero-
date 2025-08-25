package com.mycompany.parqueadero;

import javax.swing.*;

public class ParqueaderoVista extends JFrame {
    // Campos de entrada
    public JTextField txtPlaca;
    public JTextField txtMarca;
    public JTextField txtModelo;
    public JComboBox<String> cbTipoVehiculo;
    public JTextField txtExtra; // Combustible, cilindraje, carga

    // Botones
    public JButton btnEntrada;
    public JButton btnSalida;
    public JButton btnEstado;

    // Área de salida
    public JTextArea txtAreaEstado;

    public ParqueaderoVista() {
        setTitle("Sistema de Parqueadero");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblPlaca = new JLabel("Placa:");
        lblPlaca.setBounds(20, 20, 100, 25);
        add(lblPlaca);
        txtPlaca = new JTextField();
        txtPlaca.setBounds(150, 20, 150, 25);
        add(txtPlaca);

        JLabel lblMarca = new JLabel("Marca:");
        lblMarca.setBounds(20, 60, 100, 25);
        add(lblMarca);
        txtMarca = new JTextField();
        txtMarca.setBounds(150, 60, 150, 25);
        add(txtMarca);

        JLabel lblModelo = new JLabel("Modelo:");
        lblModelo.setBounds(20, 100, 100, 25);
        add(lblModelo);
        txtModelo = new JTextField();
        txtModelo.setBounds(150, 100, 150, 25);
        add(txtModelo);

        JLabel lblTipo = new JLabel("Tipo de vehículo:");
        lblTipo.setBounds(20, 140, 120, 25);
        add(lblTipo);
        cbTipoVehiculo = new JComboBox<>(new String[]{"Automovil", "Motocicleta", "Camion"});
        cbTipoVehiculo.setBounds(150, 140, 150, 25);
        add(cbTipoVehiculo);

        JLabel lblExtra = new JLabel("Cilindraje:");
        lblExtra.setBounds(20, 180, 120, 25);
        add(lblExtra);
        txtExtra = new JTextField();
        txtExtra.setBounds(150, 180, 150, 25);
        add(txtExtra);

        btnEntrada = new JButton("Registrar Entrada");
        btnEntrada.setBounds(20, 220, 150, 30);
        add(btnEntrada);

        btnSalida = new JButton("Registrar Salida");
        btnSalida.setBounds(200, 220, 150, 30);
        add(btnSalida);

        btnEstado = new JButton("Consultar Estado");
        btnEstado.setBounds(20, 260, 330, 30);
        add(btnEstado);

        txtAreaEstado = new JTextArea();
        JScrollPane scroll = new JScrollPane(txtAreaEstado);
        scroll.setBounds(20, 300, 430, 50);
        add(scroll);

        setVisible(true);
    }
}
