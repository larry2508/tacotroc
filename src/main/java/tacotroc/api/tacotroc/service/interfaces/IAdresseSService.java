package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.AdresseS;

@Service
public interface IAdresseSService {

	List<AdresseS> allAdresseS();

	void deleteAdresseS(long id);

	void addAdresseS (AdresseS adresseS);

	AdresseS allAdresseS(long id);
}
