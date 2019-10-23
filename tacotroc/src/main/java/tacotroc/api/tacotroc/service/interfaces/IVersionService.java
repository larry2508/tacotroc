package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import tacotroc.api.tacotroc.beans.Version;

public interface IVersionService {

	List<Version> allVersion();

	Version allVersion(int id);

	void addCVersion(String name);

	void deleteVersion(int id);

	void updateColor(Version version);

}
