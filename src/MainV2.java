import java.time.LocalDate;

import br.com.dio.desafio.v2.Bootcamp;
import br.com.dio.desafio.v2.Curso;
import br.com.dio.desafio.v2.Dev;
import br.com.dio.desafio.v2.Mentoria;

public class MainV2 {
    public static void main(String[] args) {
        // Criando os cursos da versão 2
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java Avançado");
        curso1.setDescricao("Descrição do curso Java avançado.");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript.");
        curso2.setCargaHoraria(8);

        // Criando mentoria da versão 2
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("Descrição da mentoria em Java.");
        mentoria.setData(LocalDate.now());

        // Criando o Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer - V2");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer versão 2.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Criando o Dev Camila e inscrevendo no Bootcamp
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP Total: " + devCamila.calcularTotalXp());

        System.out.println("-------");

        // Criando o Dev João e inscrevendo no Bootcamp
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP Total: " + devJoao.calcularTotalXp());
    }
}

