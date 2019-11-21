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
@Table(name = "twp_cylinder")
public class Cylindre {
	@Id
	private long id ;
	@Column(name ="Cylinder" )
	private String name;
}
