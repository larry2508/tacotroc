package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.beans.Club;

public interface IClubDao extends JpaRepository<Club, Integer> {

}
