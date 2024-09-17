package br.rod.dio.desafio.domínio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java","Fundamentals Pillars of Java Poo",8);
        Curso curso2 = new Curso("JavaScript\"","Fundamentals Pillars of JavaScript",8);
        Mentoria mentoria1 = new Mentoria(LocalDate.now(),"Mentoria Dart","Mentoring of Fundamentals Concepts of Dart in Proggaming");
        System.out.println("----------");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("BootCamp For Learning Basic Syntax");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        Dev devRodger = new Dev();
        devRodger.setNome("Rodger");
        devRodger.inscreverBootcamp(bootcamp);
        devRodger.progredir();
        System.out.println("Contéudos Inscritos" + devRodger.getConteudosInscritos());
        System.out.println("Contéudos Concluidos" + devRodger.getConteudosConcluidos());
        System.out.println("XP: " + devRodger.calcularTotalXp());
        System.out.println("----------");
        Dev devIrineu = new Dev();
        devIrineu.setNome("Irineu");
        devIrineu.inscreverBootcamp(bootcamp);
        devIrineu.progredir();
        System.out.println("Contéudos Inscritos" + devIrineu.getConteudosInscritos());
        System.out.println("Contéudos Concluidos" + devIrineu.getConteudosConcluidos());
        System.out.println("XP: " + devIrineu.calcularTotalXp());
    }
}
