package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Version;

@Service
public interface IVersionService {

	List<Version> allVersion();

	Version allVersion(int id);

	void addCVersion(String name);

	void deleteVersion(int id);

	void updateVersion(Version version);

}
