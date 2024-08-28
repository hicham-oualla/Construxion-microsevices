package com.HM.Project.Controller;

import com.HM.Project.Service.TacheService;
import com.HM.Project.model.Tache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tache")
public class TacheController {
    @Autowired
    private TacheService tacheService;


    @PostMapping
    public Tache addTache(@RequestBody Tache tache) {
        return tacheService.createTache(    tache);

    }
     @GetMapping("/all")
    public List<Tache> getAllTaches() {
        return tacheService.getAllTache();
    }

    @GetMapping("/{id}")
    public List<Tache> getTachesByProjetId(@PathVariable int id) {
        return tacheService.tachesByProjetId(id);
    }

    @PutMapping
    public Tache updateTache(@PathVariable int id ,@RequestBody Tache tache) {

        return tacheService.updateTache(id, tache);
    }






    @DeleteMapping
    public void deleteTache(@PathVariable int id) {
        tacheService.deleteTache(id);
    }








}
