import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "2", "3", "4", "5", "6", "0", "9", "9", "1");

        // Imprimindo em ordem:
        System.out.println("Em ordem em linha:\n"+numerosAleatorios);

        // Imprimindo em coluna:
        System.out.println("Em ordem em coluna: ");
        numerosAleatorios.stream().forEach(System.out::println);

        // Imprima todos os elementos da lista:
        System.out.println("Imprima todos os elementos da lista:");
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // Imprima todos os elementos com o Lambda:
        System.out.println("Imprima todos os elementos com o Lambda:");
        numerosAleatorios.stream().forEach(s -> System.out.println(s));

        // Pegue os 5 primeiros numeros e coloque dentro de um set:
        System.out.println("Colocando dentro do Set os 5 primeiros numeros: ");
        // Caso o valor seja repetido, considera-se o primeiro, o Set, não o mostrará.
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        // outra forma de coletar os 5 numeros para dentro do set: 
        Set<String> coletandoSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());
        System.out.println("Colocando dentro do Set os 5 primeiros numeros, Ex 02: ");
        System.out.println(coletandoSet);

        // Transforme a lista em uma lista String em uma lista de numeros inteiros:
        // EX 01
        numerosAleatorios.stream().map(new Function<String, Integer>() {

            @Override
            public Integer apply(String t) {
                
                return Integer.parseInt(t);
            }
            
        });
        System.out.println("Transforme a lista em uma lista String em uma lista de numeros inteiros Ex01:");
        System.out.println(numerosAleatorios);

        // Ex 02
        numerosAleatorios.stream().map(s -> Integer.parseInt(s));
        System.out.println("Transforme a lista em uma lista String em uma lista de numeros inteiros Ex02:");
        System.out.println(numerosAleatorios);
        
        // Ex 03
        System.out.println("Transforme a lista em uma lista String em uma lista de numeros inteiros Ex 03:");
        // passa pra inteiro - coleta para a lista - imprime atravéis do forEach
        numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);

        // Atribuindo a uma variavel: 
        System.out.println("Atribuindo a uma variavel: Numeros Inteiros: ");
        List<Integer> numerosInteiros = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(numerosInteiros);
        

    }
    
}
