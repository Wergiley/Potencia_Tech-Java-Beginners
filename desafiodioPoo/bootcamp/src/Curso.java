package desafiodioPoo.bootcamp.src;

    public class Curso extends Conteudo {

        @Override
        public double calcularXp() {

            return XP_PADRAO * cargaHoraria;
        }

        private int cargaHoraria;

        public Curso() {

        }
    
        // get
        public int getCargaHoraria() {
            return cargaHoraria;
        }
        // set
        public void setCargaHoraria(int cargaHoraria) {
            this.cargaHoraria = cargaHoraria;
        }
    
        // toString para imprimir
        @Override
        public String toString() {
            return "Curso{"+
                "titulo='" + getTitulo()+ '\''+
                ", descricao="+ getDescricao() + '\'' +
                ", cargaHoraria="+ cargaHoraria+
                '}';
        }
    }
    

