package org.xoxo.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xoxo.DTO.Person;
import org.xoxo.IDAO.IDao;

@Service
public class ServiceImpl implements IService {
    private static final Logger logger =
            LoggerFactory.getLogger(ServiceImpl.class);
    @Autowired
    private IDao personDao;

    @Override
    public void insertProc(Person person) {
        personDao.insertProc(person);
        logger.info("입력 완료");
    }

}
