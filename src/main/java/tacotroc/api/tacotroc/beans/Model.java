package tacotroc.api.tacotroc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "twp_model")
public class Model {
	@Id
	private long id ;
	@Column(name ="Name" )
	private String name;
	@OneToOne
	@JoinColumn(name = "id_twp_Brand")
	private Marque brand;
}
