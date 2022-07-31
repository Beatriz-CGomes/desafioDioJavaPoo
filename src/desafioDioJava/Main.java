package desafioDioJava;

import java.time.LocalDate;

import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
	    curso1.setTitulo("Curso de Java");
	    curso1.setDescricao("Descrição do Curso de Java");
	    curso1.setCargaHoraria(8);
		
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Back-end");
		curso2.setDescricao("Descrição do curso completo de back-end");
	    curso2.setCargaHoraria(16);
		
		Mentoria mentoria = new Mentoria();
	    mentoria.setTitulo("Mentoria de Java");
	    mentoria.setDescricao("Descrição de Java");
	    mentoria.setData(LocalDate.now());

		
		
		//System.out.println(curso1);		
		//System.out.println(curso2);		
		//System.out.println(mentoria);	
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp de Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		
		Dev devBeatriz = new Dev();
		devBeatriz.setNome("Beatriz");
		devBeatriz.inscreverBootcamp(bootcamp);
		devBeatriz.progredir();
		devBeatriz.progredir();
		
		System.out.println("Conteudos Inscritos " + devBeatriz.getConteudosInscritos() );
		
		System.out.println("Conteudos Concluidos " + devBeatriz.getConteudoConcluidos() );
		
		System.out.println("XP: " + devBeatriz.calcularTotalXp());
		
		System.out.println("---------------------------");
		
		Dev devPoliana = new Dev();
		devPoliana.setNome("Poliana");
		devPoliana.inscreverBootcamp(bootcamp);
		devPoliana.progredir();
		devPoliana.progredir();
		devPoliana.progredir();
		
		System.out.println("Conteudos Inscritos " + devPoliana.getConteudosInscritos() );
        System.out.println("Conteudos Concluidos " + devPoliana.getConteudoConcluidos() );
        System.out.println("XP: " + devPoliana.calcularTotalXp());
		
		
	}

}
