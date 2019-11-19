package tacotroc.api.tacotroc.beans;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tacotroc.api.tacotroc.beans.Cylindre;
import tacotroc.api.tacotroc.beans.Model;
import tacotroc.api.tacotroc.beans.Musee;
import tacotroc.api.tacotroc.beans.Pays;
import tacotroc.api.tacotroc.beans.Proprietaire;
import tacotroc.api.tacotroc.beans.Serie;
import tacotroc.api.tacotroc.beans.Type;
import tacotroc.api.tacotroc.beans.User;
import tacotroc.api.tacotroc.beans.Version;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car {
	private int id;
	private String Immatriculation;
	private String Comment;
	private Color Details_Color_1;
	private Color Details_Color_2;
	private Boolean Restoration;
	private User id_twp_User;
	private long Years;
	private Model id_twp_Model;
	private Version id_twp_Version;
	private Type id_twp_Type;
	private Cylindre id_twp_Cylinder;
	private Serie id_twp_Serie;
	private Proprietaire id_twp_Owner;
	private Pays id_twp_Country;
	private Musee id_twp_Museum;
	
	
	public Car( tacotroc.api.tacotroc.dto.Car t) {
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
		
	}
}
