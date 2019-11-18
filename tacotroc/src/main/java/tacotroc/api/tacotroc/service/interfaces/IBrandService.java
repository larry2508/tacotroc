package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Marque;

@Service
public interface IBrandService {
	List<Marque> allMarque();

	void addMarque(String name);

	void deleteMarque(int id);

	void updateMarque(Marque marque);

	Marque allMarque(int id);
}

