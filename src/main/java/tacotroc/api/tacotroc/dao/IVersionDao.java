package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.beans.Version;

public interface IVersionDao extends JpaRepository<Version, Long> {

}
