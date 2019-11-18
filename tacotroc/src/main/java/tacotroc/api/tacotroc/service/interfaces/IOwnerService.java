package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Owner;
@Service
public interface IOwnerService {
	List<Owner> allOwner();

	void deleteOwner(int id);

	void addOwner(Owner user);

	Owner allOwner(int id);
}
