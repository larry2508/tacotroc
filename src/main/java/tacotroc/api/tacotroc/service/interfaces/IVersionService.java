package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Version;

@Service
public interface IVersionService {

	List<Version> allVersion();

	Version allVersion(long id);

	void addCVersion(String name);

	void deleteVersion(long id);

	void updateVersion(Version version);

}
