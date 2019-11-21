package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Nationalite;
import tacotroc.api.tacotroc.dao.INationDao;
import tacotroc.api.tacotroc.service.interfaces.INationService;
@Service
public class NationService implements INationService{
	@Autowired
	INationDao idao;
	@Override
	public List<Nationalite> allNation() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

	@Override
	public void addNation(String name) {
		// TODO Auto-generated method stub
		Nationalite c= new Nationalite();
		c.setName(name);
		idao.save(c);
	}

	@Override
	public void deleteNation(long id) {
		// TODO Auto-generated method stub
		idao.deleteById(id);
	}

	@Override
	public void updateNation(Nationalite nation) {
		// TODO Auto-generated method stub
		idao.save(nation);
	}

	@Override
	public Nationalite allNation(long id) {
		// TODO Auto-generated method stub
		Long ids=id;
		return idao.findById(ids).get();
	}

}
