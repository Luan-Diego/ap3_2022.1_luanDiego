package Unidade2.br.com.luandiego.ap3.exercicio6.projetocarro;

import java.time.LocalDate;

import Unidade2.br.com.luandiego.ap3.exercicio6.projetocarro.endereco.CEP;
import Unidade2.br.com.luandiego.ap3.exercicio6.projetocarro.endereco.Endereco;
import Unidade2.br.com.luandiego.ap3.exercicio6.projetocarro.endereco.Estado;

public class TestaCarro {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Jeilson Barablho");
        Marca marca = new Marca();

        Endereco endereco = new Endereco(
            "Cabuçe", 
            "Centro", 
            "Alto do Rodrigues", 
            21, 
            new CEP(59507, 000), 
            Estado.RN
        );

        Dono dono = new Dono("Luan Diego da Silva Nunes", endereco);

        LocalDate localDate = LocalDate.now();

        marca.setAnoLancamento(localDate);
        marca.setCodigoIdentificador(13937000);
        marca.setNome("Subaru Impreza WRX STI 2011");
        marca.setNrDeModelos(13);

        carro.setMarca(marca);
        carro.setAno(localDate);
        carro.setCambio(Cambio.MANUAL);
        carro.setCor("Azul");
        carro.setModelo("Conversivel");
        carro.setNumChassi("HWK21");
        carro.setNumeroPortas(4);
        carro.setQuantidadeMarchas(5);
        carro.setTetoSolar(false);
        carro.setVelocidadeAtual(0);
        carro.setVelocidadeMaxima(231);
        carro.setVolumeTanque(60);

        dono.getCarros().add(carro);

        System.out.println(dono);
        for(Carro c: dono.getCarros()){
            System.out.println(carro);
        }
    }
}