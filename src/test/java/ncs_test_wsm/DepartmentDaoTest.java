package ncs_test_wsm;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import ncs_test_wsm.dao.DepartmentDao;
import ncs_test_wsm.dao.DepartmentDaoImpl;
import ncs_test_wsm.dto.Department;

public class DepartmentDaoTest extends AbstractTest {
	private DepartmentDao dao = DepartmentDaoImpl.getInstance();
	
	@Test
	public void test01selectDepartmentByNo() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department dept = new Department();
		dept.setDeptno(1);
		
		Department newDept = dao.selectDepartmentByNo(dept);
		Assert.assertNotNull(newDept);
	}
	
	@Test
	public void test02selectDepartmentByAll() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Department> list = dao.selectDepartmentByAll();
		Assert.assertNotNull(list);
	}
	
	@Test
	public void test03insertDepartment() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department dept = new Department();
		dept.setDeptno(5);
		dept.setDeptname("홍길동");
		dept.setFloor(3);
		
		int res = dao.insertDepartment(dept);
		Assert.assertEquals(1, res);
	}
	@Test
	public void test04updateDepartment() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department dept = new Department();
		dept.setDeptno(5);
		dept.setDeptname("홍길동2");
		dept.setFloor(4);
		
		int res = dao.updateDepartment(dept);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test05deleteDepartment() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department dept = new Department();
		dept.setDeptno(5);
		
		int res = dao.deleteDepartment(dept);
		Assert.assertEquals(1, res);
	}
}






















