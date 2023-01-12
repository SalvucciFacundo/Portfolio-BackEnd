package com.yoprogramo.portafolio.Interface;

import com.yoprogramo.portafolio.models.ProjectModel;

import java.util.List;

public interface InterfaceProjectService {
    public List<ProjectModel> get();
    public void save(ProjectModel project);
    public void delete(Long id);
    public  ProjectModel find(Long id);
}
