
// singleton apressado
public class SingletonE {
    
    private static SingletonE instancia = new SingletonE();

    private SingletonE() {
        super();
    }
    // ^ ^
    public static SingletonE getInstancia() {
        return instancia; 
    }
}

