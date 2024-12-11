import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMarcos = new Dev();
        devMarcos.setNome("Marcos");
        devMarcos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Pendentes " + devMarcos.getNome() + ": " + devMarcos.getconteudosPendentes());
        devMarcos.progredir();
        devMarcos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Pendentes " + devMarcos.getNome() + ": " + devMarcos.getconteudosPendentes());
        System.out.println("Conteúdos Concluídos " + devMarcos.getNome() + ": " + devMarcos.getConteudosConcluidos());
        System.out.println("XP:" + devMarcos.calcularTotalXp());

        System.out.println("-------");

        Dev devHeloisa = new Dev();
        devHeloisa.setNome("Heloisa");
        devHeloisa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Pendentes " + devHeloisa.getNome() + ": " + devHeloisa.getconteudosPendentes());
        devHeloisa.progredir();
        devHeloisa.progredir();
        devHeloisa.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Pendentes " + devHeloisa.getNome() + ": " + devHeloisa.getconteudosPendentes());
        System.out.println("Conteúdos Concluídos " + devHeloisa.getNome() + ": " + devHeloisa.getConteudosConcluidos());
        System.out.println("XP:" + devHeloisa.calcularTotalXp());

    }
}
