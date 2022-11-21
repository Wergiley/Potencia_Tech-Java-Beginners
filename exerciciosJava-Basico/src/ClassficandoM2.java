// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

// Abaixo segue um exemplo de código que você pode ou não utilizar:


import java.util.LinkedHashSet;
import java.util.Scanner;

public class ClassficandoM2 {
      public static void main(String args[]) {
            
        try (Scanner input = new Scanner(System.in)) {
          int i;

          System.out.print("Tamanho da Matriz? ");
          int N = input.nextInt();

          LinkedHashSet<Integer> nums = new LinkedHashSet<>();
          for ( i = 0; i < N; i++) nums.add(input.nextInt());
          System.out.println(nums);

             /*
              mova todos os inteiros pares para 
              o inicio do array, seguido por todos os números ímpares 
             */
  
          System.out.println("Pares: ");
          for (int par : nums) {
            if(par % 2 == 0) {
              System.out.println(par);
            }
          }
          System.out.println("Impares: ");
          for (int impar : nums) {
            if(impar % 2 != 0) {
              System.out.println(impar);
            }
          }
        }
    }
} 


    

