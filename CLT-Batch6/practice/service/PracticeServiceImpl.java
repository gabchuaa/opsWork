package service;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

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

	@Override
	public List<practiceUser> listUser() {
		pRefDao = new PracticePersonDaoImpl();
		return pRefDao.listPerson();
	}

	@Override
	public void getPersonID(practiceUser pref) {
		pRefDao = new PracticePersonDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		String id = sc.next();
		pRefDao.getPersonById(id);
		
	}

	@Override
	public void removePersionID(practiceUser pref) {
		pRefDao = new PracticePersonDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id to remove");
		String id = sc.next();
		pRefDao.removePerson(id);
		
	}
	
	
	

}
