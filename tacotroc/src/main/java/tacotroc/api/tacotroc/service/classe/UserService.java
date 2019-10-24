package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.User;
import tacotroc.api.tacotroc.dao.IUserDao;
import tacotroc.api.tacotroc.service.interfaces.IUserService;
@Service
public class UserService implements IUserService{

	@Autowired
	IUserDao idao;
	@Override
	public List<User> allUser() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		idao.deleteById(id);
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		idao.save(user);
	}

	@Override
	public User allUser(int id) {
		// TODO Auto-generated method stub
		Integer ids=id;
		return idao.findById(ids).get();
	}

}
