package com.yoprogramo.portafolio.services;

import com.yoprogramo.portafolio.Interface.InterfaceExperienciaService;
import com.yoprogramo.portafolio.models.ExperienceModel;
import com.yoprogramo.portafolio.repositories.ExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ExperienceService implements InterfaceExperienciaService {

    @Autowired
    ExperienceRepository experienciaRepositorio;


    @Override
    public List<ExperienceModel> get() {
        return experienciaRepositorio.findAll();
    }

    @Override
    public void save(ExperienceModel experiencia) {
        experienciaRepositorio.save(experiencia);
    }

    @Override
    public void delete(Long id) {
        experienciaRepositorio.deleteById(id);
    }

    @Override
    public ExperienceModel find(Long id) {
        return experienciaRepositorio.findById(id).orElse(null);
    }

    public ExperienceModel getByName(String name){
        return experienciaRepositorio.findByCompanyName(name).orElse(null);
    }
    public boolean existsById(Long id){
        return experienciaRepositorio.existsById(id);
    }
    public boolean existsByName(String name){
        return experienciaRepositorio.existsByCompanyName(name);
    }


}


