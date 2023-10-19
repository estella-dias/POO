package br.com.sesi.model;

public class Central {


	private String titulo;
	private double duracao; 
	private double totalDeReproducao;
	private int quantidadeDeCurtidas; 
	private double curtidas; 
	private String classificacao; 
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public double getTotalDeReproducao() {
		return totalDeReproducao;
	}

	public void setTotalDeReproducao(double totalDeReproducao) {
		this.totalDeReproducao = totalDeReproducao;
	}

	public double getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(double curtidas) {
		this.curtidas = curtidas;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	
	public int getQuantidadeDeCurtidas() {
		return quantidadeDeCurtidas;
	}

	public void setQuantidadeDeCurtidas(int quantidadeDeCurtidas) {
		this.quantidadeDeCurtidas = quantidadeDeCurtidas;
	}


	public void curtir() {
		if (curtidas <= 0) {
			System.out.println("Você não curtiu X");
		} else {
			System.out.println("Você curtiu ♥");
		}
		
	}
	
	public void quantidade() {
		
		
		//quantidadeDeCurtidas++; 
		//curtidas++;
		//curtidas * quantidadeDeCurtidas; 
		
	}
	
	
	public void imprimirMusica() {
		System.out.println("Titulo: " + titulo);
		System.out.println("Duração: " + duracao);
		System.out.println("Quantidade ouvida: " + totalDeReproducao);
		System.out.println("Quantidade de curtidas: " + curtidas);
		System.out.println("Classificação: " + classificacao);
	}
	
	public void reproduzir() {
		totalDeReproducao++;
	}
}

