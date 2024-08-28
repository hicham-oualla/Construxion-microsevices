package com.HM.Project.Services;

import com.HM.Project.model.Project;

import java.util.List;

public interface ProjectService {

    Project createProject(Project project);
    List<Project> getAllProjects();
    Project updateProject(int id, Project project);
    void deleteProject(int id);
}
