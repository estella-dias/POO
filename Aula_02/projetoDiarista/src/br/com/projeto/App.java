package br.com.projeto;


import br.com.classes.*;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Diarista diarista = new Diarista(); 
		
		diarista.setNome("João da Silva");  
		diarista.setTelefone("(11) 96378-6884");
		diarista.setEndereco("Rua Alcides Rodrigues Pontes, N600"); 
		diarista.setChavePix("123"); 
		
		System.out.println("Nome Diarista: " + diarista.getNome());
		System.out.println("Telefone Diarista: " + diarista.getTelefone());
		System.out.println("Endereço Diarista: " + diarista.getEndereco());
		System.out.println("Chave Pix: " + diarista.getChavePix());
		diarista.atender("José");
		System.out.println("Saldo Cliente: " + diarista.getSaldo());
		diarista.despositar(30); 
		System.out.println("Atual saldo: " + diarista.getSaldo());
		diarista.sacar(10);
		System.out.println("Novo saldo: " + diarista.getSaldo());
		System.out.println("====================================================");
		 
		Cliente cliente = new Cliente(); 
		
		cliente.setNome("José"); 
		cliente.setTelefone("(11) 963786884");
		cliente.setEndereco("blá blá bla");
		//cliente.setSaldo(100.0); 
		
		
		System.out.println("Nome Cliente: " + cliente.getNome());
		System.out.println("Telefone Cliente: " + cliente.getTelefone());
		System.out.println("Endereço Cliente: " + cliente.getEndereco());
		System.out.println("Saldo Cliente: " + cliente.getSaldo());
		cliente.despositar(30); 
		System.out.println("Atual saldo: " + cliente.getSaldo());
		cliente.sacar(10);
		System.out.println("Novo saldo: " + cliente.getSaldo());
		
		
		
		
		
		System.out.println("=================================================");
		
		Atendimento atendimento = new Atendimento(); 
		
		
		atendimento.setHoras(12); 
		System.exit(0);
		System.out.println(atendimento.getHoras());

	}

}
