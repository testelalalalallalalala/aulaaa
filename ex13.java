/*
Desenvolva um programa que leia um número N e que indique quantos valores inteiros e
positivos devem ser lidos a seguir. Para cada número lido, mostre uma tabela contendo o valor
lido e o fatorial desse valor.
Obs: programe uma versão usando FOR e outra versão usando WHILE
 */
package aula1;
import java.util.Scanner;
public class ex13 {
    public static long fatorial(int num) {
        long fat = 1;
        for (int i = 2; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números inteiros positivos você vai digitar? ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("Digite o número #" + i + ": ");
            int valor = scanner.nextInt();

            if (valor < 0) {
                System.out.println("Número inválido! Digite um número inteiro positivo.");
                i--; // Repetir a leitura deste índice
                continue;
            }

            long fat = fatorial(valor);
            System.out.println("Valor: " + valor + "  |  Fatorial: " + fat);
        }

        scanner.close();
    }
}

//while

public class ex13 {
    public static long fatorial(int num) {
        long fat = 1;
        for (int i = 2; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números inteiros positivos você vai digitar? ");
        int N = scanner.nextInt();

        int contador = 1;
        while (contador <= N) {
            System.out.print("Digite o número #" + contador + ": ");
            int valor = scanner.nextInt();

            if (valor < 0) {
                System.out.println("Número inválido! Digite um número inteiro positivo.");
                continue; // Não incrementa o contador para repetir a leitura
            }

            long fat = fatorial(valor);
            System.out.println("Valor: " + valor + "  |  Fatorial: " + fat);

            contador++;
        }

        scanner.close();
    }
}
