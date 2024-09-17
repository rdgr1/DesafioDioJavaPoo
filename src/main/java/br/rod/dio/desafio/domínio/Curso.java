package br.rod.dio.desafio.domínio;

public class Curso extends Conteudo {
    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(String titulo,String descricao,int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        this.setTitulo(titulo);
        this.setDescricao(descricao);
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "cargaHoraria=" + cargaHoraria +
                '}';
    }
}
