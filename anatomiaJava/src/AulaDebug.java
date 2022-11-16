import java.util.Scanner;

public class AulaDebug {
    // Formas de identificar erros de lógica no código com: Teste de Mesa e Debbuging da IDE.
    // Onde está o erro lógico deste código? 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "João", "Pedro", "Paula"};

        int media = calcMedia(alunos, scan);

        System.out.printf("Média da turma: %d ", media);
    }
    public static int  calcMedia(String[] alunos, Scanner scanner) {
        int soma = 0;
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = scanner.nextInt();
            soma += nota;    
        }
        return soma / alunos.length;

    }
}
