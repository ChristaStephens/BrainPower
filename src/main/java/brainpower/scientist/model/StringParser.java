package brainpower.scientist.model;

public class StringParser {
	
	
	public static String parseString(String joke, String name) {
		
		String newString = joke.replaceAll("(Chuck Norris)|(Chuck|Norris)", name);
//				.replaceAll("(?:^|\\W)his(?:$|\\W)", " their ")
//				.replaceAll("(him)", " them ")
//				.replaceAll("((?:^|\\W)he(?:$|\\W))|((?:^|\\\\W)He(?:$|\\\\W))", " they ");
		
		
		
		return newString;
	}

}
