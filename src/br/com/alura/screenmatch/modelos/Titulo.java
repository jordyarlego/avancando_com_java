package br.com.alura.screenmatch.modelos;

public class Titulo {

        private String nome;
        private int anoDelancamento;
        private boolean incluidoNoPlano;
        private double avaliacao;
        private int totalDeAvaliacoes;
        private int duracaoEmMinutos;


        public int getTotalDeAvaliacoes(){
            return totalDeAvaliacoes;
        }

        public int exibeFichaTecnica(){
            System.out.println("Nome do filme: "+nome);
            System.out.println("Ano de lançamento: "+anoDelancamento);
            return duracaoEmMinutos;
        }

        public boolean isIncluidoNoPlano() {
            return incluidoNoPlano;
        }

        public int getDuracaoEmMinutos() {
            return duracaoEmMinutos;
        }

        public int getAnoDelancamento() {
            return anoDelancamento;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setIncluidoNoPlano(boolean incluidoNoPlano) {
            this.incluidoNoPlano = incluidoNoPlano;
        }

        public void setAnoDelancamento(int anoDelancamento) {
            this.anoDelancamento = anoDelancamento;
        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }

        public void avaliaFilme(double nota){
            avaliacao += nota;
            totalDeAvaliacoes++;
        }

        public double mediaDasAvaliacoes(){
            return avaliacao/totalDeAvaliacoes;
        }


    }


