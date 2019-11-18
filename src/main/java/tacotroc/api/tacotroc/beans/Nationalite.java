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
@Table(name = "twp_nationality")
public class Nationalite {
	@Id
	private int id ;
	@Column(name ="Name" )
	private String name;
}