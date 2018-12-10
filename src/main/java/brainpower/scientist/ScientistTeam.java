package brainpower.scientist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.gitlab.johnjvester.randomizer.RandomGenerator;

import brainpower.scientist.model.Scientist;
import brainpower.scientist.model.Team;

@Component
public class ScientistTeam {

	// how to connect method with bracket? does this go in pojo or dao?
	// lol it rhymes
	public static List<Team> loadScientist(List<Scientist> list2) {
	List<Team> list = new ArrayList<>(); 
	int i = 1;
	for (Scientist s : list2) {
		int num = (int) (Math.round( s.getStrength()));
		Team t = new Team(s, num, i);
		list.add(t);
		i++;
	}
	return list;
	}

	public static Team pickWinner(Team america, Team euro) {
		RandomGenerator<Team> randomGenerator = new RandomGenerator<Team>();
		List<Team> thisGame = new ArrayList<Team>();
		thisGame.add(america);
		thisGame.add(euro);
		// bring in scientist team list here? from team pojo?
		List<Team> winner = randomGenerator.randomize(thisGame, 1, true);
//    System.out.println("Winner of " + home.toString() + " vs " + visitor.toString() + " is " + winner.get(0).getName());
		return winner.get(0);
	}
	
	
	public List<Team> randomize(List<Team> tList, java.lang.Integer maxResults, Boolean useRating){
		return tList;
	}
	

	public static List<Team> processBracket(List<Team> thisRound) {
		List<Team> returnBracket = new ArrayList<Team>();
		int start = 0;
		int end = (thisRound.size() - 1);
		while (start < end) {
			Team winner = pickWinner(thisRound.get(start), thisRound.get(end));
			returnBracket.add(winner);
			start++;
			end--;
		}
		return returnBracket;
	}

}
