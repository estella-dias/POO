package br.com.classes;

public class Cliente extends Pessoa{
	

	@Override
	public void sacar(int valor) {
		// TODO Auto-generated method stub
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual - valor ;
		this.setSaldo(novoSaldo);
	}

	@Override
	public void despositar(int valor) {
		// TODO Auto-generated method stub
		
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual + valor + (valor * 0.1) ;
		this.setSaldo(novoSaldo); 
		
		
	} 
	
}
