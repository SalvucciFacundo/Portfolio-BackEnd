package com.yoprogramo.portafolio.repositories;


import com.yoprogramo.portafolio.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
