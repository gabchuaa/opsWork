package dao;

import java.io.IOException;
import java.util.List;

import model.practiceUser;

public interface PracticePersonDao {
	
	public void addPerson(practiceUser pRef);
	public void updatePerson(practiceUser pRef);
	public List<practiceUser> listPerson();
	public void getPersonById(String id);
	public void removePerson(String id);

}
