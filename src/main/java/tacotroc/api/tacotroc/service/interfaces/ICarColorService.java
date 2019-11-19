package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.dto.CarColor;
@Service
public interface ICarColorService {
	List<CarColor> allColor();

	void addColor(CarColor color);

	void deleteColor(int id);

	void updateColor(CarColor color);

	List<CarColor> allColor(int id);
}
