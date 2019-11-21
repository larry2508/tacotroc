package tacotroc.api.tacotroc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tacotroc.api.tacotroc.dto.CarColor;
@Repository
public interface ICarColorDao  extends JpaRepository<CarColor, Long>{


	@Query("SELECT u FROM CarColor u WHERE u.id =?1")
	List<CarColor> findAllCCbyid(long i);

	@Transactional
	@Modifying
	@Query("delete  FROM CarColor  WHERE id =?1")
	void deleteCCbyid(long i);



}
