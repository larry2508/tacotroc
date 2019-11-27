package tacotroc.api.tacotroc.beans;

import java.sql.Date;

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
@Table(name = "twp_user")

public class User {
	@Id
	private long id;
	@Column(name ="Last_Name" )
	private String nom ;
	@Column(name ="First_Name" )
	private String prenom;
	@Column(name ="Pseudo" )
	private String pseudo;
	@Column(name ="Mail" )
	private String mail;
	@Column(name ="Phone" )
	private String tel;
	@Column(name ="Password" )
	private String mdp;
	@Column(name ="Token" )
	private String token;
	@Column(name ="Date_Creation" )
	private Date date_creation;
	@Column(name ="Internet_Protocol" )
	private String internet_protocol;
	private boolean identity_card;
	@Column(name ="birth"  )
	
	private Date anniv;
	@Column(name ="Nom_Entreprise" )
	private String nomE;
	@Column(name ="Siret" )
	private String siret;
	@Column(name ="Nom_Contact" )
	private String nomC;
	private boolean Entreprise;
	
	
	
	@OneToOne
	@JoinColumn(name = "nation")
	private Nationalite nation ;
	@OneToOne
	@JoinColumn(name = "Country")
	private Pays pays;
	
	

}
