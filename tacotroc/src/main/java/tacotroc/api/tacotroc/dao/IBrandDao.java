package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.beans.Marque;

public interface IBrandDao extends JpaRepository<Marque, Integer> {

}
