package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Serie;

@Service
public interface ISerieService {

	List<Serie> allSerie();

	Serie allSerie(long id);

	void addCSerie(String name);

	void deleteSerie(long id);

	void updateSerie(Serie serie);
}
