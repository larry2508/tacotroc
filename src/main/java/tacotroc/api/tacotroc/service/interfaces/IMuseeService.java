package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Musee;
@Service
public interface IMuseeService {
	List<Musee> allMusee();

	void addMusee(String name);

	void deleteMusee(long id);

	void updateMusee(Musee musee);

	Musee allMusee(long id);
}
