package com.yoprogramo.portafolio.Interface;

import com.yoprogramo.portafolio.models.PersonModel;

import java.util.List;
import java.util.Optional;

public interface InterfacePersonService {
    public List<PersonModel>get();
    public void save(PersonModel persona);
    public void delete(Long id);
    public PersonModel find(Long id);

}
