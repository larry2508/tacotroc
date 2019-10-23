package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Type;

@Service
public interface ITypeService {

	List<Type> allType();

	Type allType(int id);

	void addType(String name);

	void deleteType(int id);

	void updateType(Type type);
}
