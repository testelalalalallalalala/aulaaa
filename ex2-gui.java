package com.mycompany.mavenproject223112;

import java.awt.*;
import javax.swing.*;

public class Mavenproject223112 extends JFrame {
    private JTextField txtNum1, txtNum2;
    private JButton btnSoma, btnSubtrai, btnMultiplica, btnDivide, btnSair;

    public Mavenproject223112() {
        super("Exercício 02");
        setLayout(null); // Layout absoluto para posicionar manualmente

        // Labels
        JLabel lblNum1 = new JLabel("Número 1:");
        lblNum1.setBounds(20, 20, 80, 25);
        add(lblNum1);

        JLabel lblNum2 = new JLabel("Número 2:");
        lblNum2.setBounds(20, 60, 80, 25);
        add(lblNum2);

        // Campos de texto
        txtNum1 = new JTextField();
        txtNum1.setBounds(100, 20, 100, 25);
        add(txtNum1);

        txtNum2 = new JTextField();
        txtNum2.setBounds(100, 60, 100, 25);
        add(txtNum2);

        // Botões
        btnSoma = new JButton("SOMA");
        btnSoma.setBounds(220, 20, 100, 25);
        add(btnSoma);

        btnSubtrai = new JButton("SUBTRAI");
        btnSubtrai.setBounds(220, 60, 100, 25);
        add(btnSubtrai);

        btnMultiplica = new JButton("MULTIPLICA");
        btnMultiplica.setBounds(220, 100, 100, 25);
        add(btnMultiplica);

        btnDivide = new JButton("DIVIDE");
        btnDivide.setBounds(220, 140, 100, 25);
        add(btnDivide);

        btnSair = new JButton("SAIR");
        btnSair.setBounds(100, 100, 100, 65);
        btnSair.setBackground(Color.RED);
        btnSair.setForeground(Color.WHITE);
        btnSair.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
        add(btnSair);

        // Ações dos botões
        btnSoma.addActionListener(e -> calcular('+'));
        btnSubtrai.addActionListener(e -> calcular('-'));
        btnMultiplica.addActionListener(e -> calcular('*'));
        btnDivide.addActionListener(e -> calcular('/'));
        btnSair.addActionListener(e -> System.exit(0));

        // Configurações da janela
        getContentPane().setBackground(new Color(220, 220, 220)); // cor de fundo
        setSize(360, 230);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void calcular(char operacao) {
        try {
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());
            double resultado = 0;

            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro: divisão por zero!", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    break;
            }

            JOptionPane.showMessageDialog(this, "Resultado: " + String.format("%.2f", resultado), "Resultado", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite valores numéricos válidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Mavenproject223112().setVisible(true));
    }
}
