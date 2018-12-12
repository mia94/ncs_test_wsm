package ncs_test_wsm.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import ncs_test_wsm.dto.Department;

public class DepartmentDaoImpl implements DepartmentDao {
	private static final String namespace = "ncs_test_wsm.dao.DepartmentDao";
	
	public DepartmentDaoImpl() {
		
	}

	@Override
	public Department selectDepartmentByNo() {
		return null;
	}

	@Override
	public List<Department> selectDepartmentByAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertDepartment() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDepartment() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteDepartment() {
		// TODO Auto-generated method stub
		return 0;
	}

}
