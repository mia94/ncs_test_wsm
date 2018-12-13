package ncs_test_wsm;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import ncs_test_wsm.dao.TitleDao;
import ncs_test_wsm.dao.TitleDaoImpl;
import ncs_test_wsm.dto.Title;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TitleDaoTest extends AbstractTest {
	private TitleDao dao = TitleDaoImpl.getInstance();
	
	@Test
	public void test01selectTitleByNo() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Title title = new Title();
		title.setNo(1);
		
		Title newTitle = dao.selectTitleByNo(title);
		Assert.assertNotNull(newTitle);
	}
	
	@Test
	public void test02selectTitleByAll() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Title> list = dao.selectTitleByAll();
		Assert.assertNotNull(list);
	}
	
	@Test
	public void test03insertTitle() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Title title = new Title();
		title.setNo(5);
		title.setName("인턴");
		
		int res = dao.insertTitle(title);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test04updateTitle() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Title title = new Title();
		title.setNo(5);
		title.setName("알바");
		
		int res = dao.updateTitle(title);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test05deleteTitle() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Title title = new Title();
		title.setNo(5);
		
		int res = dao.deleteTitle(title);
		Assert.assertEquals(1, res);
	}
}


















