package com.example.relationships.onetoone.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "userss")
public class User {
    @Id
    private long id;
    private String name;
    
    //Her koşulda bu classta bu şekilde kullanılacak
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;



}
