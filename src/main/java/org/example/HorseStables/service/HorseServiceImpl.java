package org.example.HorseStables.service;

import org.example.HorseStables.entity.Horse;
import org.example.HorseStables.repository.HorseRepository;
import org.example.HorseStables.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class HorseServiceImpl implements HorseService{


    @Autowired
    private HorseRepository horseRepository;

    @Autowired
    private OwnerRepository ownerRepository;
    @Override
    public Horse saveHorse(Horse horse) {
        return horseRepository.save(horse);
    }
    @Override
    public List<Horse> fetchHorseList() {
        return (List<Horse>) horseRepository.findAll();
    }

    @Override
    public Optional<Horse> fetchHorse(int horseID) {
        return horseRepository.findById(horseID);
    }

    @Override
    public Horse updateHorse(Horse horse, int horseID) {
        Horse horseDB = horseRepository.findById(horseID).get();

        if(Objects.nonNull(horse.getName()) && !"".equalsIgnoreCase(horse.getName())){
            horseDB.setName(horse.getName());
        }

        //Will not update the database is horse's age is older than 30
        if(horse.getAge() < 30 && horse.getAge() > 0){
            horseDB.setAge(horse.getAge());
        }

        if(Objects.nonNull(ownerRepository.findById(horse.getOwner()).get())){
            horseDB.setOwner(horse.getOwner());
        }

        return horseRepository.save(horseDB);
    }

    @Override
    public void deleteHorseByID(int horseID) {
        horseRepository.deleteById(horseID);
    }
}
