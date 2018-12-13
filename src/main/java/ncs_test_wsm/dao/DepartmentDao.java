package ncs_test_wsm.dao;

import java.util.List;

import ncs_test_wsm.dto.Department;

public interface DepartmentDao {
	
	Department selectDepartmentByNo(Department department);
	List<Department> selectDepartmentByAll();
	
	int insertDepartment(Department department);
	int updateDepartment(Department department);
	int deleteDepartment(Department department);
}
