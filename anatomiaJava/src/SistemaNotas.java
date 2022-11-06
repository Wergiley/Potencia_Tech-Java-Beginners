import java.util.Scanner;
public class SistemaNotas {
    public static void main(String[] args) {
        /*Sistema de notas do estudante praticando condições e operadores*/
        Scanner scan = new Scanner(System.in);

        String nome;
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int media;

        /*Entrada de dados */

        System.out.println("Digite seu nome: ");
        nome = scan.next();

        System.out.println("Digite sua primeira nota: ");
        nota1 = scan.nextInt();

        System.out.println("Digite sua segunda nota: ");
        nota2 = scan.nextInt();

        System.out.println("Digite sua terceira nota: ");
        nota3 = scan.nextInt();

        System.out.println("Digite sua quarta nota: ");
        nota4 = scan.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        /*Saída de dados */
        System.out.println("SISTEMA DE BOLETIM DE NOTA POR MATÉRIA");
        if( media >= 6) {
            System.out.println("Parabéns, "+nome+" você foi aprovado! Com a média de "+media);
        }
        else if(media >= 5 && media < 6 ) {
            System.out.println("Você está em fase de recuperação, boa sorte! Sua média foi "+media);
        } else {
            System.out.println("Infelizmente, você foi reprovado. Sua média foi "+media);
        }
    }
}   