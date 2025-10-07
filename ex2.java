package aula1;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
    String senha;
        do {
            System.out.print("Digite a senha: ");
            senha = Scanner.nextLine();
        } while (!senha.equals("1234"));
          System.out.println("Senha correta! Acesso permitido.");
    }  
}
