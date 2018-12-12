package ncs_test_wsm.dao;

import java.util.List;

import ncs_test_wsm.dto.Department;

public interface DepartmentDao {
	
	Department selectDepartmentByNo();
	List<Department> selectDepartmentByAll();
	
	int insertDepartment();
	int updateDepartment();
	int deleteDepartment();
}
