package tacotroc.api.tacotroc.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import tacotroc.api.tacotroc.beans.Color;

@Getter
@Setter
@Entity
@Table(name = "rel_car_color")
@IdClass(CarColor.class)
public class CarColor implements Serializable{

	@Id
	private int id ;
	@OneToOne
	@Id
	@JoinColumn(name = "id_twp_Color")
	private Color color;
	
}
