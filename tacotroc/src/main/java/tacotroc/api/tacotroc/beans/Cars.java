package tacotroc.api.tacotroc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "twp_Car")
public class Cars {
	@Id
	private int id ;
	@Column(name = "Immatriculation")
	private String immat;
	@Column
	private String Comment;
	@Column
	private String details_color_1;
	@Column
	private String details_color_2;
	@Column
	private boolean restoration ;
	@Column
	private Integer Years ;
	
	@OneToOne
	@JoinColumn(name = "id_twp_User")
	private User user ;
	@OneToOne
	@JoinColumn(name = "id_twp_Model")
	private Model model ;
	@OneToOne
	@JoinColumn(name = "id_twp_Version")
	private Version version ;
	@OneToOne
	@JoinColumn(name = "id_twp_Type")
	private Type type ;
	@OneToOne
	@JoinColumn(name = "id_twp_Cylinder")
	private Cylindre cylindre ;
	@OneToOne
	@JoinColumn(name = "id_twp_Serie")
	private Serie serie;
	@OneToOne
	@JoinColumn(name = "id_twp_Owner")
	private Owner owner ;
	@OneToOne
	@JoinColumn(name = "id_twp_Country")
	private Pays pays;
	@OneToOne
	@JoinColumn(name = "id_twp_Museum")
	private Musee musse ;
	@OneToOne
	@JoinColumn(name = "id_twp_Club")
	private Club club ;
	
	
	
}
