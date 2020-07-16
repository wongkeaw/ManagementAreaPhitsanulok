package aran.tech.map.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aran.tech.map.domain.SubArea;
import aran.tech.map.repositories.SubAreaRepository;

@Service
public class SubAreaService {

	@Autowired
	SubAreaRepository subAreaRepository ;

	@Transactional
	public SubArea findbyId(Long id) {
		Optional<SubArea> osub = subAreaRepository.findById(id) ;
		if (osub.isPresent() ) {
			SubArea sub = osub.get() ;
			sub.getShop() ;
			return sub ;
		}
		return null ;
	}
}
