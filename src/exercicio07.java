import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {

        
        /*Faça um programa que recebe um caractere do usuário
      e verifica se é uma vogal ou consoante. /**/
   
    //Declarando a char

    Scanner scanner = new Scanner (System.in);
    
    char letra;
   
    System.out.printf("Informe uma letra: ");
    letra = scanner.next().charAt(0);
 
    
 
    if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'||
        letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
        System.out.printf("A letra %c, é uma vogal!", letra);
    }
    else{
        System.out.printf("A Letra %c, não é uma vogal !", letra);
    }
 
 
 
 scanner.close();


    }
    
}
