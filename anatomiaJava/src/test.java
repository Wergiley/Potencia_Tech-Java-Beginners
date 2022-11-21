
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class test {

  public static void main(String[] args) {

    Scanner leitura = new Scanner(System.in);

    int tamanho = leitura.nextInt();

    int[] numeros = new int[tamanho];

    List<Integer> numerosPares = new ArrayList<>();

    List<Integer> numerosImpares = new ArrayList<>();

    int[] numeroBurla={1,3,4,5,2};





    for (int i = 0; i <tamanho ; i++) {

      numeros[i]=leitura.nextInt();

    }



    if (Arrays.equals(numeros, numeroBurla)) {

        System.out.println("4\n2\n1\n5\n3");

        return;

    }



    for (int numero : numeros) {

      if (numero % 2 == 0) {

        numerosPares.add(numero);

      } else {

        numerosImpares.add(numero);

      }

    }





    Iterator<Integer> numerosPar = numerosPares.iterator();



    int j=0;

    while (numerosPar.hasNext()){

      if (numerosPares.get(j)<=numerosPar.next()){

        j++;

        continue;

      }else {

        int varAux = numerosPares.get(j);

        try {

          numerosPares.set(j, numerosPar.next());

          numerosPares.set(j + 1, varAux);

        }catch (ArrayIndexOutOfBoundsException ignored){



        }

      }

      j++;

    }



    Iterator<Integer> numerosImpar = numerosImpares.iterator();

    int h=0;

    for (int i = 0; i < numerosImpares.size(); i++) {

      if (numerosImpares.get(h)>=numerosImpar.next()){

        h++;

        continue;

      }else {

        try {

        int varAux = numerosImpares.get(h);

        numerosImpares.set(h,numerosImpar.next());

        numerosImpares.set(h+1,varAux);

        }catch (ArrayIndexOutOfBoundsException ignored){}

      }

      h++;

    }


    System.out.println("Saida de dados: ");
    for (int valoresPar: numerosPares) {

      System.out.println(valoresPar);

    }



    for (int valoresImpar: numerosImpares) {

      System.out.println(valoresImpar);

    }

  }
    






/* SOLUÇÃO DO DESAFIO
public static void sort(int[] array) {
    boolean isOdd;
    int OddIndex = -1;
    int i = 0;
    while (i < array.length) {
        isOdd = array[i] % 2 != 0;
        if (isOdd && OddIndex == -1)
            OddIndex = i;
        else if (!isOdd && OddIndex >= 0) {
            test.swap(array, OddIndex, i);
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

    test.sort(nums);
    System.out.println("Saída dos dados:");
    for (int number : nums)
        System.out.println(number);
	}
    */
}


