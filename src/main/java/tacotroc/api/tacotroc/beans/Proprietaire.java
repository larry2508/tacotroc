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
@Table(name = "twp_Owner")
public class Proprietaire {

	@Id
	private long id;
	@Column(name ="Last_Name" )
	private String nom ;
	@Column(name ="First_Name" )
	private String prenom;
	@Column(name ="Phone" )
	private String tel;
	@Column(name ="Compagny_Name" )
	private String nomE;
	@Column(name ="Siret" )
	private String siret;
	@Column(name = "Compagny")
	private Integer Entreprise;
	

}
