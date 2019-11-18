package tacotroc.api.tacotroc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tacotroc.api.tacotroc.beans.User;

public interface IUserDao extends JpaRepository<User, Integer> {

}
