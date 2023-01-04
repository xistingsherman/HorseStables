package org.example.HorseStables.controller;

import org.example.HorseStables.entity.Owner;
import org.example.HorseStables.repository.OwnerRepository;
import org.example.HorseStables.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="demo")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @PostMapping("/owners")
    public Owner saveOwner(Owner owner){
        return ownerService.saveOwner(owner);
    }

    @GetMapping("/owners")
    public List<Owner> fetchHorseList(){return ownerService.fetchOwnerList();}

    @PutMapping("/owners/{id}")
    public Owner updateOwner(@RequestBody Owner owner, @PathVariable("id") Integer ownerID){
        return ownerService.updateOwner(owner, ownerID);
    }

    @DeleteMapping("/owners/{id}")
    public String deleteOwnerById(@PathVariable("id") Integer ownerID){
        ownerService.deleteOwnerByID(ownerID);
        return "Removed Successfully";
    }
}
