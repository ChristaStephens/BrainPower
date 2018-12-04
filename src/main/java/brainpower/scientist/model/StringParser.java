package brainpower.scientist.model;

import java.util.ArrayList;
import java.util.List;

public class StringParser {
	
	
	public static String parseString(String joke, String name) {
		String newString = "";
		String reg = "([ ]|,)";
		
		String[] a = joke.split(reg);
		List<String> list = new ArrayList<>();
		for (String s : a) {
			list.add(s);
		}
		
		if(list.contains("Chuck")) {
			list.set(list.indexOf("Chuck"), name);
		}
		if(list.contains("Chuck,")) {
			list.set(list.indexOf("Chuck,"), name);
		}
		
		if(list.contains("Norris,")) {
			list.remove(list.indexOf("Norris,"));
		}
		if(list.contains("Norris")) {
			list.remove(list.indexOf("Norris"));
		}
		
		
		
		for (String str : list) {
			newString = newString + str + " ";
		}
		
		
		return newString;
	}

}
