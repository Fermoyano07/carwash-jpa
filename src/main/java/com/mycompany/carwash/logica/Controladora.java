
package com.mycompany.carwash.logica;

import com.mycompany.carwash.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String marcaVehiculo, String modeloVehiculo, String colorVehiculo, String observaciones,
            String tipoVehiculo, String nombreDuenio, String telDuenio) {
        
        //Creamos el dueño y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre_Duenio(nombreDuenio);
        duenio.setTelDuenio(telDuenio);
        
        //Creamos el vehículo y asignamos sus valores
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMarca(marcaVehiculo);
        vehiculo.setModelo(modeloVehiculo);
        vehiculo.setColor(colorVehiculo);
        vehiculo.setTipo(tipoVehiculo);
        vehiculo.setObservaciones(observaciones);
        vehiculo.setUnDuenio(duenio);
        
        //Llamar a la Persistencia
        controlPersis.guardar(vehiculo, duenio);
    }

    public List<Vehiculo> traerVehiculos() {
        
        return controlPersis.traerVehiculo();
        
    }

    public void borrarVehiculo(int id_vehiculo) {
        controlPersis.borrarVehiculo(id_vehiculo);
    }

    public Vehiculo traerVehiculo(int id_vehiculo) {
        return controlPersis.traerVehiculo(id_vehiculo);
    }

    public void editarVehiculo(Vehiculo vehiculo, String marcaVehiculo, String modeloVehiculo, 
            String colorVehiculo, String observaciones, String tipoVehiculo, String nombreDuenio, 
            String telDuenio) {
        
        vehiculo.setMarca(marcaVehiculo);
        vehiculo.setModelo(modeloVehiculo);
        vehiculo.setColor(colorVehiculo);
        vehiculo.setObservaciones(observaciones);
        vehiculo.setTipo(tipoVehiculo);
        
        //Modifico vehiculo
        controlPersis.editarVehiculo(vehiculo);
        
        //Seteo nuevos valores del dueño
        Duenio dueno = this.buscarDuenio(vehiculo.getUnDuenio().getId_duenio());
        dueno.setNombre_Duenio(nombreDuenio);
        dueno.setTelDuenio(telDuenio);
        
        //Llamar a editar dueño
        this.editarDuenio(dueno);
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }

    private void editarDuenio(Duenio dueno) {
        controlPersis.editarDuenio(dueno);
    }

}
