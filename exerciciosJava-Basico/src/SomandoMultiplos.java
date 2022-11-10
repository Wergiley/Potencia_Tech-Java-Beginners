import java.util.Scanner;
public class SomandoMultiplos {
    public static void main(String[] args) {

        int A = 3, N = 18;
     
        int soma = 0;
     
        Scanner input = new Scanner(System.in);
     
        for ( int i = A ; i <= N ; i +=A) 
     
         if ( i % A == 0){
     
         soma = soma + i;
     
         }

         System.out.println(soma);
       }
}
