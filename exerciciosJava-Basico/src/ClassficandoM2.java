// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.*;
import java.util.Scanner;

public class ClassficandoM2 {
    public static void main(String args[]) {
          
     Scanner input = new Scanner(System.in);
      int i, aux = 0;
      int N = input.nextInt();
    	int [] nums = new int[N];
    	  for (i = 0; i < N; i++)
    	  {
    		  nums[i] = input.nextInt();
    	  }
    	  
    //TODO: mova todos os inteiros pares para o inicio do array, seguido por todos os números ímpares 
     int[] ordenacao = new int[N];
      // Código: PRECISA SER REVISADO****
      for(i = 0; i < N; i++){
        if(nums[i] % 2 == 0){
          ordenacao[aux] = nums[i];
          aux++;
        }
      }

      for(i = 0; i < N; i++){

        if(nums[i] % 2 != 0){

          for(int j = 0; j < N; j++){
            if(ordenacao[j] == 0){
              ordenacao[j] = nums[i];
              break;
            }
          }
        }
      }
      for(int n : ordenacao){
        System.out.println(n);
      }
  }
} 
    

