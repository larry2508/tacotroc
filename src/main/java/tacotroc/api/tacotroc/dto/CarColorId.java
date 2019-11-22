package tacotroc.api.tacotroc.dto;

import java.io.Serializable;



import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tacotroc.api.tacotroc.beans.Color;



@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class CarColorId implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id ;
	private Color color;
	
}
