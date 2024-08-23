package br.com.gabriel.consecionaria;

public class Veiculo {
    private String montadora;
    private String modelo;
    private int ano;
    private double preco;
    private String cor;

    public Veiculo (String montadora,String modelo, int ano){
        this.montadora=montadora;
        this.modelo=modelo;
        this.ano = ano;
    }
    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "A montadora e: " + this.getMontadora() + " Modelo: " + getModelo() + " Ano: " + "(" + getAno() + ")" ;
    }
}
