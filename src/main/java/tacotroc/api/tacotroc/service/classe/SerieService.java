package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Serie;
import tacotroc.api.tacotroc.dao.ISerieDao;
import tacotroc.api.tacotroc.service.interfaces.ISerieService;

@Service
public class SerieService implements ISerieService {

	@Autowired
	ISerieDao idao;
	
	@Override
	public List<Serie> allSerie() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

	@Override
	public Serie allSerie(long id) {
		// TODO Auto-generated method stub
		Long ids=id;
		return idao.findById(ids).get();
	}

	@Override
	public void addCSerie(String name) {
		// TODO Auto-generated method stub
		Serie c= new Serie();
		c.setName(name);
		idao.save(c);
	}

	@Override
	public void deleteSerie(long id) {
		// TODO Auto-generated method stub
		idao.deleteById(id);
	}

	@Override
	public void updateSerie(Serie serie) {
		// TODO Auto-generated method stub
		idao.save(serie);
	}

}
