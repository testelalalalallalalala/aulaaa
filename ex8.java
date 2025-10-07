//Faça um programa onde o usuário digita um valor, e imprima na tela todos os valores entre 0 e o valor digitado.


package aula1;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            System.out.println("Valores de 0 até " + numero + ":");
            for (int i = 0; i <= numero; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Número inválido. Por favor, digite um valor positivo.");
        }

        scanner.close();
    }
}


