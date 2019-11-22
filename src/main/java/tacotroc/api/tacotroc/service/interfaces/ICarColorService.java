package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.dto.CarColor;
@Service
public interface ICarColorService {
	List<CarColor> allColor();

	void addColor(CarColor color);

	void deleteColor(long id);

	void updateColor(CarColor color);

	List<CarColor> allColor(long id);
	@Transactional
	public void insertWithQuery(CarColor person) ;
}
