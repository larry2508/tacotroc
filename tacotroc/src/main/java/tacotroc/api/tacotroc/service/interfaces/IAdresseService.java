package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import tacotroc.api.tacotroc.beans.Adresse;

public interface IAdresseService {
	List<Adresse> allAdresse();

	void deleteAdresse(int id);

	void addAdresse (Adresse adresseS);

	Adresse allAdresse(int id);
}
