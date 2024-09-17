package br.rod.dio.desafio.domínio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria(LocalDate data) {
        this.data = data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public double calcularXp() {
        return 0;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "data=" + data +
                '}';
    }
}
