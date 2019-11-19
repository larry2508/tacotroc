package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import tacotroc.api.tacotroc.dto.Car;


public interface ICarService {
	List<tacotroc.api.tacotroc.beans.Car> allClub();

	void addCar(tacotroc.api.tacotroc.beans.Car car);

	void deleteCar(int id);

	void updateCar(Car car);

	tacotroc.api.tacotroc.beans.Car allCar(int id);
}
