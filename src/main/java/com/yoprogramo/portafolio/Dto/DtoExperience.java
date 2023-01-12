package com.yoprogramo.portafolio.Dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
@Getter @Setter
public class DtoExperience {
    private String start;

    private String end;

    @Column(length = 2500)
    private String description;

    private String companyName;

    @Column(length = 2048)
    private String imgUrl;


    public DtoExperience() {
    }

    public DtoExperience(String start, String end, String description, String companyName, String imgUrl) {
        this.start = start;
        this.end = end;
        this.description = description;
        this.companyName = companyName;
        this.imgUrl = imgUrl;
    }
}
