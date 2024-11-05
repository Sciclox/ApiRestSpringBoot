package com.botica.pharmasalud.services.impl;

import com.botica.pharmasalud.entities.Sucursal;
import com.botica.pharmasalud.repositories.SucursalRepository;
import com.botica.pharmasalud.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SucursalServiceImpl implements SucursalService{

    @Autowired
    SucursalRepository sucursalRepository;

    @Override
    public ArrayList<Sucursal> obtenerSucursales() {
        return (ArrayList<Sucursal>) sucursalRepository.findAll();
    }

    @Override
    public Sucursal guardarSucursal(Sucursal sucursal) {
        return sucursalRepository.save(sucursal);
    }

    @Override
    public boolean eliminarSucursal(Long id){
        try {
            sucursalRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }
}
