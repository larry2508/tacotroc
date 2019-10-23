package tacotroc.api.tacotroc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "twp_adress")
public class Adresse {
	@Id
	private int id ;
	
	
	@Column(name ="Num_Rue" )
	private int numR;
	@Column(name ="Nom_Rue" )
	private String nomR;
	@Column(name ="Ville" )
	private String ville;
	@Column(name ="Cp_ville" )
	private String cp;
	@Column(name ="Country" )
	private String pays;
	private int val ;
	
	
//	private User user;
	
	
	
}
