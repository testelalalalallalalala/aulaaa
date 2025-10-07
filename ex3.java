/*
Peça ao usuário um número inteiro e exiba a tabuada de 1 a 10 usando
for.
 */
package aula1;
import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int cont = 0;
        int soma = 0;
        
        System.out.println("Digite números (Se informar 0, irá parar):");
        num = scanner.nextInt();
            while (num != 0) {
            soma += num;
            cont++;
            num = scanner.nextInt();
        }
        System.out.println("Você digitou " + cont + " números. E a soma é" + soma);
    }
    
}
