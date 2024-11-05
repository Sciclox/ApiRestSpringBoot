package com.botica.pharmasalud.controllers;


import com.botica.pharmasalud.entities.Sucursal;
import com.botica.pharmasalud.services.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/sucursal")
public class SucursalController {
    @Autowired
    SucursalService sucursalService;

    @GetMapping
    public ArrayList<Sucursal> obtenerSucursales(){
        return sucursalService.obtenerSucursales();
    }

    @PostMapping()
    public Sucursal guardarSucursal(@RequestBody Sucursal sucursal){
        return this.sucursalService.guardarSucursal(sucursal);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.sucursalService.eliminarSucursal(id);
        if(ok){
            return "Se elimino correctamente la sucursal";
        }
        else {
            return "No se pudo eliminar la sucursal";
        }
    }
}
