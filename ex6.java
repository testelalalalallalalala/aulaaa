/*
Leia um número inteiro e calcule seu fatorial usando um laço for
 */
package aula1;
import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    System.out.print("Digite um número para calcular o fatorial: ");
    int num = Scanner.nextInt();
    long fatorial = 1;
    for (int i = 1; i <= num; i++) {
    fatorial *= i;
    }
    System.out.println("Fatorial de " + num + " é: " + fatorial);
    }
    
}
