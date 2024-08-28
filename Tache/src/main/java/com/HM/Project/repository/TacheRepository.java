package com.HM.Project.repository;

import com.HM.Project.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TacheRepository extends JpaRepository<Tache, Integer> {
    List<Tache> findByProjectID(int id);
}
