package tacotroc.api.tacotroc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tacotroc.api.tacotroc.dto.CarColor;

public interface ICarColorDao  extends JpaRepository<CarColor, Integer>{

	
	@Query("SELECT u FROM rel_car_color  u WHERE u.id =?1")
	List<CarColor> findAllCCbyid(int i);
}
