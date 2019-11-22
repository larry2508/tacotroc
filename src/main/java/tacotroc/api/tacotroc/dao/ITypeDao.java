package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tacotroc.api.tacotroc.beans.Type;
@Repository
public interface ITypeDao extends JpaRepository<Type, Long> {

}
