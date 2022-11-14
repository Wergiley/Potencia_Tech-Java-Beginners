import java.util.Scanner;

public class parImpar {
    /*em pratica... */
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int quanNumeros, numero;
            int quantPar = 0, quantImpar = 0;


            System.out.println("Quantidade de números: ");
            quanNumeros = scan.nextInt();

            int cont = 0;
            do {
                System.out.println("Numero: ");
                numero = scan.nextInt();
                if(numero % 2 == 0) quantPar++;
                else{
                    quantImpar++;
                }
                cont++;
            } while(cont < quanNumeros);
            System.out.println("Quantidade Par: "+ quantPar);
            System.out.println("Quantidade Impar: "+quantImpar);
        }

       
    }
}
