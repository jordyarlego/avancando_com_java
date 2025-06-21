public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int numAvaliacoes;
    double avaliacao;


    void exibirFichaTecnica(){
        System.out.println("Titulo: \n"+titulo+ "\nArtista: \n"+artista+"\nAno de lançamento:  \n"+anoLancamento);
    }

    void avaliarMusica(double nota){
        avaliacao += nota;
        numAvaliacoes++;

    }

    double mediaAvaliacoes(){
        return avaliacao/numAvaliacoes;
    }
}
