package com.HM.Project.Service;

import com.HM.Project.model.Tache;
import com.HM.Project.repository.TacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TacheServiceImpl  implements TacheService{

    @Autowired
    private TacheRepository tacheRepository;
    @Override
    public Tache createTache(Tache tache) {
        return tacheRepository.save(tache);
    }

    @Override
    public List<Tache> getAllTache() {
        return tacheRepository.findAll();
    }

    @Override
    public Tache updateTache(int id, Tache tache) {

        if(tacheRepository.existsById(id)){
            tache.setId(id);
            tache.setName(tache.getName());
            tache.setDescription(tache.getDescription());
            tache.setStartdate(tache.getStartdate());
            tache.setEnddate(tache.getEnddate());
            tache.setStatus(tache.getStatus());
            return tacheRepository.save(tache);
        }
        return null;
    }

    @Override
    public void deleteTache(int id) {
        tacheRepository.deleteById(id);

    }
}
