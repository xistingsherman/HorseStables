package org.example.HorseStables.service;

import org.example.HorseStables.entity.Horse;

import java.util.List;
import java.util.Optional;

public interface HorseService {

    Horse saveHorse(Horse horse);
    List<Horse> fetchHorseList();
    Optional<Horse> fetchHorse(int horseID);
    Horse updateHorse(Horse horse, int horseID);
    void deleteHorseByID(int horseID);
}
