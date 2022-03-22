package me.dio;

import me.dio.desafio.dominio.Curso;
import me.dio.desafio.dominio.Mentoria;

import java.beans.Customizer;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

    Curso curso = new Curso();

        curso.setTitulo("curso java");
        curso.setDescricao("Curso sobre java SpringBoot");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("curso javaScript");
        curso1.setDescricao("Curso sobre javaScript");
        curso1.setCargaHoraria(7);

        System.out.println(curso);
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("JAVA");
        mentoria.setDescricao("Mentoria JAVA");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);
    }
}
