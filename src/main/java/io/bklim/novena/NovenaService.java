package io.bklim.novena;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NovenaService {
	
	@Autowired
	private NovenaRepository novenaRepository;

}
