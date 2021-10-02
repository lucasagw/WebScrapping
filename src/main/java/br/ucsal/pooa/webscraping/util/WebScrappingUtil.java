package br.ucsal.pooa.webscraping.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.ucsal.pooa.webscraping.Passing;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebScrappingUtil {

	public static List<Passing> extrairDados() throws IOException {

		String url = "http://noosfero.ucsal.br/institucional/noticias/feed";

		Document doc = Jsoup.connect(url).get();

		Element item = doc.getElementsByTag("item").first();

		Element title = item.getElementsByTag("title").first();

		Element pubDate = item.getElementsByTag("pubDate").first();

		List<Passing> objects = new ArrayList<>();

		Passing passing = new Passing();
		passing.setTitle(title.text());
		passing.setPubDate(pubDate.text());

		objects.add(passing);

		return objects;

	}

	// método para converter um objeto em um Json
	public static void converterToJson(Passing passing) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = mapper.writeValueAsString(passing);
			System.out.println("Objeto em JSON: " + json);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}

}
