import java.util.Scanner;

public class ExPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        String palidromo = new StringBuilder(palavra).reverse().toString();

        //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.
        
        if (palavra.equals(palidromo)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        
    }
}

