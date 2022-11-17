package desafiodioPoo.bootcamp.src;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
    
    private String nome;
    private String descricao;

    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    private Set<Dev> devs = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();


    // sets - 6
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDevs(Set<Dev> devs) {
        this.devs = devs;
    }


    // gets - 6
    public String getNome() {
        return nome;
    }
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public LocalDate getDataFinal() {
        return dataFinal;
    }
    public LocalDate getDataInicial() {
        return dataInicial;
    }
    public Set<Dev> getDevs() {
        return devs;
    }
    public String getDescricao() {
        return descricao;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        BootCamp bootcamp = (BootCamp) o;
        return 
        Objects.equals(nome, bootcamp.nome) && 
        Objects.equals(descricao, bootcamp.descricao) && 
        Objects.equals(dataInicial, bootcamp.dataInicial) &&
        Objects.equals(dataFinal, bootcamp.dataFinal) &&
        Objects.equals(devs, bootcamp.devs) &&
        Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return 
        Objects.hash(nome, descricao, dataInicial, dataFinal, devs, conteudos);
    }

}
