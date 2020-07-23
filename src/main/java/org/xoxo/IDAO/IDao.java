package org.xoxo.IDAO;

import org.springframework.stereotype.Repository;
import org.xoxo.DTO.Person;

import java.util.List;

@Repository
public interface IDao {
    void insertProc(Person person);
    List<Person> selectAll();
    Person selectPart(String id);
}
