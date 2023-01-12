package com.yoprogramo.portafolio.services;

import com.yoprogramo.portafolio.models.UserModel;
import com.yoprogramo.portafolio.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;



@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void save(UserModel user) {
        userRepository.save(user);
    }

    public UserModel find(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public boolean existsById(Long id){
        return userRepository.existsById(id);
    }

    public boolean existsByEmail(String email){
        return userRepository.existsByEmail(email);
    }

}
