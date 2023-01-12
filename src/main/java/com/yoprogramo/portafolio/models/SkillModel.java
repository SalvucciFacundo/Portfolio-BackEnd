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


    private String name;


    private String value;

    @Column(length = 2048)
    private String imgUrl;

    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPerson")
    private PersonModel person;

    public SkillModel() {
    }

    public SkillModel(String name, String value, String imgUrl, String type) {
        this.name = name;
        this.value = value;
        this.imgUrl = imgUrl;
        this.type= type;
    }
}
