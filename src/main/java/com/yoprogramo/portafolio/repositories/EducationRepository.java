package com.yoprogramo.portafolio.repositories;

import com.yoprogramo.portafolio.models.EducationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EducationRepository extends JpaRepository<EducationModel, Long> {

    public boolean existsByInstitute(String institute);
}
