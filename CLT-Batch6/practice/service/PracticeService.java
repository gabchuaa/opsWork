package service;

import java.sql.Date;
import java.util.List;

import model.practiceUser;

public interface PracticeService {

	public void addPerson(practiceUser pref);
	public void updatePerson(practiceUser pref );
	
	public  List<practiceUser> listUser ();
	
	public void getPersonID(practiceUser pref);
	
	public void removePersionID(practiceUser pref);
}
