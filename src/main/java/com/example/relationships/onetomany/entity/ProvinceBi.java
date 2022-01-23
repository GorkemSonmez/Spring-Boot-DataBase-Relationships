package com.example.relationships.onetomany.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//Bidirectional relationship
public class ProvinceBi {
    @Id
    private long pid;
    private String name;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "province")
    private List<DistrictBi> districts;

    public ProvinceBi(long pid, String name) {
        this.pid = pid;
        this.name = name;
        this.districts=new ArrayList<>();
    }
}
