package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tacotroc.api.tacotroc.beans.Adresse;
@Repository
public interface IAdresseDao extends JpaRepository<Adresse, Long>{

}
