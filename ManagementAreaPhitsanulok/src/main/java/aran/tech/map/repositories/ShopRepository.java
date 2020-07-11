/**
 * 
 */
package aran.tech.map.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import aran.tech.map.domain.Shop;

/**
 * @author oawon
 *
 */
@Repository
public interface ShopRepository extends CrudRepository<Shop, Long>{

}
