package com.yoprogramo.portafolio.Dto;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;


@Getter @Setter
public class DtoSkill {

    private String name;
    private String value;
    @Column(length = 2048)
    private String imgUrl;

    private String type;

    public DtoSkill() {
    }

    public DtoSkill(String name, String value, String imgUrl, String type) {
        this.name = name;
        this.value = value;
        this.imgUrl = imgUrl;
        this.type = type;
    }
}
