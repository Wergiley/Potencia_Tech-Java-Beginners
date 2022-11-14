import java.util.HashMap;
import java.util.Map;

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
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.6);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carros.toString());

        /*Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.6);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString()); */
    }

}
