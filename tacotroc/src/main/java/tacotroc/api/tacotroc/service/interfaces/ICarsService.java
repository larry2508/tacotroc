package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Cars;
@Service
public interface ICarsService {

	List<Cars> allCars();

	void deleteCars(int id);

	void addCars (Cars cars);

	Cars allCars(int id);
}
