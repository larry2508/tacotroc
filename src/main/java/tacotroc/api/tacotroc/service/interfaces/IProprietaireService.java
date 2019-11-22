package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Proprietaire;
@Service
public interface IProprietaireService {

	List<Proprietaire> allOwner();

	void deleteOwner(long id);

	void addUser(Proprietaire owner);

	Proprietaire allOwner(long id);
}
