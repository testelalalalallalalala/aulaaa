/*
Faça um programa onde o usuário digita dois valores, e imprima na tela todos os
valores no intervalo entre os valores digitados.
 */
package aula1;
import java.util.Scanner;
public class ex9 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Valores no intervalo entre " + num1 + " e " + num2 + ":");

        if (num1 < num2) {
            for (int i = num1 + 1; i < num2; i++) {
                System.out.println(i);
            }
        } else if (num2 < num1) {
            for (int i = num2 + 1; i < num1; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Os números são iguais. Não há intervalo entre eles.");
        }

        scanner.close();
    }
}