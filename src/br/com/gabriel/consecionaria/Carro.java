package br.com.gabriel.consecionaria;

public class Carro extends Veiculo{
    private String nomeCarro;
    private int numeroDePortas;
    private int numeroDeLugares;

    public Carro (String montadora,String modelo,int ano){
        super(montadora,modelo,ano);
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDeLugares() {
        return numeroDeLugares;
    }

    public void setNumeroDeLugares(int numeroDeLugares) {
        this.numeroDeLugares = numeroDeLugares;
    }

}
