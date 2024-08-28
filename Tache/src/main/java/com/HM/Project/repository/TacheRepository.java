package com.HM.Project.repository;

import com.HM.Project.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TacheRepository extends JpaRepository<Tache, Integer> {
}
