/*
Desenvolva um programa que leia um valor N inteiro positivo, calcule e mostre o valor de E,
conforme a fórmula abaixo:
 */
package aula1;
import java.util.Scanner;
public class ex12 {
public static long fatorial(int num) {
        long fat = 1;
        for (int i = 2; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro positivo N: ");
        int N = scanner.nextInt();

        if (N < 0) {
            System.out.println("Valor inválido! Digite um número inteiro positivo.");
        } else {
            double E = 0.0;

            for (int i = 0; i <= N; i++) {
                E += 1.0 / fatorial(i);
            }

            System.out.println("O valor aproximado de E para N = " + N + " é: " + E);
        }

        scanner.close();
    }
}
