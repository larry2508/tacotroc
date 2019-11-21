package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.beans.Color;
import tacotroc.api.tacotroc.dto.CarColor;

public interface ICarColorDao2 extends JpaRepository<CarColor, Color>{

}
