package com.yoprogramo.portafolio.controllers;

import com.yoprogramo.portafolio.models.PersonModel;
import com.yoprogramo.portafolio.repositories.PersonRepository;
import com.yoprogramo.portafolio.services.PersonService;
import org.hibernate.mapping.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/person")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonControllers {
    @Autowired
    PersonService personService;

    @GetMapping("/all")
    public ArrayList<PersonModel> getAllPerson(){
        return personService.getAllPersons();
    }

    @PostMapping("/create")
    public String savePerson(@RequestBody PersonModel personSave){
        return personService.savePerson(personSave);
    }

    @GetMapping("/{id}")
    public Optional<PersonModel> getPersonById(@PathVariable("id")Long id){
        return personService.getPersonById(id);
    }

    @PutMapping("/{id}")
    public String updatePerson(@PathVariable("id")Long id,@RequestBody PersonModel personUpdated){
         personService.updatePerson(id,personUpdated);
        return "persona actualizada";
    }

    @GetMapping("/query")
    public ArrayList<PersonModel> getPersonByLastName(@RequestParam("lastName") String lastName){
        return personService.getPersonByLastName(lastName);
    }
    @DeleteMapping("/{id}")
    public String removePerson(@PathVariable("id")Long id){
        if(personService.deletePerson(id)){
            return "The person whit id"+id+" was removed correctly";
        }else{
            return "The person can't be fount";
        }
    }
}
