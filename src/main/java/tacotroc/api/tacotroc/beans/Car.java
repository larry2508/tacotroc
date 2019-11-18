package tacotroc.api.tacotroc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "twp_Car")
public class Car {
	@Id	
	private int id;
	@Column	
	private String Immatriculation;
	@Column	
	private String Comment;
	@Column	
	private String Details_Color_1;
	@Column	
	private String Details_Color_2;
	@Column	
	private Boolean Restoration;
	@OneToOne
	private User id_twp_User;
	@Column
	private long Years;
	@OneToOne
	private Model id_twp_Model;
	@OneToOne
	private Version id_twp_Version;
	@OneToOne
	private Type id_twp_Type;
	@OneToOne
	private Cylindre id_twp_Cylinder;
	@OneToOne
	private Serie id_twp_Serie;
	@OneToOne
	private Proprietaire id_twp_Owner;
	@OneToOne
	private Pays id_twp_Country;
	@OneToOne
	private Musee id_twp_Museum;

}
