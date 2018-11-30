package brainpower.scientist;


import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import brainpower.scientist.model.ChuckResponse;


@Controller
public class ScientistController {
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
		
		int r = (int) (Math.random() * list.size());
		String category = list.get(r);

		String url = "https://api.chucknorris.io/jokes/random?category="+ category;
		ChuckResponse rep = restTemplateWithUserAgent.getForObject(url, ChuckResponse.class);
		return new ModelAndView("index", "chuck", rep);
	}
	
	@RequestMapping("/table")
	public ModelAndView showTable() {
		ModelAndView mv =new ModelAndView ("table");
		return mv;
		
	}

}
