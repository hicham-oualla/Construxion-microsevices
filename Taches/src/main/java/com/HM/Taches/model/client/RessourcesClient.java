package com.HM.Taches.model.client;

import com.HM.Taches.model.Ressources;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "ressource-service", url = "${application.config.ressources-url}")
public interface RessourcesClient {
    @GetMapping("{id}")
    List<Ressources> getRessourcesByTache(@PathVariable Long id);
}
