package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Owner;
import tacotroc.api.tacotroc.dao.IOwnerDao;
import tacotroc.api.tacotroc.service.interfaces.IOwnerService;

@Service
public class OwnerService implements IOwnerService{
	@Autowired
	IOwnerDao idao;
	@Override
	public List<Owner> allOwner() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

	@Override
	public void deleteOwner(int id) {
		// TODO Auto-generated method stub
		idao.deleteById(id);
	}

	@Override
	public void addOwner(Owner user) {
		// TODO Auto-generated method stub
		idao.save(user);
	}

	@Override
	public Owner allOwner(int id) {
		// TODO Auto-generated method stub
		Integer ids=id;
		return idao.findById(ids).get();
	}

}
