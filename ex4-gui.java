package com.mycompany.mavenproject223112;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class mavenproject223112 extends JFrame {

    private JComboBox<String> comboModelo;
    private JTextField txtMontadora;
    private JButton btnSair, btnMostrar;

    public mavenproject223112() {
        super("Cadastro de Carros");
        setLayout(null);

        JLabel lblModelo = new JLabel("Modelo do carro:");
        lblModelo.setFont(new Font("Arial", Font.BOLD, 13));
        lblModelo.setBounds(30, 30, 120, 25);
        add(lblModelo);

        JLabel lblMontadora = new JLabel("Montadora:");
        lblMontadora.setFont(new Font("Arial", Font.BOLD, 13));
        lblMontadora.setBounds(30, 70, 120, 25);
        add(lblMontadora);

        String[] modelos = {"Selecione...", "Onix", "Gol", "Fiesta", "Civic", "HB20", "Outros"};
        comboModelo = new JComboBox<>(modelos);
        comboModelo.setBounds(150, 30, 150, 25);
        add(comboModelo);

        txtMontadora = new JTextField();
        txtMontadora.setBounds(150, 70, 150, 25);
        txtMontadora.setEditable(false);
        add(txtMontadora);

        btnMostrar = new JButton("MOSTRAR");
        btnMostrar.setBounds(50, 120, 100, 30);
        add(btnMostrar);

        btnSair = new JButton("SAIR");
        btnSair.setBounds(180, 120, 100, 30);
        btnSair.setBackground(Color.RED);
        btnSair.setForeground(Color.WHITE);
        btnSair.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
        add(btnSair);

        comboModelo.addActionListener(e -> atualizarMontadora());
        btnMostrar.addActionListener(e -> mostrarInfo());
        btnSair.addActionListener(e -> System.exit(0));

        getContentPane().setBackground(new Color(210, 210, 210));
        setSize(350, 220);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void atualizarMontadora() {
        String modelo = (String) comboModelo.getSelectedItem();

        switch (modelo) {
            case "Onix":
                txtMontadora.setText("Chevrolet");
                txtMontadora.setEditable(false);
                break;
            case "Gol":
                txtMontadora.setText("Volkswagen");
                txtMontadora.setEditable(false);
                break;
            case "Fiesta":
                txtMontadora.setText("Ford");
                txtMontadora.setEditable(false);
                break;
            case "Civic":
                txtMontadora.setText("Honda");
                txtMontadora.setEditable(false);
                break;
            case "HB20":
                txtMontadora.setText("Hyundai");
                txtMontadora.setEditable(false);
                break;
            case "Outros":
                txtMontadora.setText("");
                txtMontadora.setEditable(true);
                txtMontadora.requestFocus();
                break;
            default:
                txtMontadora.setText("");
                txtMontadora.setEditable(false);
        }
    }

    private void mostrarInfo() {
        String modelo = (String) comboModelo.getSelectedItem();
        String montadora = txtMontadora.getText();

        if (modelo.equals("Selecione...") || montadora.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione um modelo válido!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this,
                "Modelo: " + modelo + "\nMontadora: " + montadora,
                "Informações do Carro",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new mavenproject223112().setVisible(true));
    }
}
