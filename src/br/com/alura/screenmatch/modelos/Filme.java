package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public Filme(String nome, int anoDelancamento) {
        super(nome, anoDelancamento);

    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)mediaDasAvaliacoes() /2;
    }

    @Override
    public String toString() {
        return "Filme: "+ this.getNome() + " (" + this.getAnoDelancamento() + ")";
    }
}
