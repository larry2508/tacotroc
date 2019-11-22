package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tacotroc.api.tacotroc.beans.Cylindre;
@Repository
public interface ICylindreDao extends JpaRepository<Cylindre, Long>{

}
