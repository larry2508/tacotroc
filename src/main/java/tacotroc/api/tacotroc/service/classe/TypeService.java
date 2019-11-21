package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Type;
import tacotroc.api.tacotroc.dao.ITypeDao;
import tacotroc.api.tacotroc.service.interfaces.ITypeService;


@Service
public class TypeService implements ITypeService{

	@Autowired
	ITypeDao idao;
	
	@Override
	public List<Type> allType() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

	@Override
	public Type allType(long id) {
		// TODO Auto-generated method stub
		Long ids=id;
		return idao.findById(ids).get();
	}

	@Override
	public void addType(String name) {
		// TODO Auto-generated method stub
		Type c= new Type();
		c.setName(name);
		idao.save(c);
		
	}

	@Override
	public void deleteType(long id) {
		idao.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateType(Type type) {
		idao.save(type);
		// TODO Auto-generated method stub
		
	}

	

}
