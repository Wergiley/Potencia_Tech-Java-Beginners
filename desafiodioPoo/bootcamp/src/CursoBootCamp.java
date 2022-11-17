package desafiodioPoo.bootcamp.src;

    public class CursoBootCamp {
        private String titulo;
        private String descricao;
        private int cargaHoraria;
    
        // Grupo de gets
        public String getTitulo() {
            return titulo;
        }
        public String getDescricao() {
            return descricao;
        }
        public int getCargaHoraria() {
            return cargaHoraria;
        }
        // Grupo de sets
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
    
        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }
    
        public void setCargaHoraria(int cargaHoraria) {
            this.cargaHoraria = cargaHoraria;
        }
    
        // toString para imprimir
    
        @Override
        public String toString() {
            return "ErroException{"+
                "titulo='" + titulo+ '\''+
                ", descricao="+ descricao + '\'' +
                ", cargaHoraria="+ cargaHoraria+
                '}';
        }
    
}
    

