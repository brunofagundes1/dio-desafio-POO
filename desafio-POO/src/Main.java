import java.time.LocalDate;

import dominio.Curso;
import dominio.Mentoria;

public class Main{
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Javascript");
        curso2.setDescricao("descricao curso Javacript");
        curso2.setCargaHoraria(4);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("descricao mentoria Java");
        mentoria1.setData(LocalDate.now());
        System.out.println(mentoria1);
    }
}