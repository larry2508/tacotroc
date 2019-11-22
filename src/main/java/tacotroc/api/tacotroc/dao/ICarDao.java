package tacotroc.api.tacotroc.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tacotroc.api.tacotroc.dto.Car;

@Repository
public interface ICarDao extends JpaRepository<Car, Long> {


	@Query("SELECT Max(u.id) FROM Car u ")
	int findmaxId();
}
