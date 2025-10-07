package aula1;
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
    Scanner Scanner = new Scanner (System.in);
    int cont = 1;
    int soma = 0;
    
        while (cont <= 5) {
            System.out.println("Informe um número inteiro" + cont + ":");
            int num = Scanner.nextInt();
            
            soma += num;
            cont++;
        }
        System.out.println("A soma é:" + soma);
    } 
}
