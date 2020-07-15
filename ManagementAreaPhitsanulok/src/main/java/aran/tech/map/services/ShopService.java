package aran.tech.map.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import aran.tech.map.domain.Shop;
import aran.tech.map.repositories.ShopRepository;

@Service
public class ShopService {

	@Autowired
	ShopRepository shopRepository ;
	
	@Transactional
	public Shop findbyId(Long id) {
		Optional<Shop> oshop = shopRepository.findById(id) ;
		if (oshop.isPresent() ) {
			Shop shop = oshop.get() ;
			Long l = shop.getSubArea().getId() ;
			System.out.println(l);
			return shop ;
		}
		return null ;
	}
	
	public void updateShop(Shop shop) {
		shopRepository.save(shop) ;
	}

}
