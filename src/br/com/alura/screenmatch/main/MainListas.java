package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class MainListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso negão!", 2014);
        meuFilme.avaliaFilme(10);
        Filme meuFilme2 = new Filme("Avatar", 2009);
        meuFilme2.avaliaFilme(9);
        var filmeDoPaulo = new Filme("O paulo escovar", 2018);
        filmeDoPaulo.avaliaFilme(4);
        Serie lost = new Serie("Lost", 2002);



        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(filmeDoPaulo);
        lista.add(lost);
        for(Titulo item: lista
        ){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao()>=4){
                System.out.println("Classificação: "+ filme.getClassificacao());

            }


        }

        List<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("Lula ladrão");
        buscaPorArtista.add("Dilma vagabunda");
        buscaPorArtista.add("Alexandre de moraes");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: "+buscaPorArtista);
        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: "+lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDelancamento));
        System.out.println("Lista ordenada por ano de lançamento: "+lista);



    }
}
