import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println(" Digite sua idade ");
    int idade = scanner.nextInt();

    scanner.close();

    if (idade >=18) {
        System.out.println("voce e maior de idade"); 
        
    } else {
        System.out.println(" voce e menor de idade ");

    }
        
        
    }
    
}
