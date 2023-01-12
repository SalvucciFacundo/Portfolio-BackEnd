package com.yoprogramo.portafolio.repositories;

import com.yoprogramo.portafolio.models.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository <PersonModel, Long> {
    public Optional<PersonModel>findByEmail(String email);
}
