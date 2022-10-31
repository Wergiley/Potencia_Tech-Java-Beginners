import java.util.Scanner;
public class BoletimEstudantil {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int mediaFinal;

        System.out.println("Digite sua media:");
        mediaFinal = ler.nextInt();

        if (mediaFinal < 6) {
            System.out.println("Você foi Reprovado");
        }
        else if (mediaFinal == 6){
            System.out.println("Você teve a média da prova!");
        }
        else {
            System.out.println("Parabéns, você foi Aprovado!");
        }
    }
}
