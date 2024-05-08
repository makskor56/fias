package ru.orenfoms.fias.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.orenfoms.fias.entitys.Person;
import ru.orenfoms.fias.repositories.PersonRepository;

import java.util.*;

import java.util.stream.Stream;



@Controller
public class HomeController {
    private final static String PREFIX = "/kmn/";
    PersonRepository personRepository;
    HomeController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping(PREFIX + "home")
    public String home(Model model) {
        model.addAttribute("TextHTML","_________Вставленный текст___________");
        return "home";
    }

    @RequestMapping(PREFIX + "list")
    @ResponseBody
    public Iterable<Integer> test() {
        List<Integer> list = Stream.iterate(0, x -> x + 1).limit(100L).toList();
        System.out.println("test1");
        return list;
    }

    @RequestMapping(PREFIX + "person/{enp}")
    @ResponseBody
    public Iterable<Person> findPersonByENP(@PathVariable("enp") String enp) {
        return personRepository.findPersonByENP(enp);
    }

}
