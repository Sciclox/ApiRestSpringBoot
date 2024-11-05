package com.botica.pharmasalud.repositories;

import com.botica.pharmasalud.entities.Sucursal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository //estereotipos
public interface SucursalRepository extends CrudRepository<Sucursal, Long> {
}
