package appication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Department> list = new ArrayList<Department>();
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department dep = new Department(null, "Serviços");
		departmentDao.insert(dep);
		System.out.println("== TEST 1 department insert ==");
		System.out.println("New Id: " + dep.getId());
		
		System.out.println();
		System.out.println("== TEST 2 department update ==");
		departmentDao.update(new Department(6, "Comercial"));
		System.out.println("Update completed");
		
		System.out.println();
		System.out.println("== TEST 3 department findById ==");
		System.out.println(departmentDao.findById(1).toString());
		
		System.out.println();
		System.out.println("== TEST 4 department findAll ==");
		list = departmentDao.findAll();
		for(Department dep1 : list) {
			System.out.println(dep1.toString());
		}
		
		System.out.println();
		System.out.println("== TEST 5 department deleteById ==");
		System.out.print("Enter id for the delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteByID(id);
		System.out.println("Delete completed");
		sc.close();
	}

}
