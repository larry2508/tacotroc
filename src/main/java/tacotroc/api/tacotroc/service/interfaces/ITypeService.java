package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Type;

@Service
public interface ITypeService {

	List<Type> allType();

	Type allType(long id);

	void addType(String name);

	void deleteType(long id);

	void updateType(Type type);
}
