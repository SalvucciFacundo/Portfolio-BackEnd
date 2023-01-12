package com.yoprogramo.portafolio.Interface;

import com.yoprogramo.portafolio.models.EducationModel;
import com.yoprogramo.portafolio.models.ExperienceModel;

import java.util.List;

public interface InterfaceEducationService {

    public List<EducationModel> get();
    public void save(EducationModel educacion);
    public void delete(Long id);
    public  EducationModel find(Long id);
}
