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
@Table(name = "twp_Model")
public class Model {

	@Id
	private int id ;
	@Column(name ="Name" )
	private String name;
	
	@OneToOne
	@JoinColumn(name = "id_twp_Brand")
	private Marque brand ;
}
