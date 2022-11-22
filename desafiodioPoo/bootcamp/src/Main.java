package bootcamp.src;

import java.time.LocalDate;

public class Main {
    
    public static void main(String[] args) {
        // Primeiro  curso
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Linguagem Java");
        curso1.setCargaHoraria(40);
        // Segundo curso
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de HTML e CSS");
        curso2.setDescricao("Linguagem HTML");
        curso2.setCargaHoraria(30);

        //Imprime:
        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição: Mentoria de Java");
        mentoria.setData(LocalDate.now());
        //Imprime:
        System.out.println(mentoria);

        Conteudo conteudo = new Curso();
        System.out.println(conteudo);

        /*
        Será organizado a saída de dados para uma forma mais legível.
         */
    }
}
