package com.yoprogramo.portafolio.services;

import com.yoprogramo.portafolio.Interface.InterfaceSkillService;
import com.yoprogramo.portafolio.models.SkillModel;
import com.yoprogramo.portafolio.repositories.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class SkillService implements InterfaceSkillService {
    @Autowired
    SkillRepository skillRepository;

    @Override
    public List<SkillModel> get() {
        return skillRepository.findAll();
    }
    @Override
    public void save(SkillModel skill) {
        skillRepository.save(skill);
    }
    @Override
    public void delete(Long id) {
        skillRepository.deleteById(id);
    }
    @Override
    public SkillModel find(Long id) {
        return skillRepository.findById(id).orElse(null);
    }
    public List<SkillModel> getSkillByType(String type) {
        return skillRepository.getSkillModelByType(type);
    }

    public boolean existsById(Long id){
        return skillRepository.existsById(id);
    }
    public boolean existByName(String name){
        return skillRepository.existsByName(name);
    }

}
