package com.yoprogramo.portafolio.models;


import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name="users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String user;

    @NonNull
    private String password;

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private PersonModel person;

    public UserModel() {
    }

    public UserModel(@NonNull String user, @NonNull String password, PersonModel person) {
        this.user = user;
        this.password = password;
        this.person = person;
    }
}
