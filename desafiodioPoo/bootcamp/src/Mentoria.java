package desafiodioPoo.bootcamp.src;
import java.time.LocalDate;

public class Mentoria extends Conteudo {

    @Override
    public double calcularXp() {
        
        return XP_PADRAO + 20d;
    }
    
    LocalDate data;

    public Mentoria() {

    }

    // gets
    
    public LocalDate getData() {
        return data;
    }
    // sets
    public void setData(LocalDate data) {
        this.data = data;
    }

    // toString para imprimir

    @Override
    public String toString() {
        return "Mentoria{"+
            "titulo='"+getTitulo()+ '\''+
            ", descricao="+getDescricao()+ '\''+
            ", data="+data+
            '}';
    }
}
