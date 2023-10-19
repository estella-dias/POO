package br.com.sesi.app;
import br.com.sesi.model.Musicas2;
import br.com.sesi.model.Podcast2;

public class Main {

	public static void main(String[] args) {
		
		Musicas2 primeiraMusica = new Musicas2(); 
		
		primeiraMusica.setTitulo("Greddy");
		primeiraMusica.setDuracao(4.15);
		primeiraMusica.setTotalDeReproducao(4);
		primeiraMusica.setQuantidadeDeCurtidas(0);
		primeiraMusica.setCurtidas(1);
		primeiraMusica.setClassificacao("1° lugar");
		
		primeiraMusica.curtir();
		primeiraMusica.reproduzir();
		primeiraMusica.imprimirMusica();
		
		System.out.println("===============================================================");


		Podcast2 primeiroPodcast = new Podcast2(); 
		
		primeiroPodcast.setTitulo("Minha melhor versão");
		primeiroPodcast.setDuracao(15.00);
		primeiroPodcast.setTotalDeReproducao(4);
		primeiroPodcast.setQuantidadeDeCurtidas(0);
		primeiroPodcast.setCurtidas(1);
		primeiroPodcast.setClassificacao("15° lugar");
		
		primeiroPodcast.curtir();
		primeiroPodcast.reproduzir();
		primeiroPodcast.imprimirMusica();

	}

}
