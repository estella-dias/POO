package br.com.main;

import br.com.classes.veiculo;

public class main {

	public static void main(String[] args) {
		
		//iniciando objeto
		veiculo carro = new veiculo();
		carro.nome = "Corsa";
		carro.cor = "Amarelo";
		carro.motor = "16cv"; 
		carro.velocidade = 100; 
		
		System.out.println("Nome: " + carro.nome); 
		System.out.println("Cor: " + carro.cor); 
		System.out.println("Motor: " + carro.velocidade); 
		System.out.println("Velocidade: " + carro.motor); 
		carro.ligar(); 
		carro.desligar();
		System.out.println("============================");
		
		veiculo carro2 = new veiculo(); 
		carro.nome = "Hb20"; 
		carro.cor = "Preto";
		carro.motor = "16cv"; 
		carro.velocidade = 100; 
		
		System.out.println("Nome: " + carro.nome); 
		System.out.println("Cor: " + carro.cor); 
		System.out.println("Motor: " + carro.velocidade); 
		System.out.println("Velocidade: " + carro.motor); 
		carro.ligar(); 
		carro.desligar();
	}
}
