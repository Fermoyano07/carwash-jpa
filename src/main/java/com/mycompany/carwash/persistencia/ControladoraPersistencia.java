
package com.mycompany.carwash.persistencia;

import com.mycompany.carwash.logica.Duenio;
import com.mycompany.carwash.logica.Vehiculo;
import com.mycompany.carwash.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    VehiculoJpaController vehiculoJpa = new VehiculoJpaController();

    public void guardar(Vehiculo vehiculo, Duenio duenio) {
        
        //Crear dueño en la BD
        duenioJpa.create(duenio);
        
        //Crear vehiculo en la BD
        vehiculoJpa.create(vehiculo);
    }

    public List<Vehiculo> traerVehiculo() {
        
        return vehiculoJpa.findVehiculoEntities();
        
    }

    public void borrarVehiculo(int id_vehiculo) {
        try {
            vehiculoJpa.destroy(id_vehiculo);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Vehiculo traerVehiculo(int id_vehiculo) {
        return vehiculoJpa.findVehiculo(id_vehiculo);
    }

    public void editarVehiculo(Vehiculo vehiculo) {
        try {
            vehiculoJpa.edit(vehiculo);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id_duenio) {
        return duenioJpa.findDuenio(id_duenio);
    }

    public void editarDuenio(Duenio dueno) {
        try {
            duenioJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
