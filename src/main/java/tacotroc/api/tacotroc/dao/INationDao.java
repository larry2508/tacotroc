package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tacotroc.api.tacotroc.beans.Nationalite;
@Repository
public interface INationDao extends JpaRepository<Nationalite, Long> {

}
