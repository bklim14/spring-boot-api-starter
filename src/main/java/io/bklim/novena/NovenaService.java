package io.bklim.novena;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NovenaService {
	
	@Autowired
	private NovenaRepository novenaRepository;
	
	public void addNovena(Novena novena) {
		novenaRepository.save(novena);
	}
	
	public List<Novena> getNovenaList() {
		
		List<Novena> novenaList = new ArrayList<>();
		novenaRepository.findAll().forEach(novena -> novenaList.add(novena));
		
		return novenaList;
	}

}
