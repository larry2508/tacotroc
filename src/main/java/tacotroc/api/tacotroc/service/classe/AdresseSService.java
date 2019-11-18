package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.AdresseS;
import tacotroc.api.tacotroc.dao.IAdresseSDao;
import tacotroc.api.tacotroc.service.interfaces.IAdresseSService;

@Service
public class AdresseSService implements IAdresseSService{

	@Autowired
	IAdresseSDao idao;
	@Override
	public List<AdresseS> allAdresseS() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

	@Override
	public void deleteAdresseS(int id) {
		// TODO Auto-generated method stub
		idao.deleteById(id);
	}

	@Override
	public void addAdresseS(AdresseS adresseS) {
		// TODO Auto-generated method stub
		idao.save(adresseS);
	}

	@Override
	public AdresseS allAdresseS(int id) {
		// TODO Auto-generated method stub
		Integer ids=id;
		return idao.findById(ids).get();
	}

}
