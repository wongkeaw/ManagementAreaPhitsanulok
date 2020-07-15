package aran.tech.map.bootstrap;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import aran.tech.map.domain.Area;
import aran.tech.map.domain.Product;
import aran.tech.map.domain.Shop;
import aran.tech.map.domain.SubArea;
import aran.tech.map.repositories.AreaRepository;
import aran.tech.map.repositories.ProductRepository;
import aran.tech.map.repositories.ShopRepository;
import aran.tech.map.repositories.SubAreaRepository;

@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {

	private ProductRepository productRepository;

	@Autowired
	AreaRepository areaRepository;
	
	@Autowired
	SubAreaRepository subAreaRepository; 
	
	@Autowired
	ShopRepository shopRepository ;

	private Logger log = LogManager.getLogger(ProductLoader.class);

	@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		{
			Product shirt = new Product();
			shirt.setProductId("Zone A");
			shirt.setDescription("ร้านพวก gift shop");
			shirt.setPrice("0");
			shirt.setImageUrl("");

			productRepository.save(shirt);

			log.info("Saved Shirt - id: " + shirt.getId());
		}

		{
			Product shirt = new Product();
			shirt.setProductId("Zone B");
			shirt.setDescription("ร้านพวก gift shop");
			shirt.setPrice("0");
			shirt.setImageUrl("");

			productRepository.save(shirt);

			log.info("Saved Shirt - id: " + shirt.getId());
		}

		{
			Product shirt = new Product();
			shirt.setProductId("Zone C");
			shirt.setDescription("ร้านพวก gift shop");
			shirt.setPrice("0");
			shirt.setImageUrl("");

			productRepository.save(shirt);

			log.info("Saved Shirt - id: " + shirt.getId());
		}

		{
			Product shirt = new Product();
			shirt.setProductId("Zone D");
			shirt.setDescription("ร้านพวก gift shop");
			shirt.setPrice("0");
			shirt.setImageUrl("");

			productRepository.save(shirt);

			log.info("Saved Shirt - id: " + shirt.getId());
		}

		{
			Product shirt = new Product();
			shirt.setProductId("Zone E");
			shirt.setDescription("ร้านพวก gift shop");
			shirt.setPrice("0");
			shirt.setImageUrl("");

			productRepository.save(shirt);

			log.info("Saved Shirt - id: " + shirt.getId());
		}

		{
			Product shirt = new Product();
			shirt.setProductId("Zone F");
			shirt.setDescription("ร้านพวก gift shop");
			shirt.setPrice("3,000,000");
			shirt.setImageUrl("");

			productRepository.save(shirt);

			log.info("Saved Shirt - id: " + shirt.getId());
		}

		{
			Product shirt = new Product();
			shirt.setProductId("Zone G");
			shirt.setDescription("ร้านพวก gift shop");
			shirt.setPrice("0");
			shirt.setImageUrl("");

			productRepository.save(shirt);

			log.info("Saved Shirt - id: " + shirt.getId());
		}

		{
			Product shirt = new Product();
			shirt.setProductId("Zone H");
			shirt.setDescription("ร้านพวก gift shop");
			shirt.setPrice("0");
			shirt.setImageUrl("");

			productRepository.save(shirt);

			log.info("Saved Shirt - id: " + shirt.getId());
		}

		{
			Product shirt = new Product();
			shirt.setProductId("Zone I");
			shirt.setDescription("ร้านพวก gift shop");
			shirt.setPrice("0");
			shirt.setImageUrl("");

			productRepository.save(shirt);

			log.info("Saved Shirt - id: " + shirt.getId());
		}

		{
			Product shirt = new Product();
			shirt.setProductId("Zone J");
			shirt.setDescription("ร้านพวก gift shop");
			shirt.setPrice("0");
			shirt.setImageUrl("");

			productRepository.save(shirt);

			log.info("Saved Shirt - id: " + shirt.getId());
		}
		//insertArea();

	}

	private void insertArea() {
		{	
			Area a = new Area();
			a.setDescription("main image");
			a.setImage("main_area.jpg");
			Area r =areaRepository.save(a);
			
			SubArea sa = new SubArea() ;
			sa.setDescription("main image");
			sa.setImage("main_area.jpg");
			sa.setArea(r);
			sa.setRentalArrears("0.0");
			SubArea s2 = subAreaRepository.save(sa) ;
			
			Shop st = new Shop() ;

			st.setDescription("main image");
			st.setImage("main_area.jpg");
			st.setSubArea(s2);
			st.setRentalArrears("0.0");
			st.setDueDate(new Date());
			shopRepository.save(st) ;
		}
	}
}
