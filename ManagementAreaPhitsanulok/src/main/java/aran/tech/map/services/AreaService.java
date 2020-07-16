package aran.tech.map.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aran.tech.map.domain.Area;
import aran.tech.map.repositories.AreaRepository;

@Service
public class AreaService {

	@Autowired
	AreaRepository areaRepository ;
	
	public Iterable<Area> findAll() {
		Iterable<Area> a = areaRepository.findAll() ;
		
		return a ;
	}
	
	public Area findById(Long id) {
		Optional<Area> ret = areaRepository.findById(id) ;
		if (ret.isPresent() ) {
			Area area = ret.get() ;
			area.getSubarea() ;
			return area ;
		}
		
		return null ;
	}
}

