
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scryping {
	static Document d;
	public static void main(String args[]) throws IOException {
		d = Jsoup.connect("https://twitter.com/Eyaaaad/status/987658467463835648").get();
		GetTweets();
		System.out.println("done");
	}

	

	private static void GetTweets() throws IOException {
		
		Elements el = d.select("#descendants > div");
		for (Element element : el.select("li")) {
			String tweet = element.select("a").text();
			System.out.println(tweet);
		}
		
		
		
	}

}
