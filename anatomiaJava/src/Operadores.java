public class Operadores {
    
    public static void main(String[] args) {
        
            String concatenacao = "?";
        
            concatenacao = 1+1+1+"1";
            System.out.println(concatenacao);
            concatenacao = 1+"1"+1;
            System.out.println(concatenacao);

            /*Operador Unário */
            int numero = -5;
            numero = numero * -1;

            System.out.println(numero);

            /*Incremento */
            int numero2 = 10;
            numero2 = ++ numero2;

            System.out.println(numero2);

            /*Decremento */
            numero2 = -- numero2;
            System.out.println(numero2);

            /*Ternario */
            int a, b;
            a = 5;
            b = 6;
            String resultado = a==b ? "Verdadeiro" : "Falso";
            
            System.out.println(resultado);

            /*Relacionais */
            int n1 = 5, n2 = 9;
            boolean simNao = n1 == n2;
            System.out.println(simNao);
        }    

            /*Condicionais if, if else, else */
}

