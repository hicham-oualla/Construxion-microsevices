package com.HM.Taches.repository;

import com.HM.Taches.model.Taches;
import com.HM.Taches.model.enums.Statut;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TachesRepository extends JpaRepository<Taches, Long> {
    List<Taches> findAllByProjetId(Long id);

}
