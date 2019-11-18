package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.beans.Cars;

public interface ICarsDao extends JpaRepository<Cars, Integer>  {

}
