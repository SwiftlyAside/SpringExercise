package org.xoxo.Service;

import org.xoxo.DTO.Person;

import java.util.List;

public interface IService {
    void insertProc(Person person);

    List<Person> selectAll();

    Person selectPart(String id);

    void modifyProc(Person person);

    void deleteProc(String id);
}
