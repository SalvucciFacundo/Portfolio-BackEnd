package com.yoprogramo.portafolio.services;

import com.yoprogramo.portafolio.models.NetworkModel;
import com.yoprogramo.portafolio.repositories.NetworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Optional;

@Service
@Transactional
public class NetworkService {

    @Autowired
    NetworkRepository networkRepository;

    public ArrayList<NetworkModel> getAllNetwork(){
        return (ArrayList<NetworkModel>)networkRepository.findAll();
    }

    public void saveNetwork(NetworkModel network){

        networkRepository.save(network);
    }

    public Optional<NetworkModel> getNetworkById(Long id) {

        return networkRepository.findById(id);
    }

    public NetworkModel updateNetwork(Long id, NetworkModel networkUpdated){
        NetworkModel networkModelsUpdate = networkRepository.findById(id).get();
        networkModelsUpdate.setName(networkUpdated.getName());
        networkModelsUpdate.setUrl(networkUpdated.getUrl());
        networkModelsUpdate.setLogo(networkUpdated.getLogo());
        networkModelsUpdate.setPerson(networkUpdated.getPerson());
        return networkRepository.save(networkModelsUpdate);
    }
    public boolean deleteNetwork(Long id) {
        try {
            networkRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
