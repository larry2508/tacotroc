package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tacotroc.api.tacotroc.beans.AdresseS;
@Repository
public interface IAdresseSDao extends JpaRepository<AdresseS, Long> {

}
