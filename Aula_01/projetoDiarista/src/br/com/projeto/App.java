package br.com.projeto;


import br.com.classes.Cliente;
import br.com.classes.Diarista;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Diarista diarista = new Diarista(); 
		
		diarista.nome = "João da Silva"; 
		diarista.telefone = "(11) 96378-6884";
		diarista.endereco = "Rua Alcides Rodrigues Pontes, N600"; 
		diarista.chavePix = "123"; 
		
		System.out.println("Nome Diarista: " + diarista.nome);
		System.out.println("Telefone Diarista: " + diarista.telefone);
		System.out.println("Endereço Diarista: " + diarista.endereco);
		System.out.println("Chave Pix: " + diarista.chavePix);
		diarista.atender("José");
		System.out.println("====================================================");
		 
		Cliente cliente = new Cliente(); 
		
		cliente.nome = "José"; 
		cliente.telefone = "(11) 963786884";
		cliente.endereco = "blá blá bla"; 
		cliente.saldo = 100.0; 
		
		System.out.println("Nome Cliente: " + cliente.nome);
		System.out.println("Telefone Cliente: " + cliente.telefone);
		System.out.println("Endereço Cliente: " + cliente.endereco);
		System.out.println("Saldo Cliente: " + cliente.saldo);
		

	}

}
