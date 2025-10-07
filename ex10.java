/*
Faça um programa que imprima na tela a soma dos valores pares de um intervalo
definido pelo usuário. Faça uma versão com FOR, WHILE e WHILE-DO
 */
package aula1;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o valor final do intervalo: ");
        int fim = scanner.nextInt();

        // WHILE
        int somaWhile = 0;
        int i = inicio;

        while (i <= fim) {
            if (i % 2 == 0) {
                somaWhile += i;
            }
            i++;
        }

        System.out.println("Soma dos pares com WHILE: " + somaWhile);

        scanner.close();
    }
}
