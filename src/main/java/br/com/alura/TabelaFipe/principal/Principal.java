package br.com.alura.TabelaFipe.principal;

import br.com.alura.TabelaFipe.service.ConsumoApi;

import java.util.Scanner;

public class Principal {
    public void exibirMenu(){
        Scanner sc = new Scanner(System.in);
        ConsumoApi consumoApi = new ConsumoApi();

        final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

        var menu = "**** Menu de opçoões ****" +
                "\nCarro" +
                "\nMoto" +
                "\nCaminhao" +

                "\n**** Digite uma opção ****";

        System.out.println(menu);
        var opcao = sc.nextLine();

        String endereco;
        if (opcao.toLowerCase().contains("carr")){
            endereco = URL_BASE + "carros/marcas";
        } else if (opcao.toLowerCase().contains("mot")) {
            endereco = URL_BASE + "motos/marcas";
        } else {
            endereco = URL_BASE + "caminhoes/marcas";
        }

        var json = consumoApi.obterDados(endereco);
        System.out.println(json);
    }
}
