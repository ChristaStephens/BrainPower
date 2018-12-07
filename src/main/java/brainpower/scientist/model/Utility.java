package brainpower.scientist.model;

import java.util.ArrayList;
import java.util.List;

public class Utility {
	
	public static String getCategory() {
		
		List<String> list = new ArrayList<>();
		list.add("money");
		list.add("travel");
		list.add("science");
		list.add("sport");
		list.add("movie");
		list.add("celebrity");
		list.add("career");
		list.add("money");
		list.add("fashion");
		list.add("dev");
		list.add("animal");
		list.add("food");
		list.add("music");

		// pulls from the list at random
		int r = (int) (Math.random() * list.size());
		String category = list.get(r);
		
		return category;
		
	}
	
	public static int getRandom(int i) {
		int r = (int) (Math.random() * i);
		return r;
	}

}
