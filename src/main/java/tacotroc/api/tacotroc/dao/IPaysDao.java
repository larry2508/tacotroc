package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.beans.Pays;

public interface IPaysDao extends JpaRepository<Pays, Long> {

}
