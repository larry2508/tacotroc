package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.beans.Musee;

public interface IMuseeDao extends JpaRepository<Musee, Long>{

}
