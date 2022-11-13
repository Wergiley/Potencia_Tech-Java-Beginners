import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 3.5, 8d, 9.1, 2.9, 10d, 6.2, 5.8));
        System.out.println("Conjunto de notas: ");
        System.out.println(notas.toString());
        // Exiba a posição da nota 5:
    }
}
