package io.bklim.novena;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class NovenaController {
	
	@Autowired
	private NovenaService novenaService;

}
