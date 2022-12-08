package com.yoprogramo.portafolio.repositories;


import com.yoprogramo.portafolio.models.ProyectModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectRepository extends JpaRepository<ProyectModel, Long> {
}
