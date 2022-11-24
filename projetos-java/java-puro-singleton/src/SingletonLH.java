

// singleton "Lazy Holder"
public class SingletonLH {
    
    private static class InstanciaHolder {
        public static SingletonLH instancia = new SingletonLH();
    }
    

    private SingletonLH() {
        super();
    }
    // ^ ^
    public static SingletonLH getInstancia() {
        return InstanciaHolder.instancia; 
    }
}


