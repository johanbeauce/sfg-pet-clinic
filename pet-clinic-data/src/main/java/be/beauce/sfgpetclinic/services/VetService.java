package be.beauce.sfgpetclinic.services;

import java.util.Set;

import be.beauce.sfgpetclinic.model.Vet;

public interface VetService {
    Vet findById(Long id);

    void save(Vet vet);

    Set<Vet> findAll();
}
