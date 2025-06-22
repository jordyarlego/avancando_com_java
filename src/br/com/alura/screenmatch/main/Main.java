package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso negão!", 2014);


        meuFilme.setDuracaoEmMinutos(30);

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliaFilme(5);
        meuFilme.avaliaFilme(3);
        meuFilme.avaliaFilme(4);
        meuFilme.avaliaFilme(2);
        meuFilme.avaliaFilme(9);
        meuFilme.avaliaFilme(10);

        System.out.println("Total de avaliacoes: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.mediaDasAvaliacoes());
        System.out.println("Duracao em minutos: " + meuFilme.getDuracaoEmMinutos()+" min");

        Serie lost = new Serie("Lost", 2002);

        lost.setTemporadas(4);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(20);

        System.out.println("Duração para maratonar lost: "+lost.getDuracaoEmMinutos()+" min");

        Filme meuFilme2 = new Filme("Avatar", 2009);


        meuFilme2.setDuracaoEmMinutos(110);
        meuFilme2.avaliaFilme(5);
        meuFilme2.avaliaFilme(4);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal()+" minutos");
        calculadora.inclui(meuFilme2);
        System.out.println(calculadora.getTempoTotal()+" minutos");
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal()+" minutos");

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(meuFilme2);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(500);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("O paulo escovar", 2018);


        filmeDoPaulo.setDuracaoEmMinutos(120);
        filmeDoPaulo.avaliaFilme(5);
        filmeDoPaulo.avaliaFilme(4);
        filtro.filtra(filmeDoPaulo);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);
        listaDeFilmes.add(filmeDoPaulo);
        System.out.println("Tamanho da lista: "+listaDeFilmes.size());
        System.out.println("Primeiro filme: "+listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);



    }
}