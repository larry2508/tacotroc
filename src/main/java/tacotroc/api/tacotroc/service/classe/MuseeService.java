package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Cylindre;
import tacotroc.api.tacotroc.beans.Musee;
import tacotroc.api.tacotroc.dao.IMuseeDao;
import tacotroc.api.tacotroc.service.interfaces.IMuseeService;
@Service
public class MuseeService implements IMuseeService{
	@Autowired
	IMuseeDao idao;
	@Override
	public List<Musee> allMusee() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

	@Override
	public void addMusee(String name) {
		// TODO Auto-generated method stub
		Musee c= new Musee	();
		c.setName(name);
		idao.save(c);
	}

	@Override
	public void deleteMusee(long id) {
		// TODO Auto-generated method stub
		idao.deleteById(id);
	}

	@Override
	public void updateMusee(Musee musee) {
		// TODO Auto-generated method stub
		idao.save(musee);
	}

	@Override
	public Musee allMusee(long id) {
		// TODO Auto-generated method stub
		Long ids=id;
		return idao.findById(ids).get();
	}

}
