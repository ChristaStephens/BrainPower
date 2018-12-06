package brainpower.scientist.model;

public class StringParser {
	
	
	public static String parseString(String joke, String name) {
		
		String newString = joke.replaceAll("(Chuck Norris)|(Chuck|Norris)", name);
		
		//account for pronouns
		
		return newString;
	}

}
