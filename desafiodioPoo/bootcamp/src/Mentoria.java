package desafiodioPoo.bootcamp.src;
import java.time.LocalDate;

public class Mentoria {
    String titulo;
    String descricao;
    LocalDate data;

    // Grupo de gets
    public String getTitulo() {
        return titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public LocalDate getData() {
        return data;
    }
    // Grupo de sets
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    // toString para imprimir

    @Override
    public String toString() {
        return "ErroException{"+
            "titulo='" + titulo+ '\''+
            ", descricao="+ descricao + '\'' +
            ", data="+ data+
            '}';
    }

}
