package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.beans.Adresse;

public interface IAdresseDao extends JpaRepository<Adresse, Long>{

}
