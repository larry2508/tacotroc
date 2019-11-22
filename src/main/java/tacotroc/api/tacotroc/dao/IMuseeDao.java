package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tacotroc.api.tacotroc.beans.Musee;
@Repository
public interface IMuseeDao extends JpaRepository<Musee, Long>{

}
