package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Color;
import tacotroc.api.tacotroc.dao.IColorDao;
import tacotroc.api.tacotroc.service.interfaces.IColorService;

@Service
public class Colorservice implements IColorService {

@Autowired
IColorDao icolordao;

@Override
public List<Color> allColor() {
	
	return icolordao.findAll();
}


@Override
public void addColor(String name) {
	Color c= new Color();
	c.setName(name);
	icolordao.save(c);

	
}


@Override
public void deleteColor(int id) {
	
	icolordao.deleteById(id);
	// TODO Auto-generated method stub
	
}


@Override
public void updateColor(Color color) {
	icolordao.save(color);
	// TODO Auto-generated method stub
	
}


@Override
public Color allColor(int id) {
	// TODO Auto-generated method stub
	Integer ids=id;
	return icolordao.findById(ids).get();
}


}
