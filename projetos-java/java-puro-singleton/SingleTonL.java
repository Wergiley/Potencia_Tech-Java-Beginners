
// singleton lento
public class SingleTonL {
    
    private static SingleTonL instancia;

    private SingleTonL() {
        super();
    }
    // ^ ^
    public static SingleTonL getInstancia() {
        if(instancia == null) {
            instancia = new SingleTonL();
        }
        return instancia; 
    }
}
