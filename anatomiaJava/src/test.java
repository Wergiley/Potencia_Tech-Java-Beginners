
import java.util.Scanner;

class test {
    public static void main(String[] args) {
       // Código padrão do exercício Classificando Matrizes a ser estudado e conluído.
        Scanner input = new Scanner(System.in);

        int i;
        System.out.println();

        System.out.println("Tamanho da Matriz? ");
        int N = input.nextInt();
        int [] nums = new int[N];
        // for de recebimento dos valores.
    	  for (i = 0; i < N; i++)
    	  {
    		  nums[i] = input.nextInt();
    	  }

        // 
        int j = 0;

        for (i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = nums[i] ^ nums[j] ^ (nums[j] = nums[i]);

            } else if(nums[i] % 2 == 0) {
                //  Código Aqui 
            }
        }
        System.out.println("Dados de saída: ");
        // Atribuição de valores do vetor em entry /*.
        for (var entry : nums) {
            System.out.println(entry);
        }
    }
}