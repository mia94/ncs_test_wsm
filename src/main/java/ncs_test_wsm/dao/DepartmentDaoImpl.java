package ncs_test_wsm.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import ncs_test_wsm.jdbc.MyBatisSqlSessionFactory;
import ncs_test_wsm.dto.Department;

public class DepartmentDaoImpl implements DepartmentDao {
	private static final DepartmentDaoImpl instance = new DepartmentDaoImpl();
	private static final String namespace = "ncs_test_wsm.dao.DepartmentDao";
	
	public static DepartmentDaoImpl getInstance() {
		return instance;
	}

	private DepartmentDaoImpl() {}

	@Override
	public Department selectDepartmentByNo(Department department) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			return sqlSession.selectOne(namespace + ".selectDepartmentByNo", department);
		}
	}

	@Override
	public List<Department> selectDepartmentByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			return sqlSession.selectList(namespace+".selectDepartmentByAll");
		}
	}

	@Override
	public int insertDepartment(Department department) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			int res = sqlSession.insert(namespace+".insertDepartment",department);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public int updateDepartment(Department department) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			int res = sqlSession.update(namespace+".updateDepartment", department);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public int deleteDepartment(Department department) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			int res = sqlSession.delete(namespace+".deleteDepartment", department);
			sqlSession.commit();
			return res;
		}
	}

	

}
