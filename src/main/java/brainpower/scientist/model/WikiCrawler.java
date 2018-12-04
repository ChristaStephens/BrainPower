package brainpower.scientist.model;

import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import brainpower.scientist.dao.ScientistDao;

@Component
public class WikiCrawler {
	@Autowired
	private static ScientistDao scientistdao;
	
	public static void main(String[] args) {
		addPeace();
	}


	public static List<Scientist> addPhysics() {
		String url = "https://en.wikipedia.org/wiki/List_of_Nobel_laureates_in_Physics";
		List<Scientist> list = new ArrayList<>();

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
						Element img = row.select("img").first();
						image = img.absUrl("src");
					} catch (NullPointerException e) {
						image = "";
					}
					
					String link;
					try {
						Element bioLink = row.select("a").get(1);
						link = bioLink.absUrl("href");
					} catch (IndexOutOfBoundsException e) {
						link = "";
					}

					final String country = row.select("td:nth-of-type(3)").text();
					// System.out.println("country: " + country);

					final String rational = "Awarded Nobel Prize in Physics " + row.select("td:nth-of-type(4)").text();
					
					if (image.length() > 0 && name.length() > 0 && link.length() > 0 && year.length() > 0
							&& rational.length() > 0) {
						Scientist s = new Scientist(year, name, image, country, rational, "Physics", link);
						if (list.size() < 25) {
						list.add(s);
						}
					}
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("physics: " + list.size());
		return list;

	}

	public static List<Scientist> addPeace() {
		String url = "https://en.wikipedia.org/wiki/List_of_Nobel_Peace_Prize_laureates";
		List<Scientist> list = new ArrayList<>();

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
					final String rational = "Awarded Nobel Peace Prize " + row.select("td:nth-of-type(5)").text();
					String image;
					try {
						Element img = row.select("img").first();
						image = img.absUrl("src");
					} catch (NullPointerException e) {
						image = "";
					}
					String link;
					try {
						Element bioLink = row.select("a").get(1);
						link = bioLink.absUrl("href");
					} catch (IndexOutOfBoundsException e) {
						link = "";
					}

					if (image.length() > 0 && name.length() > 0 && link.length() > 0 && year.length() > 0
							&& rational.length() > 0) {
						Scientist s = new Scientist(year, name, image, country, rational, "Philanthropy", link);
						if(list.size() < 25) {
						list.add(s);
						}
					}

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("peace: " + list.size());
		return list;
		

	}

	public static List<Scientist> addWomen() {
		String url = "https://en.wikipedia.org/wiki/List_of_African-American_women_in_STEM_fields";
		List<Scientist> list = new ArrayList<>();

		try {

			final Document doc = Jsoup.connect(url).get();
			// find and iterate through table
			for (Element row : doc.select("table.wikitable tbody tr")) {
				String image;
				try {
					Element img = row.select("img").first();
					image = img.absUrl("src");
				} catch (NullPointerException e) {
					image = "";
				}
				String name = row.select("td:nth-of-type(2)").text();
				String link;
				try {
					Element bioLink = row.select("a").get(1);
					link = bioLink.absUrl("href");
				} catch (IndexOutOfBoundsException e) {
					link = "";
				}
				String field = row.select("td:nth-of-type(3)").text();
				String year = row.select("td:nth-of-type(4)").text();
				String rational = row.select("td:nth-of-type(5)").text();

				if (image.length() > 0 && name.length() > 0 && link.length() > 0 && field.length() > 0
						&& year.length() > 0 && rational.length() > 0) {
					Scientist s = new Scientist(year, name, image, "United States", rational, field, link);
					list.add(s);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return list;

	}

}
