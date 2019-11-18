package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Pays;
import tacotroc.api.tacotroc.dao.IPaysDao;
import tacotroc.api.tacotroc.service.interfaces.IPaysService;
@Service
public class PaysService  implements IPaysService{
	@Autowired
	IPaysDao idao;
	@Override
	public List<Pays> allPays() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

	@Override
	public void addPays(String name) {
		// TODO Auto-generated method stub
		Pays c= new Pays();
		c.setName(name);
		idao.save(c);
	}

	@Override
	public void deletePays(int id) {
		// TODO Auto-generated method stub
		idao.deleteById(id);
	}

	@Override
	public void updatePays(Pays pays) {
		// TODO Auto-generated method stub
		idao.save(pays);
	}

	@Override
	public Pays allPays(int id) {
		// TODO Auto-generated method stub
		
		Integer ids=id;
		return idao.findById(ids).get();
	}

}
