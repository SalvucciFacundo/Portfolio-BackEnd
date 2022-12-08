package com.yoprogramo.portafolio.models;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@Table(name="skills")
public class SkillModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String value;

    @Column(length = 2048)
    private String imgUrl;

    @NonNull
    private String type;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPerson")
    private PersonModel person;

    public SkillModel() {
    }

    public SkillModel(@NonNull String name, @NonNull String value, String imgUrl, @NonNull String type) {
        this.name = name;
        this.value = value;
        this.imgUrl = imgUrl;
        this.type = type;
    }
}
