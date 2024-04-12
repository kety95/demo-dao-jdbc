package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deleteByID(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
	Department instantiateDepartment(ResultSet rs) throws SQLException;
}
