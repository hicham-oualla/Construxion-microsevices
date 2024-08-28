package com.HM.Project.Service;

import com.HM.Project.model.Tache;

import java.util.List;

public interface TacheService {

    Tache createTache(Tache tache);
    List<Tache> getAllTache();
    Tache updateTache(int id, Tache tache);
    void deleteTache(int id);
    List<Tache> tachesByProjetId(int projetId);
}

