
public class Main {
    public static void main(String[] args) {
        // L
        SingleTonL lazy = SingleTonL.getInstancia();
        System.out.println(lazy);
        lazy = SingleTonL.getInstancia();
        System.out.println(lazy);

        // E
        SingletonE eager = SingletonE.getInstancia();
        System.out.println(eager);
        lazy = SingleTonE.getInstancia();
        System.out.println(eager);

        // LH
        SingletonLH lazyholder = SingletonLH.getInstancia();
        System.out.println(lazyholder);
        lazy = SingleTonLH.getInstancia();
        System.out.println(lazyholder);
    }
}
