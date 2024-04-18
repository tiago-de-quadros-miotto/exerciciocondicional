import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Informe o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        

        int anoAtual= LocalDate.now().getYear();
        int idade = anoAtual- anoNascimento;

        if (idade >=18) {
            System.out.println("voce e maior de idade"); 
            
        } else {
            System.err.println(" voce e menor de idade ");
    
        }
            
        scanner.close();

                
    }
}
