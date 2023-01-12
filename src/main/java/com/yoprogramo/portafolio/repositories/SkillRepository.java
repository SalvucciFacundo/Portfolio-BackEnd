package com.yoprogramo.portafolio.repositories;


import com.yoprogramo.portafolio.models.SkillModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SkillRepository extends JpaRepository<SkillModel, Long> {
    public List<SkillModel>getSkillModelByType(String type);
    public boolean existsByName(String name);

}
