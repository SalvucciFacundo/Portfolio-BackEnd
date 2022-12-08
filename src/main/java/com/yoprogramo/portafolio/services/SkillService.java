package com.yoprogramo.portafolio.services;

import com.yoprogramo.portafolio.models.SkillModel;
import com.yoprogramo.portafolio.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;

@Service
@Transactional
public class SkillService {
    @Autowired
    SkillRepository skillRepository;

    public ArrayList<SkillModel> getAllSkill(){
        return (ArrayList<SkillModel>)skillRepository.findAll();
    }

    public void saveSkill(SkillModel skill){
        skillRepository.save(skill);
    }

    public Optional<SkillModel> getSkillById(Long id) {
        return skillRepository.findById(id);
    }

    public SkillModel updateSkill(Long id, SkillModel skillUpdated){
        SkillModel skillModelsUpdate = skillRepository.findById(id).get();
        skillModelsUpdate.setName(skillUpdated.getName());
        skillModelsUpdate.setValue(skillUpdated.getValue());
        skillModelsUpdate.setType(skillUpdated.getType());
        skillModelsUpdate.setImgUrl(skillUpdated.getImgUrl());
        skillModelsUpdate.setPerson(skillUpdated.getPerson());
        return skillRepository.save(skillModelsUpdate);
    }
    public boolean deleteSkill(Long id) {
        try {
            skillRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
