package com.yoprogramo.portafolio.models;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name="proyects")
public class ProyectModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    @Column(length = 2500)
    private String description;

    @Column(length = 2048)
    private String imgUrl;

    @Column(length = 2048)
    private String proyectUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPerson")
    private PersonModel person;


    public ProyectModel() {
    }

    public ProyectModel(@NonNull String description, String imgUrl, String proyectUrl) {
        this.description = description;
        this.imgUrl = imgUrl;
        this.proyectUrl = proyectUrl;
    }
}
