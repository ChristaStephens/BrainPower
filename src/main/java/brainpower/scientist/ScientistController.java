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

import brainpower.scientist.dao.ReviewDao;
import brainpower.scientist.dao.ScientistDao;
import brainpower.scientist.model.ChuckResponse;
import brainpower.scientist.model.Review;
import brainpower.scientist.model.Scientist;
import brainpower.scientist.model.StringParser;
import brainpower.scientist.model.WikiCrawler;

@Controller
public class ScientistController {

	@Autowired
	ScientistDao scientistDao;
	@Autowired
	WikiCrawler wikiCrawler;
	@Autowired
	ReviewDao reviewDao;

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
	// change "required" to "true" when table is mapped.
	public ModelAndView showIndex() {

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

		String url = "https://api.chucknorris.io/jokes/random?category=" + category;
		ChuckResponse rep = restTemplateWithUserAgent.getForObject(url, ChuckResponse.class);
		ModelAndView mv = new ModelAndView("index");

		List<Scientist> scientists = scientistDao.findAll();
		int s = (int) (Math.random() * scientists.size());

		String fact = StringParser.parseString(rep.getValue(), scientists.get(s).getName());
		mv.addObject("scientist", scientists.get(s));
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

		return new ModelAndView("redirect:/table");
	}

	@RequestMapping("/table-show-all-high")
	public ModelAndView showAllHigh() {
		List<Scientist> list = scientistDao.findByStrength();
		return new ModelAndView("table", "scientists", list);
	}

	@RequestMapping("/table-show-all-low")
	public ModelAndView showAllLow() {
		List<Scientist> list = scientistDao.findByWeakness();
		return new ModelAndView("table", "scientists", list);
	}

	@RequestMapping("/details")
	public ModelAndView showDetails(@RequestParam(name = "id") Long id) {
		ModelAndView mv = new ModelAndView("details");
		mv.addObject("scientist", scientistDao.findById(id));
		return mv;
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
