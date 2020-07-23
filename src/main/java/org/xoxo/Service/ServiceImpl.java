package org.xoxo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xoxo.DTO.Person;
import org.xoxo.IDAO.IDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public void modifyProc(Person person) {
        Map<String, String> map = new HashMap<>();
        map.put("id", String.valueOf(person.getId()));
        map.put("fn", person.getFirstName());
        map.put("ln", person.getLastName());
        personDao.modifyProc(map);
    }

    @Override
    public void deleteProc(String id) {
        personDao.deleteProc(id);
    }

}
