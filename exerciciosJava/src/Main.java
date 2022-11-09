public class Main {
    public static void main(String[] args) {
        /*Fazendo as chamadas dos metodos dos exercícios 01, 02 e 03*/
        
        System.out.println("Exercício 01 - Operações, Mensagem e Empréstimo: ");
        
        System.out.println("Exercício Calculadora: ");

        Calculadora.soma(3, 6);
        Calculadora.subtracao(7, 6);
        Calculadora.multiplicacao(3, 7);
        Calculadora.divisao(30, 3);

        System.out.println("Exercício Mensagem: ");

        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(22);

        System.out.println("Exercício Empréstimo: ");

        Emprestimo.calcular(1000, 5);
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());

        System.out.println("Exercício 02 - SobreCarga: ");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(7f, 8f);
    }
}
