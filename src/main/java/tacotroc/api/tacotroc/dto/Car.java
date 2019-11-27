package tacotroc.api.tacotroc.dto;

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
import lombok.ToString;
import tacotroc.api.tacotroc.beans.Club;
import tacotroc.api.tacotroc.beans.Cylindre;
import tacotroc.api.tacotroc.beans.Model;
import tacotroc.api.tacotroc.beans.Musee;
import tacotroc.api.tacotroc.beans.Pays;
import tacotroc.api.tacotroc.beans.Proprietaire;
import tacotroc.api.tacotroc.beans.Serie;
import tacotroc.api.tacotroc.beans.Type;
import tacotroc.api.tacotroc.beans.User;
import tacotroc.api.tacotroc.beans.Version;
@ToString
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "twp_Car")
public class Car {
	@Id	
	private long id;
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
	@JoinColumn(name = "id_twp_User")
	private User id_twp_User;
	@Column
	private long Years;
	@OneToOne
	@JoinColumn(name = "id_twp_Model")
	private Model id_twp_Model;
	@OneToOne
	@JoinColumn(name = "id_twp_Version")
	private Version id_twp_Version;
	@OneToOne
	@JoinColumn(name = "id_twp_Type")
	private Type id_twp_Type;
	@OneToOne
	@JoinColumn(name = "id_twp_Cylinder")
	private Cylindre id_twp_Cylinder;
	@OneToOne
	@JoinColumn(name = "id_twp_Serie")
	private Serie id_twp_Serie;
	@OneToOne
	@JoinColumn(name = "id_twp_Owner")
	private Proprietaire id_twp_Owner;
	@OneToOne
	@JoinColumn(name = "id_twp_Country")
	private Pays id_twp_Country;
	@OneToOne
	@JoinColumn(name = "id_twp_Museum")
	private Musee id_twp_Museum;
	@OneToOne
	@JoinColumn(name = "id_twp_Club")
	private Club id_twp_Club;
	
	
	public Car( tacotroc.api.tacotroc.beans.Car t) {
		this.id=t.getId();
		this.Comment=t.getComment();
		this.Immatriculation=t.getImmatriculation();
		this.Restoration=t.getRestoration();
		this.id_twp_User=t.getId_twp_User();
		this.Years=t.getYears();
		this.id_twp_Model=t.getId_twp_Model();
		this.id_twp_Version=t.getId_twp_Version();
		this.id_twp_Type=t.getId_twp_Type();
		this.id_twp_Cylinder=t.getId_twp_Cylinder();
		this.id_twp_Serie=t.getId_twp_Serie();
		this.id_twp_Owner=t.getId_twp_Owner();
		this.id_twp_Country=t.getId_twp_Country();
		this.id_twp_Museum=t.getId_twp_Museum();
		this.id_twp_Club=t.getId_twp_Club();
		
	}

}
