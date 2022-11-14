import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        // Conjunto Séries:
        Set<Series> minhasSeries1 = new HashSet<>(){{
            add(new Series("got", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that 70s show", "comedia", 30));
            add(new Series("soul", "terror", 25));
        }};
        System.out.println("Mostra lista de series:");
        for(Series serie: minhasSeries1) 
        System.out.println(serie.getNome()+" - "
        + serie.getGenero()+" - "
        + serie.getTempoEpisodio()); 

        System.out.println("Compara e Ordena lista de series por tempo, e etc:");
        Set<Series> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for(Series serie: minhasSeries2) 
        System.out.println(serie.getNome()+" - "
        + serie.getGenero()+" - "
        + serie.getTempoEpisodio()); 

        //
        Set<Series> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        System.out.println("Comparação:");

        minhasSeries3.addAll(minhasSeries1);

        for(Series serie: minhasSeries3) 
        System.out.println(serie.getNome()+" - "
        + serie.getGenero()+" - "
        + serie.getTempoEpisodio()); 
        


    }
       
}

class Series implements Comparable <Series> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Series(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }
  


    @Override
    public String toString() {
        return "{"+
                "nome='"+nome+'\''+
                ",genero="+genero+
                ",tempoEpisodio='"+tempoEpisodio+'\''+'}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o ) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Series serie = (Series) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);

    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Series serie) {
        // int genero = this.getGenero().compareTo(serie.getGenero());
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        
        if(tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());

        // return Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
    }

}

class ComparatorNomeGeneroTempo implements Comparator<Series> {

    @Override
    public int compare(Series s1, Series s2) {

        int nome = s1.getNome().compareTo(s2.getNome());

        if(nome != 0) return nome;

        int genero =  s1.getGenero().compareTo(s2.getGenero());

        if(genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());  
       
    }
    // Exercicios Final da Aula: 
    /*Crie um conjunto de cores contendo as cores do arco-iris e:
     * Exiba todas as cores uma a baixo da outra.
     * A quantidade de cores que o arco-iris tem.
     * Exiba as cores em ordem alfabetica.
     * Exiba as cores na ordem inversa da que foi informada.
     * Remova todas as cores que não começam com a letra v.
     * Limpe o conjunto.
     * Confira se o conjunto está vazio.
     */

}

