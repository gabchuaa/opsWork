package dao;

import java.util.List;

import model.practiceUser;

public interface PracticePersonDao {
	
	public void addPerson(practiceUser pRef);
	public void updatePerson(practiceUser pRef);
	public List<practiceUser> listPerson();
	public void getPersonById(int id);
	public void removePerson(int id);

}
