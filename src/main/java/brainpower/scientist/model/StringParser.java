package brainpower.scientist.model;

public class StringParser {
	
	
	public static String parseString(String joke, String name, Boolean alt) {
		
		if(alt) {
			String newString = joke.replaceAll("(Chuck Norris')", name + "'s");
			String newerString = newString.replaceAll("(Chuck Norris)|(Chuck|Norris)", name)
					.replaceAll("(\\bhe\\b)", "she").replaceAll("(\\bHe\\b)", "She")
					.replaceAll("(\\bhe's\\b)", "she's").replaceAll("(\\bHe's\\b)", "She's")
					.replaceAll("(\\bhis\\b)", "her").replaceAll("(\\bHis\\b)", "Her")
					.replaceAll("him", "her").replaceAll("Him", "Her");
					
			
			return newerString;
		}
		
		
		String newString = joke.replaceAll("(Chuck Norris')", name + "'s");
		String newerString = newString.replaceAll("(Chuck Norris)|(Chuck|Norris)", name);
		
		return newerString;
	}

}
