package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tacotroc.api.tacotroc.beans.Color;


@Repository
public interface IColorDao extends JpaRepository<Color, Long>{

}
