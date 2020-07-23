package org.xoxo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xoxo.DTO.Person;
import org.xoxo.IDAO.IDao;

import java.util.List;

@Service
public class ServiceImpl implements IService {
    private final IDao personDao;

    @Autowired
    public ServiceImpl(IDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public void insertProc(Person person) {
        personDao.insertProc(person);
    }

    @Override
    public List<Person> selectAll() {
        return personDao.selectAll();
    }

    @Override
    public Person selectPart(String id) {
        return personDao.selectPart(id);
    }

}
