package brainpower.scientist.model;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WikiCrawler {

	public static void main(String[] args) {

		//addPhysics();
		addPeace();

	}

	public static void addPhysics() {
		String url = "https://en.wikipedia.org/wiki/List_of_Nobel_laureates_in_Physics";

		try {

			final Document doc = Jsoup.connect(url).get();
			// find and iterate through table
			for (Element row : doc.select("table.wikitable tr")) {
				if (row.select("td:nth-of-type(1)").text().equals("")) {
					continue;
				} else if (row.select("td:nth-of-type(2)").text().equals("Not awarded World War II")
						|| row.select("td:nth-of-type(2)").text().equals("Not awarded World War I")
						|| (row.select("td:nth-of-type(2)").text().equals("Not awarded"))) {
					continue;
				} else {
					final String year = row.select("td:nth-of-type(1)").text();
					// System.out.println("year: " + year);
					final String name = row.select("th").text();
					String image;
					try {
						Element img = row.select("a.image").first();
						image = img.absUrl("href");
					} catch (NullPointerException e) {
						image = "";
					}

					final String country = row.select("td:nth-of-type(3)").text();
					// System.out.println("country: " + country);

					final String rational = "Awarded Nobel Prize " + row.select("td:nth-of-type(4)").text();
					 System.out.println("year: " + year + "\nimage: " + image + "\nname: " + name
					 + "\ncountry: " + country + "\nrational: " + rational + "\n");
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void addPeace() {
		String url = "https://en.wikipedia.org/wiki/List_of_Nobel_Peace_Prize_laureates";

		try {

			final Document doc = Jsoup.connect(url).get();
			// find and iterate through table
			for (Element row : doc.select("table.wikitable tr")) {
				if (row.select("td:nth-of-type(1)").text().equals("")) {
					continue;
				} else {

					final String year = row.select("td:nth-of-type(1)").text();
					final String name = row.select("td:nth-of-type(3)").text();
					final String country = row.select("td:nth-of-type(4)").text();
					final String rational = row.select("td:nth-of-type(5)").text();
					String image;
					try {
						Element img = row.select("a.image").first();
						image = img.absUrl("href");
					} catch (NullPointerException e) {
						image = "";
					}
					
					

					
					System.out.println("Year: " + year + "\nName: " 
					+ name + "\nCountry: " + country 
					+ "\nRational: Awarded Nobel Peace Prize " + rational + "\nImage link: " + 
					image + "\n");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
