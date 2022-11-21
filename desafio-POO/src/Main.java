import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);
        // System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso Javacript");
        curso2.setCargaHoraria(4);
        // System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());
        // System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Bruno");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " + dev1.getNome() + ": " + dev1.getConteudoInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de " + dev1.getNome() + ": " + dev1.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos de " + dev1.getNome() + ": " + dev1.getConteudoConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXP());

        System.out.println("-------------");

        Dev dev2 = new Dev();
        dev2.setNome("Maria");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " + dev2.getNome() + ": " + dev2.getConteudoInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de " + dev2.getNome() + ": " + dev2.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos de " + dev2.getNome() + ": " + dev2.getConteudoConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXP());
    }
}