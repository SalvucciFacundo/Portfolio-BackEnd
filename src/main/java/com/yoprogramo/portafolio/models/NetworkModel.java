package com.yoprogramo.portafolio.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name="networks")
public class NetworkModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(length = 2048)
    private String url;

    private String logo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPerson")
    private PersonModel person;


    public NetworkModel() {
    }

    public NetworkModel(String name, String url, String logo) {
        this.name = name;
        this.url = url;
        this.logo = logo;
    }
}
