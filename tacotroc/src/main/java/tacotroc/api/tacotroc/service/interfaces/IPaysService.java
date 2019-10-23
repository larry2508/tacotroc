package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Pays;
@Service
public interface IPaysService {

	List<Pays> allPays();

	void addPays(String name);

	void deletePays(int id);

	void updatePays(Pays pays);

	Pays allPays(int id);
}
