import java.util.Scanner;

public class ArraysVetores {

    private static final String anotherString = null;

    public static void main(String[] args) {
        /*Ordem inversa */
        int[] vetor = {1, -5, 15, 50, 8, 4};

        int count = 0;
        System.out.println("Em ordem: ");
        while(count < (vetor.length)) {

            System.out.println(vetor[count]);
            count++;
        }

        System.out.println("Ordem inversa: ");

        for(int i = (vetor.length - 1); i>= 0; i--){
            System.out.println(vetor[i] + " ");
        }

        /*vetor que irá ler 6 caracteres e quantas consoantes foram lidas e imprima*/

        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];

        int quantidades = 0;
        int count2 = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            /*Falta terminar 
            if(letra.equalsIgnoreCase(anotherString:"a")) { 

                    consoantes[count] = letra;
                    quantidades++;
            }*/
        } while(count2 < consoantes.length);

        for(String consoante : consoantes){
            if(consoante != null) {
                System.out.println(consoante + " ");
            }
        }

    }
    }