import java.util.Scanner;

// SOLUÇÃO DO DESAFIO - Código do João Guedes.
public class ClassificandoMatrizes {
public static void sort(int[] array) {
    boolean isOdd;
    int OddIndex = -1;
    int i = 0;
    while (i < array.length) {
        isOdd = array[i] % 2 != 0;
        if (isOdd && OddIndex == -1)
            OddIndex = i;
        else if (!isOdd && OddIndex >= 0) {
            ClassificandoMatrizes.swap(array, OddIndex, i);
            i = OddIndex;
            OddIndex = -1;
        }
        i++;
    }
}

public static void swap(int[] array, int index1, int index2) {
    int aux = array[index1];
    array[index1] = array[index2];
    array[index2] = aux;
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    int [] nums = new int[size];
    for (int i = 0; i < size; i++)
        nums[i] = input.nextInt();
    input.close();

    ClassificandoMatrizes.sort(nums);
    System.out.println("Saída dos dados:");
    for (int number : nums)
        System.out.println(number);
	}

    
}
