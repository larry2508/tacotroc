package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Color;
import tacotroc.api.tacotroc.dao.IColorDao;
import tacotroc.api.tacotroc.service.interfaces.IColorService;

@Service
public class ColorService implements IColorService {

@Autowired
IColorDao idao;

@Override
public List<Color> allColor() {
	
	return idao.findAll();
}


@Override
public void addColor(String name) {
	Color c= new Color();
	c.setName(name);
	idao.save(c);

	
}


@Override
public void deleteColor(long id) {
	
	idao.deleteById(id);
	// TODO Auto-generated method stub
	
}


@Override
public void updateColor(Color color) {
	idao.save(color);
	// TODO Auto-generated method stub
	
}


@Override
public Color allColor(long id) {
	// TODO Auto-generated method stub
	Long ids=id;
	return idao.findById(ids).get();
}


}
