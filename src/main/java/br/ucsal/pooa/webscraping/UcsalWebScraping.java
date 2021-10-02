package br.ucsal.pooa.webscraping;

import java.io.IOException;

import br.ucsal.pooa.webscraping.util.WebScrappingUtil;

public class UcsalWebScraping implements Runnable {

	public void run() {
		while (true) { // fazer rodar a cada 1 hora
			try {
				Thread.sleep(3600000);
				for (Passing dados : WebScrappingUtil.extrairDados()) {
					WebScrappingUtil.converterToJson(dados);
				}
			} catch (InterruptedException | IOException e1) {
				e1.printStackTrace();
			}

		}
	}
}
