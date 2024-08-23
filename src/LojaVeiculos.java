import br.com.gabriel.consecionaria.Carro;
import br.com.gabriel.consecionaria.Moto;
import br.com.gabriel.consecionaria.Veiculo;

import java.util.ArrayList;

public class LojaVeiculos  {
    public static void main(String[] args) {

        Carro carro1 = new Carro("volksvagem","gol",2024);
        carro1.setPreco(30000);
        carro1.setNumeroDePortas(4);
        carro1.setCor("prata");
        carro1.setNumeroDeLugares(5);

        Carro carro2 = new Carro("Chevrolet","vectra",2010);
        carro2.setPreco(40000);
        carro2.setNumeroDePortas(4);
        carro2.setCor("verde");
        carro2.setNumeroDeLugares(5);

        Carro carro3 = new Carro("Chevrolet","siena",2010);
        carro3.setPreco(25000);
        carro3.setNumeroDePortas(4);
        carro3.setCor("preto");
        carro3.setNumeroDeLugares(4);

        Moto moto1 = new Moto("honda","titan",2020);
        moto1.setPreco(18000);
        moto1.setCor("vermelha");

        Moto moto2 = new Moto("honda","hornet",2021);
        moto2.setPreco(45000);
        moto2.setCor("vermelha");

        Moto moto3 = new Moto("yamaha","fazer",2023);
        moto3.setPreco(29000);
        moto3.setCor("azul");

        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        listaVeiculos.add(carro1);
        listaVeiculos.add(carro2);
        listaVeiculos.add(carro3);
        listaVeiculos.add(moto1);
        listaVeiculos.add(moto2);
        listaVeiculos.add(moto3);
        for(Veiculo veiculos:listaVeiculos){
            System.out.println(veiculos);
            if(veiculos instanceof Veiculo veiculo && veiculo.getAno() >2020){
                System.out.println("E um veiculo mais novo");
            }

        }

    }
}
