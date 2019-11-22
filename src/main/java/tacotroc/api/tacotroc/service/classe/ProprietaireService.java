package tacotroc.api.tacotroc.service.classe;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Proprietaire;
import tacotroc.api.tacotroc.dao.IProprietaireDao;
import tacotroc.api.tacotroc.service.interfaces.IProprietaireService;

@Service
public class ProprietaireService implements IProprietaireService {
@Autowired
 IProprietaireDao idao;

@Override
public List<Proprietaire> allOwner() {
	// TODO Auto-generated method stub
	return idao.findAll();
}

@Override
public void deleteOwner(long id) {
	// TODO Auto-generated method stub
	idao.deleteById(id);
	
}

@Override
public void addUser(Proprietaire owner) {
	// TODO Auto-generated method stub
	idao.save(owner);
	
}

@Override
public Proprietaire allOwner(long id) {
	// TODO Auto-generated method stub
	return idao.findById(id).get();
}


}
