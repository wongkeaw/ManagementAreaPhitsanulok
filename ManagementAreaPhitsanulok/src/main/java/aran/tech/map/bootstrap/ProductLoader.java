package aran.tech.map.bootstrap;

import aran.tech.map.domain.Product;
import aran.tech.map.repositories.ProductRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {

	private ProductRepository productRepository;

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
			shirt.setPrice("1,000,000");
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
			shirt.setPrice("12,000,000");
			shirt.setImageUrl("");

			productRepository.save(shirt);

			log.info("Saved Shirt - id: " + shirt.getId());
		}

		{
			Product shirt = new Product();
			shirt.setProductId("Zone E");
			shirt.setDescription("ร้านพวก gift shop");
			shirt.setPrice("2,000,000");
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
			shirt.setPrice("12,000,000");
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

		
	}
}
