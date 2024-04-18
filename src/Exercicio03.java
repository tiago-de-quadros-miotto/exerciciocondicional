import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        
        Scanner Scanner = new Scanner (System.in);

        System.out.println(" Digite uma temperatura em Celsius: ");
        
        double celsius = Scanner.nextDouble();
        double fahrenheit = 32 + (celsius * 9 / 5 );
        System.out.println(" valor da temperatura em fahrenheit: " + fahrenheit );
        final double zero = -273.15;

        if (celsius <= zero ) {

            System.out.println("alerta ");

            Scanner.close();
            
        }
        
        




    }
    
}
