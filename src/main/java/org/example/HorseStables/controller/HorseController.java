package org.example.HorseStables.controller;

import org.springframework.web.bind.annotation.*;
import org.example.HorseStables.entity.Horse;
import org.example.HorseStables.service.HorseService;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@RestController
public class HorseController {

    @Autowired
    private HorseService horseService;

    @PostMapping("/horses")
    public Horse saveHorse(@RequestBody Horse horse) {
        return horseService.saveHorse(horse);
    }

    @GetMapping("/horses")
    public List<Horse> fetchHorseList(){
        return horseService.fetchHorseList();
    }

    @GetMapping("/horses/{id}")
    public Optional<Horse> fetchHorse(@PathVariable("id") Integer horseID){
        return horseService.fetchHorse(horseID);
    }

    @PutMapping("/horses/{id}")
    public Horse updateHose(@RequestBody Horse horse, @PathVariable("id") Integer horseID){
        return horseService.updateHorse(horse, horseID);
    }

    @DeleteMapping("/horses/{id}")
    public String deleteHorseById(@PathVariable("id") Integer horseID){
        horseService.deleteHorseByID(horseID);
        return "Removed Successfully";
    }

}
