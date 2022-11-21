// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

// Abaixo segue um exemplo de código que você pode ou não utilizar:


import java.util.LinkedHashSet;
import java.util.Scanner;

public class ClassficandoM2 {
     public static void main(String args[]) {
   
      Scanner scan = new Scanner(System.in);

      System.out.print("Quantos numeros da Matriz?: ");
      int N = scan.nextInt();

      System.out.println("Digite os número: ");

      LinkedHashSet<Integer> nums = new LinkedHashSet<>();
      
      for (int i = 0; i < N; i++) nums.add(scan.nextInt());

      System.out.println("DADOS DE SAÍDA: ");
      for( int num : nums) {
        if(num % 2 == 0) {
          System.out.println(num);
        }
      }

      for(int num : nums) {
        if(num % 2 != 0) {
          System.out.println(num);
        }
      }
    }
} 
    

