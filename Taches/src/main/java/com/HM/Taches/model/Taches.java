package com.HM.Taches.model;

import com.HM.Taches.model.enums.Statut;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Taches {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Date dateDebut;
    private Date dateFin;

    @Enumerated(EnumType.STRING)
    private Statut statut;

    private Long projetId;
}
