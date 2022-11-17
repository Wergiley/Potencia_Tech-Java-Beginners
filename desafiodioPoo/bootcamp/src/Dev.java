package desafiodioPoo.bootcamp.src;

import java.util.Objects;
import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluido = new LinkedHashSet<>();

    public void inscreverBootcamp(BootCamp bootcamp) {}

    public void progredir() {}

    public void calcularTotalXp() {}

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setInscritos(Set<Conteudo> conteudosInscrito) {
        this.conteudosInscrito = conteudosInscrito;
    }

    public void setConcluido(Set<Conteudo> conteudosConcluido) {
        this.conteudosConcluido = conteudosConcluido;
    }

    public Set<Conteudo> getInscritos() {
        return conteudosInscrito;
    }

    public Set<Conteudo> getConcluidos() {
        return conteudosConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return 
        Objects.equals(nome, dev.nome) && 
        Objects.equals(conteudosInscrito, dev.conteudosInscrito) && 
        Objects.equals(conteudosConcluido, dev.conteudosConcluido);
    }

    @Override
    public int hashCode() {
        return 
        Objects.hash(nome, conteudosInscrito, conteudosConcluido);
    }

}
