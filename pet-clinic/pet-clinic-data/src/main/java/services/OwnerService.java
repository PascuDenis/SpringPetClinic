package services;

import model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner fintByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
