package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.User;
@Service
public interface IUserService {

	List<User> allUser();

	void deleteUser(int id);

	void addUser(User user);

	User allUser(int id);
}
