package com.yoprogramo.portafolio.Dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
@Getter @Setter
public class DtoProject {
    private String title;
    @Column(length = 2500)
    private String description;

    @Column(length = 2048)
    private String imgUrl;

    @Column(length = 2048)
    private String url;

    public DtoProject() {
    }

    public DtoProject(String title, String description, String imgUrl,String url) {
        this.description = description;
        this.imgUrl = imgUrl;
        this.title = title;
        this.url = url;
    }
}
