package tacotroc.api.tacotroc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tacotroc.api.tacotroc.dto.Car;
import tacotroc.api.tacotroc.dto.CarColor;


public interface ICarDao extends JpaRepository<Car, Long> {


	@Query("SELECT Max(u.id) FROM Car u ")
	int findmaxId();
}
