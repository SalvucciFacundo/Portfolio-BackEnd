package com.yoprogramo.portafolio.models;


import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name="user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String password;


    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private PersonModel person;

    public UserModel() {
    }

    public UserModel(String nombre,String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }
}
