package br.ucsal.pooa.webscraping;

import java.io.Serializable;

public class Passing implements Serializable, Comparable<Passing> {

	private static final long serialVersionUID = 1L;

	private String title;
	private String pubDate;

	public Passing(String title, String pubDate) {
		this.title = title;
		this.pubDate = pubDate;
	}

	public Passing() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Passing [");
		if (title != null) {
			builder.append("title=");
			builder.append(title);
			builder.append(", ");
		}
		if (pubDate != null) {
			builder.append("pubDate=");
			builder.append(pubDate);
		}
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int compareTo(Passing o) {
		return this.pubDate.compareTo(o.getPubDate());
	}

}
