package com.HM.Project.Repository;

import com.HM.Project.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProject extends JpaRepository<Project, Integer> {
}
