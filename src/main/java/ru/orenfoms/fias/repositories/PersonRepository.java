package ru.orenfoms.fias.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.orenfoms.fias.entitys.Person;

import java.util.List;


public interface PersonRepository extends CrudRepository<Person, String> {

    @Query(nativeQuery = true, value =
            "SELECT * FROM PipENP WHERE enp = :enp"
    )
    List<Person> findPersonByENP(String enp);

}


//@Query("SELECT * FROM account WHERE name = :name")
//    List<AEntity> findAccountsByName(String name);