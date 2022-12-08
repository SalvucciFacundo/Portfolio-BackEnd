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

    @NonNull
    private String title;
    @NonNull
    private String institute;

    private Date start;
    private Date end;

    @Column(length = 2048)
    private String logoUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPerson")
    private PersonModel person;

    public EducationModel() {
    }

    public EducationModel(@NonNull String title, @NonNull String institute, Date start, Date end, String logoUrl) {
        this.title = title;
        this.institute = institute;
        this.start = start;
        this.end = end;
        this.logoUrl = logoUrl;
    }
}
