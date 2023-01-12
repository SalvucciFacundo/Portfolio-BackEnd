package com.yoprogramo.portafolio.services;


import com.yoprogramo.portafolio.Interface.InterfaceProjectService;
import com.yoprogramo.portafolio.models.ProjectModel;
import com.yoprogramo.portafolio.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;


@Service
@Transactional
public class ProjectService implements InterfaceProjectService {

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public List<ProjectModel> get() {
        return projectRepository.findAll();
    }

    @Override
    public void save(ProjectModel project) {
        projectRepository.save(project);
    }

    @Override
    public void delete(Long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public ProjectModel find(Long id) {
        return projectRepository.findById(id).orElse(null);
    }

    public boolean existsById(Long id){
        return projectRepository.existsById(id);
    }
    public boolean existsByTitle(String title){
        return projectRepository.existsByTitle(title);
    }

    /*public ArrayList<ProjectModel> getAllProyects(){

        return (ArrayList<ProjectModel>)proyectRepository.findAll();
    }

    public String saveProyect(ProjectModel proyect){
        try {
            proyectRepository.save(proyect);
            return "Registro creado correctamente";
        }catch (Exception e){
            return "Error"+e;
        }

    }

    public Optional<ProjectModel> getProyectById(Long id) {
        return proyectRepository.findById(id);
    }

    public ProjectModel updateProyect(Long id, ProjectModel proyectUpdated){
        ProjectModel proyectModelsUpdate = proyectRepository.findById(id).get();
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
*/

}
