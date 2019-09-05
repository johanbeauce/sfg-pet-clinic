package be.beauce.sfgpetclinic.services;

import java.util.Set;

import be.beauce.sfgpetclinic.model.Owner;
import be.beauce.sfgpetclinic.model.Vet;

public interface OwnerService {
    Owner findById(Long id);

    void save(Owner pet);

    Set<Owner> findAll();
}
