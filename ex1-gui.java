package com.mycompany.mavenproject223112;

import javax.swing.JOptionPane;

public class Mavenproject223112 {
    public static void main(String[] args) {
        try {
            String input1 = JOptionPane.showInputDialog(null, "Digite o primeiro número:", "Calculadora", JOptionPane.QUESTION_MESSAGE);
            if (input1 == null) return; 
            double num1 = Double.parseDouble(input1);

            String input2 = JOptionPane.showInputDialog(null, "Digite o segundo número:", "Calculadora", JOptionPane.QUESTION_MESSAGE);
            if (input2 == null) return;
            double num2 = Double.parseDouble(input2);

            String[] opcoes = { "Adição (+)", "Subtração (-)", "Multiplicação (*)", "Divisão (/)" };
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha a operação:",
                    "Operação",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            double resultado = 0;
            boolean valido = true;

            switch (escolha) {
                case 0: 
                    resultado = num1 + num2;
                    break;
                case 1: 
                    resultado = num1 - num2;
                    break;
                case 2: 
                    resultado = num1 * num2;
                    break;
                case 3: 
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro: divisão por zero!", "Erro", JOptionPane.ERROR_MESSAGE);
                        valido = false;
                    }
                    break;
                default:
                    valido = false;
            }

            if (valido) {
                JOptionPane.showMessageDialog(null,
                        "Resultado: " + String.format("%.2f", resultado),
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida! Digite apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

