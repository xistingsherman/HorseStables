package org.example.HorseStables.repository;

import org.example.HorseStables.entity.Horse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorseRepository extends CrudRepository<Horse, Integer> {

}
