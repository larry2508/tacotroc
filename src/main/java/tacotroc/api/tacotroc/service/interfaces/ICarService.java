package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public interface ICarService {
	List<tacotroc.api.tacotroc.beans.Car> allCar();

	void addCar(tacotroc.api.tacotroc.beans.Car car);

	void deleteCar(long id);

	void updateCar(tacotroc.api.tacotroc.beans.Car car);

	tacotroc.api.tacotroc.beans.Car allCar(long id);
}
