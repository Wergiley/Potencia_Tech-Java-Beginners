import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args, int bound) {
        /*Numero aleatórios */
        Random random = new Random();
        int[] numAleatorios = new int[20];
        for( int i = 0; i < numAleatorios.length; i++){
            int numero = random.nextInt();
            numAleatorios[i] = numero;
        } 
        System.out.println("Numeros aleatorios:");

        for(int numero: numAleatorios){
            System.out.println(numero + " ");
        }
        System.out.println("Sucessor dos numeros aleatorios:");
        for(int numero: numAleatorios){
            System.out.println((numero++) + " ");
        }
    }
}
