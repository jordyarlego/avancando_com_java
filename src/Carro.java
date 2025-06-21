public class Carro {
    String modelo;
    int ano;
    String cor;


    void exibirFichaTecnica(){
        System.out.println("Modelo: "+modelo+"\nAno: "+ano+"\nCor: "+cor);
    }

    int calcularIdadeCarro(){
        return 2025-ano;
    }
}

