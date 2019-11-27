package tacotroc.api.tacotroc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "twp_adresse_social")

public class AdresseS {
	@Id
	private long id ;
	
	
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

	@OneToOne
	@JoinColumn(name= "id_twp_user")
	private User user;


	
	
}

