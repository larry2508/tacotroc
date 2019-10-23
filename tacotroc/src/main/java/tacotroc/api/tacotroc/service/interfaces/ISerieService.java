package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Serie;

@Service
public interface ISerieService {

	List<Serie> allSerie();

	Serie allSerie(int id);

	void addCSerie(String name);

	void deleteSerie(int id);

	void updateSerie(Serie serie);
}
