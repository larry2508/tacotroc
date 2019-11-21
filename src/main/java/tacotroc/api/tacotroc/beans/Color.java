package tacotroc.api.tacotroc.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Table(name = "twp_color")
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Color {


	@Id
	private Long id ;
	@Column(name ="Name" )
	private String name;
	
}
