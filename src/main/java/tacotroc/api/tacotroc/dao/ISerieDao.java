package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tacotroc.api.tacotroc.beans.Serie;
@Repository
public interface ISerieDao extends JpaRepository<Serie, Long> {

}
