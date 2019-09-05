package be.beauce.sfgpetclinic.services;

import java.util.Set;

import be.beauce.sfgpetclinic.model.Pet;

public interface PetService {
    Pet findById(Long id);

    void save(Pet pet);

    Set<Pet> findAll();
}
