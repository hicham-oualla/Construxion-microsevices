package com.HM.Ressources.repository;

import com.HM.Ressources.model.Ressources;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RessourcesRepository extends JpaRepository<Ressources, Long> {
    List<Ressources> getRessourcesByTacheId(Long id);
}
