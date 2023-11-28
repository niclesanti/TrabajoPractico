package controllers;

import dao.*;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import messages.Util;
import models.entities.AnioFabricacion;
import models.entities.EstadoCivil;
import models.entities.Localidad;
import models.entities.Marca;
import models.entities.Modelo;
import models.entities.Provincia;
import models.entities.TipoCobertura;
import models.entities.Vehiculo;

public class GestorPoliza {
    
    EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("PersistenciaTP");
    EntityManager manager = managerFactory.createEntityManager();
    
    PaisDAOImpl paisImpl;
    ProvinciaDAOImpl provinciaImpl;
    LocalidadDAOImpl localidadImpl;
    MarcaDAOImpl marcaImpl;
    ModeloDAOImpl modeloImpl;
    AnioFabricacionDAOImpl anioFabricacionImpl;
    EstadoCivilDAOImpl estadoCivilImpl;
    TipoCoberturaDAOImpl tipoCoberturaImpl;
    
    public List<Provincia> mostrarProvincia () {
        try {
            provinciaImpl = new ProvinciaDAOImpl(manager);
            return provinciaImpl.buscarAll();
        } catch (Exception e) {
            Util.mensajeError("Error (Gestor)", "Error: " + e.getMessage());
            return Collections.emptyList();
        }
    }
    public List<Localidad> mostrarLocalidad (String provincia) {
        try {
            provinciaImpl = new ProvinciaDAOImpl(manager);
            localidadImpl = new LocalidadDAOImpl(manager);
            return localidadImpl.buscarByProvincia(provinciaImpl.buscarByNombre(provincia).get(0));
        } catch (Exception e) {
            Util.mensajeError("Error (Gestor)", "Error: " + e.getMessage());
            return Collections.emptyList();
        }
    }
    
    public List<Marca> mostrarMarca () {
        try {
            marcaImpl = new MarcaDAOImpl(manager);
            return marcaImpl.buscarAll();
        } catch (Exception e) {
            Util.mensajeError("Error (Gestor3)", "Error: " + e.getMessage());
            return Collections.emptyList();
        }
    }
    
    public List<Modelo> mostrarModelo (String marca) {
        try {
            marcaImpl = new MarcaDAOImpl(manager);
            modeloImpl = new ModeloDAOImpl(manager);
            return modeloImpl.buscarByMarca(marcaImpl.buscarByNombre(marca).get(0));
        } catch (Exception e) {
            Util.mensajeError("Error (Gestor1)", e.getMessage());
            System.out.println("Error (Gestor)" + e.getMessage());
            return Collections.emptyList();
        }
    }
    
    public List<AnioFabricacion> mostrarAnioFabricacion (String marca, String modelo) {
        try {
            marcaImpl = new MarcaDAOImpl(manager);
            modeloImpl = new ModeloDAOImpl(manager);
            anioFabricacionImpl = new AnioFabricacionDAOImpl(manager);
            List<Marca> marcas = marcaImpl.buscarByNombre(marca);
            List<Modelo> modelos = modeloImpl.buscarByMarca(marcas.get(0));
            List <AnioFabricacion> anios = anioFabricacionImpl.buscarByModelo(modelos.get(0));
            return anios;
        } catch (Exception e) {
            Util.mensajeError("Error2", e.getMessage());
            return Collections.emptyList();
        }
    }
    
    public List<EstadoCivil> mostrarEstadoCivil(){
        try {
            estadoCivilImpl = new EstadoCivilDAOImpl(manager);
            return estadoCivilImpl.buscarAll();
        } catch (Exception e) {
            Util.mensajeError("Error", e.getMessage());
            return Collections.emptyList();
        }
    }
    
    public List<TipoCobertura> mostrarTipoCobertura(){
        try {
            tipoCoberturaImpl = new TipoCoberturaDAOImpl(manager);
            return tipoCoberturaImpl.buscarAll();
        } catch (Exception e) {
            Util.mensajeError("Error", e.getMessage());
            return Collections.emptyList();
        }
    }
    
    public List<Vehiculo> mostrarChasis(String chasis){
        try{
            VehiculoDAOImpl vehiculoImpl = new VehiculoDAOImpl(manager);
            return vehiculoImpl.buscarByChasis(chasis);
        } catch (Exception e) {
            Util.mensajeError("Error", e.getMessage());
            return Collections.emptyList();
        }
    }
    
    public List<Vehiculo> mostrarMotor(String motor){
        try{
            VehiculoDAOImpl vehiculoImpl = new VehiculoDAOImpl(manager);
            return vehiculoImpl.buscarByMotor(motor);
        } catch (Exception e) {
            Util.mensajeError("Error", e.getMessage());
            return Collections.emptyList();
        }
    }
    
    public List<Vehiculo> mostrarPatente(String patente){
        try{
            VehiculoDAOImpl vehiculoImpl = new VehiculoDAOImpl(manager);
            return vehiculoImpl.buscarByPatente(patente);
        } catch (Exception e) {
            Util.mensajeError("Error", e.getMessage());
            return Collections.emptyList();
        }
    }
}
