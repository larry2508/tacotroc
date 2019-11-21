package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.beans.Serie;

public interface ISerieDao extends JpaRepository<Serie, Long> {

}
