public class Quadrilatero {
    /*Ex 02 - Sobrecarga */
    public static void area(double lado) {
        System.out.println("A area do quadrado: "+ lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("A area do quadrado: "+ lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("A area do quadrado: "+ ((baseMaior+baseMenor)*altura)/ 2);
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("A area do losango: "+ (diagonal1*diagonal2)/2);
    }
}
