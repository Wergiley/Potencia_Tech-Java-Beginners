import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class ExemploMap {
    // Map é um objeto, cada objeto dentro de um map tem uma key com valores unicos, apenas valores podem ser duplicado.
    public static void main(String[] args) {
        /*Ex 01 - Dados os modelos dos carros e seus respctivos consumos na estrada, faça:
         * modelo = gol - consumo = 14,4Km/L
         * modelo = uno - consumo = 15,6Km/L
         * modelo = mobi - consumo = 16,1Km/L
         * modelo = hb20 - consumo = 14,5Km/L
         * modelo = kwid - consumo = 15,6Km/L
         * 
         * formas de criar um map:
         * Map X = new HashMap();
         * Map<String, Double> X = new HashMap<>();
         * HashMap<String, Double> X = new HashMap<>();
         * Map<String, Double> X = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6);
         * 
         * Crie um dicionário que relacione os modelos e seus consumo:
         */

        Map<String, Double> carros = new HashMap<>(){{
            put("gol", 15.2);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carros.toString());

        System.out.println("Substitua o consomo do gol por 15,2 Km/L: ");
        carros.put("gol", 15.2);
        System.out.println(carros);

        System.out.println("Confira se o modelo Tucson está na lista: "+ carros.containsKey("tuckson"));

        System.out.println("Confira se o modelo Gol está na lista: "+ carros.containsKey("gol"));

        System.out.println("Consumo do Uno: "+ carros.get("uno"));

        System.out.println("Exiba os modelos dos carro: ");
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumos = carros.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais economico: ");
        Double maisEconomico = Collections.max(carros.values());
        System.out.println(maisEconomico);

        System.out.println("Exiba o menos economico: ");
        Double menosEconomico = Collections.min(carros.values());
        System.out.println(menosEconomico);

        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloEconomico = "";
        for(Map.Entry<String, Double> entry: entries) {
            if(entry.getValue().equals(maisEconomico)) modeloEconomico = entry.getKey();
        }
        System.out.println(modeloEconomico+" - "+maisEconomico);

        System.out.println("Exiba o modelo menos economico e seu consumo: ");
        String modeloMenosEconomico = "";
        for(Map.Entry<String, Double> entry: carros.entrySet()) {
            if(entry.getValue().equals(menosEconomico)) modeloMenosEconomico = entry.getKey();
        }
        System.out.println(modeloMenosEconomico+" - "+menosEconomico);

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Exiba a média dos consumos: "+ soma/carros.size());

        System.out.println(carros);
        System.out.println("Remova os modelos igual a 15.6 Km/L: ");
        Iterator<Double> iterator2 = carros.values().iterator();
        while(iterator2.hasNext()) {
            if(iterator2.next().equals(15.6)) iterator2.remove();;
        }
        System.out.println(carros);

        System.out.println("Exiba todos os carros que foram informados na ordem: ");
        Map<String, Double> carros2 = new LinkedHashMap<>(){{
            put("gol", 15.2);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carros2.toString());
        
        System.out.println("Exiba o dicionario na ordem do modelo: ");
        Map<String, Double> carros3 = new TreeMap<>(carros){{
            put("gol", 15.2);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carros3.toString());

        System.out.println("Apague o dicionario de carros: ");
        carros.clear();
        System.out.println(carros);
        System.out.println("Dicionario está vazio? "+carros.isEmpty());
      
    }

}
