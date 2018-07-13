package io.bklim.novena.mystery;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MysteryController {
	
	@RequestMapping("/mystery")
	public List<Mystery> getMysteries() {
		return Arrays.asList(
				new Mystery("Glorious"),
				new Mystery("Joyful"),
				new Mystery("Light"),
				new Mystery("Sorroful"));
	}

}
