package aran.tech.map.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "Shop")
public class Shop implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7905753375294965549L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter
    @Setter
    private Long id;
	
	@Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
    private SubArea subArea;
	
	@Getter
    @Setter
	private String description ;
	
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
	private String numberLock ;
	
	@Getter
    @Setter
	private String status ;
	
	@Getter
    @Setter
	private String shopName ;
	
	@Getter
    @Setter
	private String productType ;
	
	@Getter
    @Setter
	private String sizeSpace ;
	
	@Getter
    @Setter
	private String monthlyRent ;
	
	@Getter
    @Setter
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dueDate;
	
	@Getter
    @Setter
	private String other ;
	
}
