package brainpower.scientist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.gitlab.johnjvester.randomizer.RandomGenerator;

import brainpower.scientist.dao.ReviewDao;
import brainpower.scientist.dao.ScientistDao;
import brainpower.scientist.model.ChuckResponse;
import brainpower.scientist.model.Review;
import brainpower.scientist.model.Scientist;
import brainpower.scientist.model.StringParser;
import brainpower.scientist.model.Team;
import brainpower.scientist.model.Utility;
import brainpower.scientist.model.WikiCrawler;

@Controller
public class ScientistController {

	@Autowired
	ScientistDao scientistDao;
	@Autowired
	WikiCrawler wikiCrawler;
	@Autowired
	ReviewDao reviewDao;
	@Autowired
	ScientistTeam scientistTeam;

	private RestTemplate restTemplateWithUserAgent;

	// This is an instance initialization block. It runs when a new instance of the
	// class is created--
	// right before the constructor.
	{
		// This configures the restTemplateWithUserAgent to include a User-Agent header
		// with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is
		// required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplateWithUserAgent = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	@RequestMapping("/")
	public ModelAndView showIndex() {

		String url = "https://api.chucknorris.io/jokes/random?category=" + Utility.getCategory();
		ChuckResponse rep = restTemplateWithUserAgent.getForObject(url, ChuckResponse.class);
		ModelAndView mv = new ModelAndView("index");

		List<Scientist> scientists = scientistDao.findAll();
		int r = Utility.getRandom(scientists.size());
		String fact = StringParser.parseString(rep.getValue(), 
				scientists.get(r).getName());
		
		mv.addObject("scientist", scientists.get(r));
		mv.addObject("chuck", rep);
		mv.addObject("fact", fact);
		return mv;
	}

	@RequestMapping("/table")
	public ModelAndView showTable() {
		List<Scientist> list = scientistDao.findNumber();
		ModelAndView mv = new ModelAndView("table", "scientists", list);
		mv.addObject("allCountries", scientistDao.findAllCountries());
		mv.addObject("fields", scientistDao.findAllFields());
		return mv;
	}

	@PostMapping("/table-filter")
	public ModelAndView filterByCountry(@RequestParam(name = "country", required = false) String country,
			@RequestParam(name = "field", required = false) String field) {
		ModelAndView mv = new ModelAndView("table");
		if (!(country.isEmpty()) && !(field.isEmpty())) {
			mv.addObject("allCountries", scientistDao.findAllCountries());
			mv.addObject("fields", scientistDao.findAllFields());
			mv.addObject("scientists", scientistDao.findByCountryAndField(country, field));
			return mv;
		}
		else if (!(country.isEmpty()) && (field.isEmpty())) {
			mv.addObject("allCountries", scientistDao.findAllCountries());
			mv.addObject("fields", scientistDao.findAllFields());
			mv.addObject( "scientists", scientistDao.findByCountry(country));
			return mv;
		}
		else if ((country.isEmpty()) && !(field.isEmpty())) {
			mv.addObject("allCountries", scientistDao.findAllCountries());
			mv.addObject("fields", scientistDao.findAllFields());
			mv.addObject("scientists", scientistDao.findByField(field));
			return mv;
		}

		return new ModelAndView("table", "scientists", scientistDao.findAll());
	}

	@PostMapping("/submit/{id}")
	public ModelAndView submit(@PathVariable("id") Integer id,
			@RequestParam(name = "strength", required = true) Integer strength, Scientist scientist) {
		ModelAndView mv = new ModelAndView("redirect:/");
		mv.addObject("strength", strength);
		Review r = new Review(strength, scientist);
		reviewDao.create(r);

		Scientist s = scientistDao.findById(scientist.getId());
		s.setStrength(reviewDao.findAverage(s));
		scientistDao.update(s);

		return mv;

	}

	
	@RequestMapping("/bracket")
	//change "required" to "true" when table is mapped.
	public ModelAndView showBracket( ) {
		ModelAndView mv =new ModelAndView ("bracket");
		List<Team> round1 = scientistTeam.loadScientist(scientistDao.fillTournament());
		mv.addObject("round1", round1);
		List<Team> round2 = scientistTeam.processBracket(round1);
		mv.addObject("round2", round2);
		List<Team> round3 = scientistTeam.processBracket(round2);
		mv.addObject("round3", round3);
		List<Team> champ = scientistTeam.processBracket(round3);
		mv.addObject("champ", champ);
		List<Team> winner = scientistTeam.processBracket(champ);
		mv.addObject("winner", winner);
		
		return mv;
		
		
	}
	
	

	// Dummy Mapping To Call WikiCrawler & ADD Parsed Data To Database

//	@RequestMapping("/load")
//	public ModelAndView load() {
//		List<Scientist> p = WikiCrawler.addPeace();
//		for(Scientist s : p) {
//			scientistDao.create(s);
//		}
//		List<Scientist> w = WikiCrawler.addWomen();
//		for(Scientist s : w) {
//			scientistDao.create(s);
//		}
//		List<Scientist> y = WikiCrawler.addPhysics();
//		for(Scientist s : y) {
//			scientistDao.create(s);
//		}
//		return new ModelAndView("redirect:/");
//	}

}
