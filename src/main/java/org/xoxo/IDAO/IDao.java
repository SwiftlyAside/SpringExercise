package org.xoxo.IDAO;

import org.springframework.stereotype.Repository;
import org.xoxo.DTO.Person;

@Repository
public interface IDao {
    void insertProc(Person person);
}
