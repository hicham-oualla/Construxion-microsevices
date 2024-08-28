package com.HM.Project.Controller;

import com.HM.Project.Service.TacheService;
import com.HM.Project.model.Tache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Tache")
public class TacheController {
    @Autowired
    private TacheService tacheService;


    @PostMapping
    public Tache addTache(@RequestBody Tache tache) {
        return tacheService.createTache(    tache);

    }
     @GetMapping
    public List<Tache> getAllTaches() {
        return tacheService.getAllTache();
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
