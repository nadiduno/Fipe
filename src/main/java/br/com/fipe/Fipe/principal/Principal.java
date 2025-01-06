package br.com.fipe.Fipe.principal;

import java.util.Scanner;

import br.com.fipe.Fipe.service.consumeApi;

public class Principal {
	
	private Scanner leitura = new Scanner(System.in);
	private consumeApi consume = new consumeApi();
	private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";
	
	
	public void showMenu() {
		var menu = """
	            *** OPÇÕES ***
	            Carro
	            Moto
	            Caminhão
	            
	            Digite uma das opções para consulta:
	            
	            """;
	            
		System.out.println(menu);
        var opcao = leitura.nextLine();
        String endereco;
        
        if (opcao.toLowerCase().contains("carr")){
            endereco = URL_BASE + "carros/marcas";
        } else if (opcao.toLowerCase().contains("mot")) {
            endereco = URL_BASE + "motos/marcas";
        } else {
            endereco = URL_BASE + "caminhoes/marcas";
        }
        
        var json = consume.obterDados(endereco);
        System.out.println(json);
	}
}
