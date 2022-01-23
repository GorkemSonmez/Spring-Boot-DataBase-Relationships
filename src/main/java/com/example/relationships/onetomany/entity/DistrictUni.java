package com.example.relationships.onetomany.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//Unidirectional relationship
public class DistrictUni {

    @Id
    private long id;
    private String name;

}
