package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.beans.Type;

public interface ITypeDao extends JpaRepository<Type, Long> {

}
