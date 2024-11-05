package com.botica.pharmasalud.services;


import com.botica.pharmasalud.entities.Sucursal;

import java.util.ArrayList;

public interface SucursalService {

    ArrayList<Sucursal> obtenerSucursales();
    
    Sucursal guardarSucursal(Sucursal sucursal);

    boolean eliminarSucursal(Long id);
}
