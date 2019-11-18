package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Club;
import tacotroc.api.tacotroc.dao.IClubDao;
import tacotroc.api.tacotroc.service.interfaces.IClubService;
@Service
public class ClubService implements IClubService {
	@Autowired
	IClubDao idao;
	@Override
	public List<Club> allClub() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

	@Override
	public void addClub(String name) {
		// TODO Auto-generated method stub
		Club c= new Club();
		c.setName(name);
		idao.save(c);

	}

	@Override
	public void deleteClub(int id) {
		// TODO Auto-generated method stub
		idao.deleteById(id);
	}

	@Override
	public void updateClub(Club club) {
		// TODO Auto-generated method stub
		idao.save(club);
	}

	@Override
	public Club allClub(int id) {
		// TODO Auto-generated method stub
		Integer ids=id;
		return idao.findById(ids).get();
	}

}
