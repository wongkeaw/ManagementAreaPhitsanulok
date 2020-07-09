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
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "Area")
public class Area implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3390467637128955669L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
    @Setter
    private Long id;
	
	@Getter
    @Setter
	private String describetion ;
	
	@Getter
    @Setter
	private String image ;	
	
    //OneToMany with SubArea
	@Getter
    @Setter
    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER , mappedBy = "area", orphanRemoval = true)
    private List<SubArea> subarea = new ArrayList<>();

}
