import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
//import java.util.stream.Collector;
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

        // Pegue os numeros pares e maiores que 2 e coloque em uma lista:
        System.out.println("Coloque os numeros pares e maiores que 2 e coloque em uma lista:");

        // Ex 01
        List<Integer> numerosPares = numerosAleatorios.stream().map(Integer::parseInt).filter(new Predicate<Integer>() {
           @Override
           public boolean test(Integer i) {
            if(i%2 == 0 && i > 2 ) return true;
            return false;
           } 
        }).collect(Collectors.toList());
        System.out.println(numerosPares);

        // Ex 02
        System.out.println("Coloque os numeros pares e maiores que 2 e coloque em uma lista:");
        List<Integer> numerosPares2 = numerosAleatorios.stream().map(Integer::parseInt).filter(i -> i % 2 == 0 && i > 2).collect(Collectors.toList());
        System.out.println(numerosPares2);


        // Mostre a média dos numeros: 
        // Ex 01
        System.out.println("Mostre a média dos numeros 01:");
        numerosAleatorios.stream()
            .mapToInt(new ToIntFunction<String>() {
                @Override
                public int applyAsInt(String s) {
                    return Integer.parseInt(s);
                }
            });
        
        // Ex 02
        System.out.println("Mostre a média dos numeros 02:");
        numerosAleatorios.stream().mapToInt(s -> Integer.parseInt(s));

        // Ex 03
        System.out.println("Mostre a média dos numeros 03:");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent( new DoubleConsumer() {
            @Override
            public void accept(double v) {
                System.out.println(v);
            }
        });

        // Ex 04
        System.out.println("Mostre a média dos numeros 04:");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        // Removendo Impares:
        List<Integer> n = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        n.removeIf(new Predicate<Integer>() {

            @Override
            public boolean test(Integer t) {
                if(t % 2 != 0 ) return true;
                return false;
            }
            
        });
        System.out.println("Removendo Impares:");
        System.out.println(n);

        n.removeIf(integer -> (integer % 2 != 0) );
        System.out.println("Removendo Impares:");
        System.out.println(n);


    }
    
}
