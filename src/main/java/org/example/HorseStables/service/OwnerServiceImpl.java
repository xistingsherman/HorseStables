package org.example.HorseStables.service;

import org.example.HorseStables.entity.Owner;
import org.example.HorseStables.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class OwnerServiceImpl implements OwnerService{

    @Autowired
    private OwnerRepository ownerRepository;

    @Override
    public Owner saveOwner(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public List<Owner> fetchOwnerList() {
        return (List<Owner>) ownerRepository.findAll();
    }

    @Override
    public Owner updateOwner(Owner owner, int ownerID) {
        Owner ownerDB = ownerRepository.findById(ownerID).get();

        if(Objects.nonNull(owner.getOwnerName()) && !"".equalsIgnoreCase(owner.getOwnerName())){
            ownerDB.setOwnerName(owner.getOwnerName());
        }

        if(Objects.nonNull(owner.getEmail()) && !"".equalsIgnoreCase(owner.getEmail())){
            ownerDB.setEmail(owner.getEmail());
        }

        if(Objects.nonNull(owner.isCurrentlyActive())){
            ownerDB.setCurrentlyActive(owner.isCurrentlyActive());
        }

        //set valid dates

        return ownerRepository.save(ownerDB);
    }

    @Override
    public void deleteOwnerByID(int ownerID) {

    }
}
