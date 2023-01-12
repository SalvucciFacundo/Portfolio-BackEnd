package com.yoprogramo.portafolio.repositories;

import com.yoprogramo.portafolio.models.ExperienceModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExperienceRepository extends JpaRepository<ExperienceModel, Long> {
     Optional<ExperienceModel> findByCompanyName(String companyName);
     boolean existsByCompanyName(String companyName);

}
