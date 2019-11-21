package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Cylindre;
import tacotroc.api.tacotroc.dao.ICylindreDao;
import tacotroc.api.tacotroc.service.interfaces.ICylindreService;
@Service
public class CylindreService implements ICylindreService{
	@Autowired
	ICylindreDao idao;
	
	@Override
	public List<Cylindre> allCylindre() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

	@Override
	public void addCylindre(String name) {
		// TODO Auto-generated method stub
		Cylindre c= new Cylindre();
		c.setName(name);
		idao.save(c);
		
	}

	@Override
	public void deleteCylindre(long id) {
		// TODO Auto-generated method stub
		idao.deleteById(id);
	}

	@Override
	public void updateCylindre(Cylindre cylindre) {
		// TODO Auto-generated method stub
		idao.save(cylindre);
	}

	@Override
	public Cylindre allCylindre(long id) {
		// TODO Auto-generated method stub
		Long ids=id;
		return idao.findById(ids).get();
	}

}
