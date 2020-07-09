package aran.tech.map.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import aran.tech.map.domain.SubArea;

@Repository
public interface SubAreaRepository extends CrudRepository<SubArea, Long>{

}
