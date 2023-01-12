package com.yoprogramo.portafolio.services;

import com.yoprogramo.portafolio.Interface.InterfacePersonService;
import com.yoprogramo.portafolio.models.PersonModel;
import com.yoprogramo.portafolio.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;



@Service
@Transactional
public class PersonService implements InterfacePersonService {
    @Autowired
    PersonRepository personaRepositorio;
    @Override
    public List<PersonModel> get() {
        return personaRepositorio.findAll();
    }

    @Override
    public void save(PersonModel persona) {
        personaRepositorio.save(persona);
    }

    @Override
    public void delete(Long id) {
        personaRepositorio.deleteById(id);
    }

    @Override
    public PersonModel find(Long id) {
        return personaRepositorio.findById(id).orElse(null);
    }
    public boolean existsById(Long id){
        return personaRepositorio.existsById(id);
    }

   /* @Autowired
    PersonRepository personRepository;
    //get All persons
    public ArrayList<PersonModel> getAllPersons(){
        return (ArrayList<PersonModel>)personRepository.findAll();
    }

    //create person
    public String savePerson(PersonModel person){
        try {
            personRepository.save(person);
            return "Registro creado";
        }catch (Exception e){
            return "Error"+e;
        }

    }
    //find person by id
    public Optional<PersonModel> getPersonById(Long id) {
        return personRepository.findById(id);
    }
    //update person
    public String updatePerson(Long id, PersonModel personUpdated){
        try {
            PersonModel personModelsUpdate = personRepository.findById(id).get();
            personModelsUpdate.setName(personUpdated.getName());
            personModelsUpdate.setLastName(personUpdated.getLastName());
            personModelsUpdate.setEmail(personUpdated.getEmail());
            personModelsUpdate.setBirth(personUpdated.getBirth());
            personModelsUpdate.setAboutMe(personUpdated.getAboutMe());
            personModelsUpdate.setNationality(personUpdated.getNationality());
            personModelsUpdate.setPhone(personUpdated.getPhone());
            personModelsUpdate.setTitle(personUpdated.getTitle());
            personModelsUpdate.setProfileUrl(personUpdated.getProfileUrl());
            personModelsUpdate.setBannerUrl(personUpdated.getBannerUrl());
            personRepository.save(personModelsUpdate);
            return "Persona actualizada";
        }catch (Exception e){
            return "Error"+e;
        }


    }
    //delete person
    public boolean deletePerson(Long id) {
        try {
            personRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    */

}
