package brainpower.scientist;

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

		String url = "https://api.chucknorris.io/jokes/random?category=science&category=movie&category=dev&category=food&category=celebrity&category=sport&category=fashion&category=travel"
				+ "&category=history&category=animal&category=career&category=music&category=money";
		ChuckResponse rep = restTemplateWithUserAgent.getForObject(url, ChuckResponse.class);
		return new ModelAndView("index", "chuck", rep);
	}
	
	@RequestMapping("/table")
	public ModelAndView showTable() {
		ModelAndView mv =new ModelAndView ("table");
		return mv;
		
	}

}
