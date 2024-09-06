package com.HM.Taches.service;

import com.HM.Taches.model.FullTachesResponse;
import com.HM.Taches.model.Taches;

import java.util.List;

public interface TachesService {
    Taches ajouterTache(Taches taches);
    Taches editTache(Long id, Taches taches);
    List<Taches> getAll();
    void deleteTaches(Long id);
    Taches changerStatut(Long id, Taches taches);
    List<Taches> getAllTachesByProjet(Long id);
    FullTachesResponse tachWithRessources(Long id);

}
