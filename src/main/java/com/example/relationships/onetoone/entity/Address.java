package com.example.relationships.onetoone.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {
    @Id
    private long id;
    private String name;


    //Java tarafında uni directional olacaksa bu field olmayacak
    //Java tarafında bidirectional database tarafında unidirectional olacaksa mappedBy yazılacak ve join columb yazılmayacak
    //Java ve database tarafında bidirectional olacaksa mappedBy yazılmayacak join columb yazılacak

    //@OneToOne(cascade = CascadeType.ALL,mappedBy = "address")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    private User user;

    public Address(long id, String name) {
        this.id = id;
        this.name = name;
        this.user = new User();
    }
}
