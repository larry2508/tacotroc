package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tacotroc.api.tacotroc.beans.Proprietaire;
@Repository
public interface IProprietaireDao  extends JpaRepository<Proprietaire, Long>{

}
