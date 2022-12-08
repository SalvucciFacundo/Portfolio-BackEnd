package com.yoprogramo.portafolio.services;



import com.yoprogramo.portafolio.models.PersonModel;
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

    public void saveUser(UserModel user){
        userRepository.save(user);
    }
    //falta el login y el logout

    public UserModel updateUser(Long id, UserModel userUpdated) {
        UserModel userModelsUpdate = userRepository.findById(id).get();
        userModelsUpdate.setUser(userUpdated.getUser());
        userModelsUpdate.setPassword(userUpdated.getPassword());
        return userRepository.save(userModelsUpdate);
    }

    public boolean deleteUser(Long id) {
        try {
            userRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
