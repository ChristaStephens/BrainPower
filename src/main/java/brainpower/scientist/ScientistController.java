package brainpower.scientist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import brainpower.scientist.model.ChuckResponse;


@Controller
public class ScientistController {

	@RequestMapping("/")
	public ModelAndView showIndex() {

		String url = "https://api.chucknorris.io/jokes/random";
		RestTemplate rest = new RestTemplate();
		ChuckResponse rep = rest.getForObject(url, ChuckResponse.class);
		return new ModelAndView("index", "chuck", rep);
	}

}
