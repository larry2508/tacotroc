package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Cylindre;

@Service
public interface ICylindreService {
	
	List<Cylindre> allCylindre();

	 void addCylindre(String name);

	void deleteCylindre(int id);

	void updateCylindre(Cylindre cylindre);

	Cylindre allCylindre(int id);
}
