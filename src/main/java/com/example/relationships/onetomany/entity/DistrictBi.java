package com.example.relationships.onetomany.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//Bidirectional relationship
public class DistrictBi {

    @Id
    private long id;
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "province_id")
    private ProvinceBi province;

    public DistrictBi(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
