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
        System.out.println("SISTEMA DE NOTAS POR MATÉRIA");
        
        System.out.println("Digite seu nome: ");
        nome = scan.next();
        
        System.out.println("Digite sua primeira nota: ");
        nota1 = scan.nextInt();

        while(nota1<0 | nota1>10){
            System.out.println("Nota invalida! tente novamente");
            nota1 = scan.nextInt();
        }

        System.out.println("Digite sua segunda nota: ");
        nota2 = scan.nextInt();

        while(nota2<0 | nota2>10){
            System.out.println("Nota invalida! tente novamente");
            nota2 = scan.nextInt();
        }

        System.out.println("Digite sua terceira nota: ");
        nota3 = scan.nextInt();

        while(nota3<0 | nota3>10){
            System.out.println("Nota invalida! tente novamente");
            nota3 = scan.nextInt();
        }

        System.out.println("Digite sua quarta nota: ");
        nota4 = scan.nextInt();

        while(nota4<0 | nota4>10){
            System.out.println("Nota invalida! tente novamente");
            nota4 = scan.nextInt();
        }

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        /*Saída de dados */
    
        if( media >= 6) {
            System.out.println("Parabéns, "+nome+" você foi aprovado! Com a média de "+media);
        }
        else if(media >= 5 | media < 6 ) {
            System.out.println("Você está em fase de recuperação, boa sorte! Sua média foi "+media);
        } else {
            System.out.println("Infelizmente, você foi reprovado. Sua média foi "+media);
        }

    }

}   