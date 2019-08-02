package service;

import dao.EmployeeDAO;
import model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO refEmployeeDAO;
	
	@Override
	public void callAddEmployee(Employee refEmployee) {
		refEmployeeDAO = new EmployeeDAOImpl();
		refEmployeeDAO.addEmployee(refEmployee);
		
	}
	
	

}
