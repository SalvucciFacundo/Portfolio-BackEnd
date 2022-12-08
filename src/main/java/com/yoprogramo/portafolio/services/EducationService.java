package com.yoprogramo.portafolio.services;

import com.yoprogramo.portafolio.models.EducationModel;
import com.yoprogramo.portafolio.repositories.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;


@Service
@Transactional
public class EducationService {
    @Autowired
    EducationRepository educationRepository;

    //listar
    public ArrayList<EducationModel> getAllEducations(){
        return (ArrayList<EducationModel>) educationRepository.findAll();
    }
    //crear
    public void saveEducation(EducationModel education){

        educationRepository.save(education);
    }

    //buscar por id
     public Optional<EducationModel> getEducatoinById(Long id) {
            return educationRepository.findById(id);
       }

     public EducationModel updateEducation(Long id, EducationModel educationUpdate){
         EducationModel educationModelsUpdate = educationRepository.findById(id).get();
         educationModelsUpdate.setTitle(educationUpdate.getTitle());
         educationModelsUpdate.setInstitute(educationUpdate.getInstitute());
         educationModelsUpdate.setStart(educationUpdate.getStart());
         educationModelsUpdate.setEnd(educationUpdate.getEnd());
         educationModelsUpdate.setLogoUrl(educationModelsUpdate.getLogoUrl());
         educationModelsUpdate.setId(educationUpdate.getId());
         return educationRepository.save(educationModelsUpdate);
     }

     //eliminar

    public boolean deleteEducation(Long id) {
        try {
            educationRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
