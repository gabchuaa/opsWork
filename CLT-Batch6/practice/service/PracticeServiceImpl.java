package service;

import java.sql.Date;
import java.sql.SQLException;

import dao.PracticePersonDao;
import dao.PracticePersonDaoImpl;
import model.practiceUser;


public class PracticeServiceImpl implements PracticeService {
	PracticePersonDao pRefDao;
	
	@Override
	public void addPerson(practiceUser pref) {
		pRefDao = new PracticePersonDaoImpl();
		pRefDao.addPerson(pref);
	}

	@Override
	public void updatePerson(practiceUser pref) {
		pRefDao = new PracticePersonDaoImpl();
		pRefDao.updatePerson(pref);
		
		
	}

	
	
	
	

}
