package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.beans.Nationalite;

public interface INationDao extends JpaRepository<Nationalite, Long> {

}
