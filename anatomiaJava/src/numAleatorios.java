import java.util.Random;
public class numAleatorios {
    public static void main(String[] args) {
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
            System.out.println("\nSucessor dos numeros aleatorios:");
            for(int numero: numAleatorios){
                System.out.println((numero+1) + " ");
            }
            System.out.println("\nAntecessor dos numeros aleatorios:");
            for(int numero: numAleatorios){
                System.out.println((numero-1) + " ");
            }
    }
    
}
