package com.HM.Project.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tache {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private Date startdate;
    private Date enddate;
    private String status;
    private  int ProjectID;

}
