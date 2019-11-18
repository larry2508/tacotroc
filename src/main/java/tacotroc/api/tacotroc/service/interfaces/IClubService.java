package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Club;

@Service
public interface IClubService {
	List<Club> allClub();

	void addClub(String name);

	void deleteClub(int id);

	void updateClub(Club club);

	Club allClub(int id);
}
