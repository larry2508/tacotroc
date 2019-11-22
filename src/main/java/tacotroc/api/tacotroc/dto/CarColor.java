package tacotroc.api.tacotroc.dto;



import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import tacotroc.api.tacotroc.beans.Color;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rel_car_color")
@IdClass(CarColorId.class)
@ToString
public class CarColor implements Serializable{
	@Id
	@Column(name="id")
	private long id;
	@Id
	@OneToOne(cascade = CascadeType.MERGE, optional = false)
	@JoinColumn(name = "id_twp_Color")
	private Color color;
	

}