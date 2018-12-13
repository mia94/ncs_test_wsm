package ncs_test_wsm.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import ncs_test_wsm.jdbc.MyBatisSqlSessionFactory;
import ncs_test_wsm.dto.Title;

public class TitleDaoImpl implements TitleDao {
	private static final TitleDaoImpl instance = new TitleDaoImpl();

	public static TitleDaoImpl getInstance() {
		return instance;
	}
	
	private TitleDaoImpl() {}
	
	private static final String namespace = "ncs_test_wsm.dao.TitleDao";

	@Override
	public Title selectTitleByNo(Title title) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			return sqlSession.selectOne(namespace+".selectTitleByNo",title);
		}
		
	}

	@Override
	public List<Title> selectTitleByAll() {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			return sqlSession.selectList(namespace+".selectTitleByAll");
		}
	}

	@Override
	public int insertTitle(Title title) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			int res = sqlSession.insert(namespace+".insertTitle",title);
			sqlSession.commit();
			return res;
		}
		
	}

	@Override
	public int updateTitle(Title title) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			int res = sqlSession.update(namespace+".updateTitle",title);
			sqlSession.commit();
			return res;
		}
	}

	@Override
	public int deleteTitle(Title title) {
		try (SqlSession sqlSession = MyBatisSqlSessionFactory.openSession()) {
			int res = sqlSession.delete(namespace+".deleteTitle",title);
			sqlSession.commit();
			return res;
		}
	}

}















