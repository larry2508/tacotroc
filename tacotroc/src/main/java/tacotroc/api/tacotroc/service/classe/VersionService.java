package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Version;
import tacotroc.api.tacotroc.dao.IVersionDao;
import tacotroc.api.tacotroc.service.interfaces.IVersionService;

@Service
public class VersionService implements IVersionService {
	@Autowired
	IVersionDao icolordao;
	@Override
	public List<Version> allVersion() {
		// TODO Auto-generated method stub
		return icolordao.findAll();
	}

	@Override
	public Version allVersion(int id) {
		Integer ids=id;
		return icolordao.findById(ids).get();
	}

	@Override
	public void addCVersion(String name) {
		Version c= new Version();
		c.setName(name);
		icolordao.save(c);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteVersion(int id) {
		icolordao.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateColor(Version version) {
		icolordao.save(version);
		// TODO Auto-generated method stub
		
	}

}
