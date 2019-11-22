package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.beans.Model;

public interface IModelDao extends JpaRepository<Model, Long> {

}
