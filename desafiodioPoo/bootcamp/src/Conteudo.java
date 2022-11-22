package bootcamp.src;

public abstract class Conteudo {
    
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    // get - pega
    public String getTitulo() {
        return titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    // set - configura
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
