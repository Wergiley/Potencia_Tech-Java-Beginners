import java.util.Scanner;

public class AulaDebug {

    // Formas de identificar erros de lógica no código com: Teste de Mesa e Debbuging da IDE.
    // Onde está o erro lógico deste código? 
    // O erro é o tipo de variável, pois está sendo retornado um inteiro, não um numero real.

    /*
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "João", "Pedro", "Paula"};

        int media = calcMedia(alunos, scan);

        System.out.printf("Média da turma: %d ", media);
    }

    public static Double calcMedia(String[] alunos, Scanner scanner) {
        int soma = 0d;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = scanner.nextInt();
            soma += nota;    
        }
        return soma / alunos.length;

    }
     */

    // Correção:
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "João", "Pedro", "Paula"};

        double media = calcMedia(alunos, scan);

        System.out.printf("Média da turma: %.1f ", media);
    }

    public static double calcMedia(String[] alunos, Scanner scanner) {
        double soma = 0d;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;    
        }
        return soma / alunos.length;

    }
}
