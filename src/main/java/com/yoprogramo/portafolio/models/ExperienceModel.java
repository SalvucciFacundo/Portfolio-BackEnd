package com.yoprogramo.portafolio.models;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name="experiences")
public class ExperienceModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String start;

    @NonNull
    private String end;

    @NonNull
    @Column(length = 2500)
    private String description;

    @NonNull
    private String companyName;

    @Column(length = 2048)
    private String imgUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPerson")
    private PersonModel person;

    public ExperienceModel() {
    }

    public ExperienceModel(@NonNull String start, @NonNull String end, @NonNull String description, @NonNull String companyName, String imgUrl) {
        this.start = start;
        this.end = end;
        this.description = description;
        this.companyName = companyName;
        this.imgUrl = imgUrl;
    }
}
