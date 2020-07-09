package aran.tech.map.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aran.tech.map.domain.Area;
import aran.tech.map.services.AreaService;

@RestController
@RequestMapping("/api/area")
public class AreaController {

	@Autowired
	AreaService areaService; 
	
	@GetMapping("/all")
	public Iterable<Area> getAllArea() {
		Iterable<Area> areas = areaService.findAll() ;
		return areas ;
	}
	@GetMapping("/{id}")
    public ResponseEntity<?> fetchItemComment(@PathVariable Long id){
		Area area = areaService.findById(id) ;
        return  new ResponseEntity<Area>(area, HttpStatus.OK);
    }
}
