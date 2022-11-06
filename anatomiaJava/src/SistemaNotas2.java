import java.util.Scanner;

public class SistemaNotas2 {
    public static void main(String[] args) {
        /*Sistema simples de média de notas do aluno */
        Scanner scan = new Scanner(System.in);

        int notas;
        int maior = 0;
        int soma = 0;
        int count = 0;
        int menor = 10;

        do {
            System.out.println("Numero: ");
            notas = scan.nextInt();

            soma = soma + notas;

            if(notas > maior) maior = notas;
            if(notas < menor) menor = notas; 
                count = count + 1;
            
        } while(count < 4);

        int media = soma/4;

        if(media >= 6) {
            System.out.println("Aluno aprovado!");
        } else if(media >=5 | media < 6) {
            System.out.println("Aluno em recuperação!");
        } else {
            System.out.println("Aluno reprovado!");
        }
        System.out.println("Sua maior nota foi: "+ maior);
        System.out.println("Sua menor nota foi: "+ menor);
        System.out.println("Sua média foi: "+ media);
    }
}
