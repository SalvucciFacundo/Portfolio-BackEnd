package com.yoprogramo.portafolio.services;

import com.yoprogramo.portafolio.models.ExperienceModel;
import com.yoprogramo.portafolio.repositories.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;

@Service
@Transactional
public class ExperienceService {

    @Autowired
    ExperienceRepository experienceRepository;
    //listar
    public ArrayList<ExperienceModel> getAllExperiences(){
        return (ArrayList<ExperienceModel>)experienceRepository.findAll();
    }
    //crear
    public void saveExperience(ExperienceModel experience){
        experienceRepository.save(experience);
    }
    //buscar
    public Optional<ExperienceModel> getExperienceById(Long id) {
        return experienceRepository.findById(id);
    }
    //actualizar
    public ExperienceModel updateExperiece(Long id, ExperienceModel experienceUpdated){
        ExperienceModel experienceModelsUpdate = experienceRepository.findById(id).get();
        experienceModelsUpdate.setCompanyName(experienceUpdated.getCompanyName());
        experienceModelsUpdate.setDescription(experienceUpdated.getDescription());
        experienceModelsUpdate.setEnd(experienceUpdated.getEnd());
        experienceModelsUpdate.setStart(experienceUpdated.getStart());
        experienceModelsUpdate.setImgUrl(experienceUpdated.getImgUrl());
        experienceModelsUpdate.setPerson(experienceUpdated.getPerson());
        return experienceRepository.save(experienceModelsUpdate);
    }
    //eliminar
    public boolean deleteExperience(Long id) {
        try {
            experienceRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}


