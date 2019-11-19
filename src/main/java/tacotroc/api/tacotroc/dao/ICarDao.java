package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.dto.Car;


public interface ICarDao extends JpaRepository<Car, Integer> {

}
