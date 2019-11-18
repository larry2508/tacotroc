package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.beans.CarColor;

public interface ICCDao extends JpaRepository<CarColor, Integer> {

}
