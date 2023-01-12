package com.yoprogramo.portafolio.services;

import com.yoprogramo.portafolio.Interface.InterfaceEducationService;
import com.yoprogramo.portafolio.models.EducationModel;
import com.yoprogramo.portafolio.models.ExperienceModel;
import com.yoprogramo.portafolio.repositories.EducationRepository;
import com.yoprogramo.portafolio.repositories.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class EducationService implements InterfaceEducationService {
    @Autowired
    EducationRepository educationRepository;
    @Autowired
    private ExperienceRepository experienceRepository;

    @Override
    public List<EducationModel> get() {
        return educationRepository.findAll();
    }

    @Override
    public void save(EducationModel educacion) {
        educationRepository.save(educacion);
    }

    @Override
    public void delete(Long id) {
    educationRepository.deleteById(id);
    }

    @Override
    public EducationModel find(Long id) {
        return educationRepository.findById(id).orElse(null);
    }
    public boolean existsById(Long id){
        return educationRepository.existsById(id);
    }
    public boolean existsByName(String instituto){
        return educationRepository.existsByInstitute(instituto);
    }

}
