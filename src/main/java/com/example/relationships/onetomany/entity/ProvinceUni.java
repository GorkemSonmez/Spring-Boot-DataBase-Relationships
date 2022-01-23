package com.example.relationships.onetomany.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//Unidirectional relationship
public class ProvinceUni {
    @Id
    private long pid;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "province_id",referencedColumnName = "pid")
    private List<DistrictUni> districts;
}
