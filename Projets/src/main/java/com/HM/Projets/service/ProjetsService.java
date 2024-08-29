package com.HM.Projets.service;

import com.HM.Projets.model.FullProjetResponse;
import com.HM.Projets.model.Projets;

import java.util.List;

public interface ProjetsService {
    Projets ajouterProjet(Projets projet);
    Projets modifierProjet(Long id, Projets projet);
    List<Projets> allProjets();
    void supprimerProjet(Long id);
    FullProjetResponse projetWithTaches(Long id);
}
