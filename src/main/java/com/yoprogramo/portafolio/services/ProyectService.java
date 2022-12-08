package com.yoprogramo.portafolio.services;


import com.yoprogramo.portafolio.models.ProyectModel;
import com.yoprogramo.portafolio.repositories.ProyectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;

@Service
@Transactional
public class ProyectService {

    @Autowired
    ProyectRepository proyectRepository;

    public ArrayList<ProyectModel> getAllProyects(){

        return (ArrayList<ProyectModel>)proyectRepository.findAll();
    }

    public void saveProyect(ProyectModel proyect){
        proyectRepository.save(proyect);
    }

    public Optional<ProyectModel> getProyectById(Long id) {
        return proyectRepository.findById(id);
    }

    public ProyectModel updateProyect(Long id, ProyectModel proyectUpdated){
        ProyectModel proyectModelsUpdate = proyectRepository.findById(id).get();
        proyectModelsUpdate.setProyectUrl(proyectUpdated.getProyectUrl());
        proyectModelsUpdate.setDescription(proyectUpdated.getDescription());
        proyectModelsUpdate.setImgUrl(proyectUpdated.getImgUrl());
        proyectModelsUpdate.setPerson(proyectUpdated.getPerson());
        return proyectRepository.save(proyectModelsUpdate);
    }
    public boolean deleteProyect(Long id) {
        try {
            proyectRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }


}
