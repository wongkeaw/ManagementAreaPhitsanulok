package aran.tech.map.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "SubArea")
public class SubArea implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4605255478990066574L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
    @Setter
    private Long id;
	
	@Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
    private Area area;
	
	@Getter
    @Setter
	private String describetion ;
	
	@Getter
    @Setter
	private String image ;	
	
	@Getter
    @Setter
	private String rentalArrears ;
	
	@Getter
    @Setter
	private double positionx ;	
	
	@Getter
    @Setter
	private double positionY ;	
	
	@Getter
    @Setter
    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER , mappedBy = "subArea", orphanRemoval = true)
    private List<Shop> shop = new ArrayList<>();

}
