package com.HM.Project.Controller;


import com.HM.Project.Services.ProjectService;
import com.HM.Project.model.FullProjectResponse;
import com.HM.Project.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return projectService.createProject(project);
    }
    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }
    @PutMapping
    public Project updateProject(@PathVariable int  id ,@RequestBody Project project) {
        return projectService.updateProject(id, project);

    }
    @DeleteMapping
    public void deleteProject(@PathVariable int id) {
        projectService.deleteProject(id);
    }

    @GetMapping("/projectWithTasks/{projectID}")
    public FullProjectResponse getAllProjects(
            @PathVariable int projectID
    ) {
        return projectService.findProjectwithTasks(projectID);
    }

}
