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
	public static List<Team> loadScientist(ArrayList<Scientist> teamScientist) {
	List<Team> list = new ArrayList<>(); 
	int i = 1;
	for (Scientist s : teamScientist) {
		int num = (int) (Math.round( s.getStrength()));
		Team t = new Team(s, num, i);
		list.add(t);
		i++;
	}
	return list;
	}

	private static Team pickWinner(Team home, Team visitor) {
		RandomGenerator randomGenerator = new RandomGenerator();
		ArrayList<Team> thisGame = new ArrayList<Team>();
		thisGame.add(home);
		thisGame.add(visitor);
		// bring in scientist team list here? from team pojo?
		List<Team> winner = randomGenerator.randomize(thisGame, 1, true);
//    System.out.println("Winner of " + home.toString() + " vs " + visitor.toString() + " is " + winner.get(0).getName());
		return winner.get(0);
	}

	private static ArrayList<Team> processBracket(ArrayList<Team> thisRound) {
		ArrayList<Team> returnBracket = new ArrayList<Team>();
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
