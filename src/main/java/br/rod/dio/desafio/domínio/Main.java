package br.rod.dio.desafio.domínio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(8);
        Curso curso2 = new Curso(8);
        curso1.setTitulo("Java");
        curso1.setDescricao("Fundamentals Pillars of Java Poo");
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Base of Content Javascript");

        Mentoria mentoria1 = new Mentoria(LocalDate.now());
        mentoria1.setTitulo("Mentoria Dart");
        mentoria1.setDescricao("Mentoring of Fundamentals Concepts of Dart in Proggaming");


    }
}
