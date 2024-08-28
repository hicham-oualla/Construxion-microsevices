package com.HM.Project.Services;

import com.HM.Project.Repository.RepositoryProject;
import com.HM.Project.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private RepositoryProject repository;

    @Override
    public Project createProject(Project project) {
        return repository.save(project);
    }

    @Override
    public List<Project> getAllProjects() {
        return repository.findAll();
    }

    @Override
    public Project updateProject(int id, Project project) {
        if(repository.existsById(id)){
            project.setId(id);
            project.setName(project.getName());
            project.setDescription(project.getDescription());
            project.setStartDate(project.getStartDate());
            project.setEndDate(project.getEndDate());
            project.setPrice(project.getPrice());
            return repository.save(project);
        }
        return null;
    }



    @Override
    public void deleteProject(int id) {
         repository.deleteById(id);

    }
}
