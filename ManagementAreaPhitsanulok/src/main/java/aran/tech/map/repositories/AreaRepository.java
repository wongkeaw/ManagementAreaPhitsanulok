package aran.tech.map.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import aran.tech.map.domain.Area;
@Repository
public interface AreaRepository extends CrudRepository<Area, Long>{

}
