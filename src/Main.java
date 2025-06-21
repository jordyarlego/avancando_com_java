import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;


public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso negão!");
        meuFilme.setAnoDelancamento(1970);
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

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setTemporadas(4);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(20);
        lost.setAnoDelancamento(2003);
        System.out.println("Duração para maratonar lost: "+lost.getDuracaoEmMinutos()+" min");

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Avatar");
        meuFilme2.setAnoDelancamento(2009);
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

    }
}