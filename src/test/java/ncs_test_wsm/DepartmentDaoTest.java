package ncs_test_wsm;

import static org.junit.Assert.*;

import org.junit.Test;

import ncs_test_wsm.dao.DepartmentDao;
import ncs_test_wsm.dao.DepartmentDaoImpl;

public class DepartmentDaoTest extends AbstractTest {
	private DepartmentDao dao = DepartmentDaoImpl.getInstance();
	
	@Test
	public void test01selectDepartmentByNo() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		
	}

}
