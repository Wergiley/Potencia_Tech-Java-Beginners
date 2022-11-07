import java.util.Scanner;

public class tabuada {
    /*Gerador de tabuada simples de 1 a 10 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tabuada de: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de: "+ tabuada);

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada+" X "+" = "+tabuada*i);
        }
    }
}
