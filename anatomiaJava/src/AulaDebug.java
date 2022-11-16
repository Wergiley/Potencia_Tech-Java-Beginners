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

        System.out.printf("Média da turma: %d ", media); // retorna um inteiro*
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

        System.out.println("Iniciou do programa no método main.");
        a();
        System.out.println("Finalizou do programa no método main.");
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


    static void a() {
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    static void b() {
        System.out.println("Entrou no método b.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");
    }

    static void c(){
        System.out.println("Entrou no método c.");
        //Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
}
