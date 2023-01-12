package com.yoprogramo.portafolio.Dto;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;

@Getter@ Setter
public class DtoEducation {
    private String title;
    private String institute;
    private String start;
    private String end;

    @Column(length = 2048)
    private String logoUrl;

    public DtoEducation() {
    }

    public DtoEducation(String title, String institute, String start, String end, String logoUrl) {
        this.title = title;
        this.institute = institute;
        this.start = start;
        this.end = end;
        this.logoUrl = logoUrl;
    }
}
