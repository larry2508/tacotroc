package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.beans.Owner;

public interface IOwnerDao extends JpaRepository<Owner, Integer> {

}
