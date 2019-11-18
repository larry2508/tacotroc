package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.beans.Color;



public interface IColorDao extends JpaRepository<Color, Integer>{

}
