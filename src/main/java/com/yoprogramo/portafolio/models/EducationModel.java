package com.yoprogramo.portafolio.models;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter @Setter
@Entity
@Table(name="educations")
public class EducationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String institute;
    private String start;
    private String end;

    @Column(length = 2048)
    private String logoUrl;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPersona")
    private PersonModel person;

    public EducationModel() {
    }

    public EducationModel( String title, String institute, String start, String end, String logoUrl) {
        this.title = title;
        this.institute = institute;
        this.start = start;
        this.end = end;
        this.logoUrl = logoUrl;
    }
}
