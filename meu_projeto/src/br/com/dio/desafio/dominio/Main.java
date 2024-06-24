package br.com.dio.desafio.dominio;

import java.time.LocalDate;
//Giordanni
public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Java basico");
		curso1.setDescricao("Conceitos de java básico");
		curso1.setCargaHoraria(4);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Java OO");
		curso2.setDescricao("Orientação a Objetos com java");
		curso2.setCargaHoraria(8);
		
		
		Mentoria mentoria_java_basico = new Mentoria();
		mentoria_java_basico.setTitulo("Mentoria de java");
		mentoria_java_basico.setDescricao("Mentoria de java básico pelo youTube");
		mentoria_java_basico.setData(LocalDate.of(2023,06,27));
		
		Mentoria mentoria_java_oo = new Mentoria();
		mentoria_java_oo.setTitulo("Mentoria de Java");
		mentoria_java_oo.setDescricao("Mentoria de OO com java pelo youTube");
		mentoria_java_oo.setData(LocalDate.of(2024,06,30));
		

		BootCamp bootcamp_java = new BootCamp();
		bootcamp_java.setNome("Bootcamp de java developer");
		bootcamp_java.setDescricao("Descricao do bootcamp da java");
		bootcamp_java.getConsteudos().add(curso1);
		bootcamp_java.getConsteudos().add(curso2);
		bootcamp_java.getConsteudos().add(mentoria_java_basico);
		bootcamp_java.getConsteudos().add(mentoria_java_oo);
		
		
		Dev devGiordanni = new Dev();
		devGiordanni.setNome("Giordanni");
		devGiordanni.inscreverBotcamp(bootcamp_java);
		System.out.println("Conteúdos incritos de " + devGiordanni.getNome() + " : " + devGiordanni.getConteudosInscritos());
		System.out.println("---");
		devGiordanni.progredir();
		devGiordanni.progredir();
		System.out.println("Conteúdos incritos de " + devGiordanni.getNome() + " : " + devGiordanni.getConteudosInscritos());
		System.out.println("Conteúdos concluidos de " + devGiordanni.getNome() + " : " + devGiordanni.getConteudosConcluidos());
		System.out.println("XP: " + devGiordanni.calcularTotalXp());
		
		System.out.println("==============================================");
		
		Dev devAldo = new Dev();
		devAldo.setNome("Aldo");
		devAldo.inscreverBotcamp(bootcamp_java);
		System.out.println("Conteúdos incritos de " + devAldo.getNome() + " : " + devAldo.getConteudosInscritos());
		System.out.println("---");
		devAldo.progredir();
		devAldo.progredir();
		devAldo.progredir();
		devAldo.progredir();
		System.out.println("Conteúdos incritos de " + devGiordanni.getNome() + " : " + devAldo.getConteudosInscritos());
		System.out.println("Conteúdos concluidos de " + devAldo.getNome() + " : " + devAldo.getConteudosConcluidos());
		System.out.println("XP: " + devAldo.calcularTotalXp());

		
	}

}
