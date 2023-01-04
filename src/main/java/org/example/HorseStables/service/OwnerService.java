package org.example.HorseStables.service;

import org.example.HorseStables.entity.Owner;

import java.util.List;

public interface OwnerService {

    Owner saveOwner(Owner owner);
    List<Owner> fetchOwnerList();
    Owner updateOwner(Owner owner, int ownerID);
    void deleteOwnerByID(int ownerID);
}
