package com.yoprogramo.portafolio.repositories;


import com.yoprogramo.portafolio.models.ProjectModel;
import com.yoprogramo.portafolio.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
    Optional<UserModel> findOneByEmail(String email);
    boolean existsByEmail(String email);
}
