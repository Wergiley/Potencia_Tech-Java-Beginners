import java.util.Scanner;
public class BuscaSequencial {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        int numero = 0;

        System.out.println("Digite um numero inteiro: ");
        numero = leitor.nextInt();

        buscaSequencial(numero, elementos);

    }
    public static void buscaSequencial(int numero, int[] elementos){
        for (int i = 0; i < elementos.length; i++) {
            if (numero == elementos[i]) {
                System.out.println("Achei " + numero + " na posicao " + i);
                return;
            }
           }
        System.out.println("Numero " + numero + " nao encontrado!");
        }

    }



