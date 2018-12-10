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
	
	public static List<Character> getLetter() {
		
		List<Character> alphabet = new ArrayList<>();
		alphabet.add('a');
		alphabet.add('b');
		alphabet.add('c');
		alphabet.add('d');
		alphabet.add('e');
		alphabet.add('f');
		alphabet.add('g');
		alphabet.add('h');
		alphabet.add('i');
		alphabet.add('j');
		alphabet.add('k');
		alphabet.add('l');
		alphabet.add('m');
		alphabet.add('n');
		alphabet.add('o');
		alphabet.add('p');
		alphabet.add('q');
		alphabet.add('r');
		alphabet.add('s');
		alphabet.add('t');
		alphabet.add('u');
		alphabet.add('v');
		alphabet.add('w');
		alphabet.add('y');
		alphabet.add('z');
		return alphabet;

	
		
	}
	
	public static int getRandom(int i) {
		int r = (int) (Math.random() * i);
		return r;
	}
	
	
	

}
