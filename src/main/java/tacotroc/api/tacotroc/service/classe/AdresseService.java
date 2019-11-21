package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Adresse;
import tacotroc.api.tacotroc.dao.IAdresseDao;
import tacotroc.api.tacotroc.service.interfaces.IAdresseService;
@Service
public class AdresseService implements IAdresseService{
	@Autowired
	IAdresseDao idao;
	@Override
	public List<Adresse> allAdresse() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

	@Override
	public void deleteAdresse(long id) {
		// TODO Auto-generated method stub
		idao.deleteById(id);
	}

	@Override
	public void addAdresse(Adresse adresseS) {
		// TODO Auto-generated method stub
		idao.save(adresseS);
	}

	@Override
	public Adresse allAdresse(long id) {
		// TODO Auto-generated method stub
		Long ids=id;
		return idao.findById(ids).get();
	}

}
