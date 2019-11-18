package tacotroc.api.tacotroc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "rel_car_color")

//@IdClass(value = null)
public class CarColor {
	
	@Column(name = "id")
	private Integer idcar ;
	@OneToOne
	@JoinColumn(name = "id_twp_Color")
	private Color color ;
}
