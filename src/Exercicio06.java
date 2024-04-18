import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {


          // Crie um programa que pede ao usuário para digitar sua nota em uma disciplina e
          //imprime se ele foi aprovado (nota maior ou igual a 6) ou reprovado.

          Scanner scanner = new Scanner(System.in);
 
        System.out.println("Digite sua nota na disciplina:");
        double nota = scanner.nextDouble();
       
        if (nota >= 6.0) {
            System.out.println("Parabéns! Você foi aprovado.");
        } else {
            System.out.println("Você foi reprovado.");
        }
       
        scanner.close();
    }
    
}
