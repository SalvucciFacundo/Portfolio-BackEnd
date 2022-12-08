package com.yoprogramo.portafolio.repositories;

import com.yoprogramo.portafolio.models.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PersonRepository extends JpaRepository <PersonModel, Long> {
    public abstract ArrayList<PersonModel> findByLastName(String lastName);
}
