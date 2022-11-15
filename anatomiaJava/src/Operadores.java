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

            /*Pre-Incremento */
            int numero2 = 10;
            System.out.println("Pre-incremento de: "+numero2+" é = "+ ++numero2);

            /*Pre-Decremento */
            numero2 = 5;
            System.out.println("Pre-decremento de: "+numero2+" é = "+ --numero2);

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

