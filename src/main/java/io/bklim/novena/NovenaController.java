package io.bklim.novena;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NovenaController {
	
	@Autowired
	private NovenaService novenaService;
	
	@RequestMapping(method=RequestMethod.POST, value="/novena")
	public void addNovena(@RequestBody Novena novena) {
		novenaService.addNovena(novena);
	}
	
	public void updateNovena(String id, Novena novena) {
		novenaService.updateNovena(id, novena);
	}

}
