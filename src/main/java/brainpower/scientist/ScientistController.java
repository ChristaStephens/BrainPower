package brainpower.scientist;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import brainpower.scientist.dao.ScientistDao;
import brainpower.scientist.model.ChuckResponse;
import brainpower.scientist.model.Scientist;
import brainpower.scientist.model.WikiCrawler;



@Controller
public class ScientistController {
	@Autowired ScientistDao scientistDao;
	@Autowired WikiCrawler wikiCrawler;
	private RestTemplate restTemplateWithUserAgent;
	
	// This is an instance initialization block. It runs when a new instance of the class is created--
	// right before the constructor.
	{
	    // This configures the restTemplateWithUserAgent to include a User-Agent header with every HTTP
		// request. Some of the APIs in this demo have a bug where User-Agent is required.
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
	        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
	        return execution.execute(request, body);
	    };
	    restTemplateWithUserAgent = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	@RequestMapping("/")
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
		
		//pulls from the list at random
		int r = (int) (Math.random() * list.size());
		String category = list.get(r);

		String url = "https://api.chucknorris.io/jokes/random?category="+ category;
		ChuckResponse rep = restTemplateWithUserAgent.getForObject(url, ChuckResponse.class);
		ModelAndView mv =new ModelAndView ("index");
		//may have to change the "1l" reads as a long
		mv.addObject("sci", scientistDao.findById(1l));
		mv.addObject("chuck", rep);
		return mv;
	}
	
	@RequestMapping("/table")
	public ModelAndView showTable() {
		List<Scientist> list = scientistDao.findByStrength();
		return new ModelAndView("table", "scientists", list);
		
	}
	

	@RequestMapping("/details")
	public ModelAndView showDetails(@RequestParam(name = "id")Long id) {
		ModelAndView mv =new ModelAndView ("details");
		mv.addObject("scientist", scientistDao.findById(id));
		return mv;	
	}

	
//	@RequestMapping("/load")
//	public ModelAndView load() {
////		List<Scientist> p = WikiCrawler.addPeace();
////		for(Scientist s : p) {
////			scientistDao.create(s);
////		}
//		List<Scientist> w = WikiCrawler.addWomen();
//		for(Scientist s : w) {
//			scientistDao.create(s);
//		}
////		List<Scientist> y = WikiCrawler.addPhysics();
////		for(Scientist s : y) {
////			scientistDao.create(s);
////		}
//		return new ModelAndView("redirect:/");
//	}
	


}
