package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Nationalite;
@Service
public interface INationService {
	List<Nationalite> allNation();

	void addNation(String name);

	void deleteNation(int id);

	void updateNation(Nationalite nation);

	Nationalite allNation(int id);
}
