package tacotroc.api.tacotroc.beans;

import java.io.Serializable;

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
@Table(name = "rel_car_color")
public class CarColor implements Serializable{

	@Id
	private int id ;
	@OneToOne
	@Id
	@JoinColumn(name = "id_twp_Color")
	private Color color;
	
}
