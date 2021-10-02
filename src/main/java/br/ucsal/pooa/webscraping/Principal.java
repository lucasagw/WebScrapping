package br.ucsal.pooa.webscraping;

public class Principal {

	public static void main(String[] args) {

		new Thread(new UcsalWebScraping()).start();
	}
}
