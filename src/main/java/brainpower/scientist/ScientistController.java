package brainpower.scientist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ScientistController {
	
	@RequestMapping("/")
	public ModelAndView showIndex() {
		return new ModelAndView("index");
	}

}
