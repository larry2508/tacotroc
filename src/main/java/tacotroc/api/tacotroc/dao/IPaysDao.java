package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tacotroc.api.tacotroc.beans.Pays;
@Repository
public interface IPaysDao extends JpaRepository<Pays, Long> {

}
