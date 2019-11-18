package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.beans.Proprietaire;
public interface IProprietaireDao  extends JpaRepository<Proprietaire, Integer>{

}
