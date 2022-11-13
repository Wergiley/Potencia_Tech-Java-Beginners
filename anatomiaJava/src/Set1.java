import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 3.5, 8d, 9.1, 2.9, 10d, 6.2, 5.8));
        System.out.println("Conjunto de notas: ");
        System.out.println(notas.toString());
        // Confira se nota 5.8 está no conjunto: 
        System.out.println("Confira se nota  está no conjunto:  "+ notas.contains(5.8));

        System.out.println("Exiba menor nota: "+ Collections.min(notas));

        System.out.println("Exiba maior nota: "+ Collections.max(notas));

        System.out.println("Soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.println("Média das notas: "+ notas.size());

        // Remove
        notas.remove(8d);
        System.out.println("Remova a nota 8 do conjunto:\n"+notas);

        // Remova notas menores que 7 no conjunto de notas:

        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()) {
            Double next = iterator2.next();
            if(next < 7) iterator2.remove();
        }
        System.out.println("Romova notas menores que 7:\n"+notas);

        // Exiba as notas na ordem que foram informadas:
        System.out.println("Ordem informadas da notas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(3.5);
        notas2.add(8d);
        notas2.add(9.1);
        notas2.add(2.9);
        notas2.add(10d);
        notas2.add(6.2);
        notas2.add(5.8);
        System.out.println(notas2);

        // Ordem crescente: com treeset
        System.out.println("Ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        // Apagando
        notas.clear();
        System.out.println("Apagando:\n"+notas);

        System.out.println("Conjunto 1 esta vazio? "+ notas.isEmpty());
        System.out.println("COnjunto 2 esta vazio? "+ notas2.isEmpty());
        System.out.println("Conjunto 3 esta vazio? "+ notas3.isEmpty());


        // Continua...

    }
}
