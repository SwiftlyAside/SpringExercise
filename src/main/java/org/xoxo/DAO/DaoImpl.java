package org.xoxo.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.xoxo.DTO.Person;
import org.xoxo.IDAO.IDao;

@Repository
public class DaoImpl implements IDao {
    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public void insertProc(Person person) {
        IDao iDao = sqlSession.getMapper(IDao.class);
        iDao.insertProc(person);
    }
}
