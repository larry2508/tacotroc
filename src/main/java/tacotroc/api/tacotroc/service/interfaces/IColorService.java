package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Color;

@Service
public interface IColorService {


	List<Color> allColor();

	void addColor(String name);

	void deleteColor(long id);

	void updateColor(Color color);

	Color allColor(long id);


}
