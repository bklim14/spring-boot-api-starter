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
	
	public void updateNovena(String id, Novena novena) {
		novena.setId(Integer.parseInt(id));
		novenaRepository.save(novena);
	}
	
	public List<Novena> getNovenaList() {
		
		List<Novena> novenaList = new ArrayList<>();
		novenaRepository.findAll().forEach(novenaList::add);
		
		return novenaList;
	}
	
	public Novena getNovena(String id) {
		List<Novena> novenaList = new ArrayList<>();
		novenaRepository.findById(id).stream().forEach(novenaList::add);
		
		return novenaList.get(0);
		
	}

}
