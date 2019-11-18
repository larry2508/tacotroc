package tacotroc.api.tacotroc.dto;

import java.awt.Color;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
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
}
