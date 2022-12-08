package com.yoprogramo.portafolio.controllers;

import com.yoprogramo.portafolio.services.EducationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/education")
public class EducationController {

    EducationService educationService;


}
