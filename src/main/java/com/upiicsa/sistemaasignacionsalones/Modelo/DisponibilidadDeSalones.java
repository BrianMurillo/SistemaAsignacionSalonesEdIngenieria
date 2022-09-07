package com.upiicsa.sistemaasignacionsalones.Modelo;
import java.util.ArrayList;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class DisponibilidadDeSalones {
    ArrayList<String[]> listabasicasIngenieria = new ArrayList<>();
    ArrayList<String[]> listaComputacion = new ArrayList<>();
    ArrayList<String[]> listaInformatica = new ArrayList<>();
    ArrayList<String[]> listaIngIndustrial = new ArrayList<>();
    ArrayList<String[]> listaOperaciones = new ArrayList<>();
    ArrayList<String[]> listaProduccion = new ArrayList<>();
    ArrayList<String[]> listaTransporte = new ArrayList<>();

    public DisponibilidadDeSalones() {
    }

    public String[] disponibilidad(String titulo, int tamano, String[] horarioVerificacion, String[] horario) {
        String disponibilidad[] = new String[tamano + 1];
        int contador;
        contador = 1;
        disponibilidad[0] = titulo;
        for (int i = 0; i < horarioVerificacion.length; i++) {
            if ("0".equals(horarioVerificacion[i])) {
                disponibilidad[contador] = horario[i];
                contador++;
            }
        }
        return disponibilidad;
    }

    public int sizeArray(String[] horariosVerificacion) {
        int contador = 0;
        for (String horariosVerificacion1 : horariosVerificacion) {
            if ("0".equals(horariosVerificacion1)) {
                contador++;
            }
        }
        return contador;
    }
    //Lista disponibilidad basicas de la ingeneria
    public ArrayList<String[]> disponibilidadBasicasIngenieria(GeneracionSalon generacionSalon){
        listabasicasIngenieria.add(generacionSalon.disponibilidadBasicasIngenieriaD1());
        listabasicasIngenieria.add(generacionSalon.disponibilidadBasicasIngenieriaD2());
        listabasicasIngenieria.add(generacionSalon.disponibilidadBasicasIngenieria216());
        listabasicasIngenieria.add(generacionSalon.disponibilidadBasicasIngenieria217());
        listabasicasIngenieria.add(generacionSalon.disponibilidadBasicasIngenieria218());
        return listabasicasIngenieria;
    }
    //Lista disponibilidad computacion
    public ArrayList<String[]> disponibilidadComputacion(GeneracionSalon generacionSalon){
        listaComputacion.add(generacionSalon.disponibilidadComputacionOriente());
        listaComputacion.add(generacionSalon.disponibilidadComputacionRedes());
        listaComputacion.add(generacionSalon.disponibilidadComputacionProgramacion());
        listaComputacion.add(generacionSalon.disponibilidadComputacion201());
        listaComputacion.add(generacionSalon.disponibilidadComputacion202());
        listaComputacion.add(generacionSalon.disponibilidadComputacion203());
        listaComputacion.add(generacionSalon.disponibilidadComputacion307());
        listaComputacion.add(generacionSalon.disponibilidadComputacion308());
        listaComputacion.add(generacionSalon.disponibilidadComputacion309());
        listaComputacion.add(generacionSalon.disponibilidadComputacion310());
        return listaComputacion;
    }
    //Lista disponibilidad informatica
    public ArrayList<String[]> disponibilidadInformatica(GeneracionSalon generacionSalon){
        listaInformatica.add(generacionSalon.disponibilidadInformaticaPoniente());
        listaInformatica.add(generacionSalon.disponibilidadInformatica104());
        listaInformatica.add(generacionSalon.disponibilidadInformatica105());
        listaInformatica.add(generacionSalon.disponibilidadInformatica106());
        listaInformatica.add(generacionSalon.disponibilidadInformatica113());
        listaInformatica.add(generacionSalon.disponibilidadInformatica114());
        listaInformatica.add(generacionSalon.disponibilidadInformatica114A());
        listaInformatica.add(generacionSalon.disponibilidadInformatica115());
        listaInformatica.add(generacionSalon.disponibilidadInformatica215());
        return listaInformatica;
    }
    //Lista disponibilidad ing.industrial
    public ArrayList<String[]> disponibilidadIngIndustrial(GeneracionSalon generacionSalon){
        listaIngIndustrial.add(generacionSalon.disponibilidadIngIdustrial101());
        listaIngIndustrial.add(generacionSalon.disponibilidadIngIdustrial102());
        listaIngIndustrial.add(generacionSalon.disponibilidadIngIdustrial103());
        listaIngIndustrial.add(generacionSalon.disponibilidadIngIdustrial115A());
        listaIngIndustrial.add(generacionSalon.disponibilidadIngIdustrial116());
        listaIngIndustrial.add(generacionSalon.disponibilidadIngIdustrial117());
        listaIngIndustrial.add(generacionSalon.disponibilidadIngIdustrial118());
        return listaIngIndustrial;
    }
    //Lista disponibilidad investigacion de operaciones
    public ArrayList<String[]> disponibilidadInvOperaciones(GeneracionSalon generacionSalon){
        listaOperaciones.add(generacionSalon.disponibilidadInvOperaciones301());
        listaOperaciones.add(generacionSalon.disponibilidadInvOperaciones302());
        listaOperaciones.add(generacionSalon.disponibilidadInvOperaciones303());
        listaOperaciones.add(generacionSalon.disponibilidadInvOperaciones304());
        listaOperaciones.add(generacionSalon.disponibilidadInvOperaciones305());
        listaOperaciones.add(generacionSalon.disponibilidadInvOperaciones306());
        listaOperaciones.add(generacionSalon.disponibilidadInvOperaciones204());
        listaOperaciones.add(generacionSalon.disponibilidadInvOperaciones205());        
        return listaOperaciones;
    }
    //Lista disponibilidad produccion
    public ArrayList<String[]> disponibilidadProduccion(GeneracionSalon generacionSalon){
        listaProduccion.add(generacionSalon.disponibilidadProduccion1());
        listaProduccion.add(generacionSalon.disponibilidadProduccion2());
        listaProduccion.add(generacionSalon.disponibilidadProduccion3());
        listaProduccion.add(generacionSalon.disponibilidadProduccion4());
        listaProduccion.add(generacionSalon.disponibilidadProduccion5());
        listaProduccion.add(generacionSalon.disponibilidadProduccion6());
        listaProduccion.add(generacionSalon.disponibilidadProduccion7());
        return listaProduccion;
    }
    //Lista disponibilidad sistemas de transporte
    public ArrayList<String[]> disponibilidadTransporte(GeneracionSalon generacionSalon){
        listaTransporte.add(generacionSalon.disponibilidadSistemasTransporte());
        listaTransporte.add(generacionSalon.disponibilidadSistemasTransporte206());
        listaTransporte.add(generacionSalon.disponibilidadSistemasTransporte211());
        listaTransporte.add(generacionSalon.disponibilidadSistemasTransporte212());
        listaTransporte.add(generacionSalon.disponibilidadSistemasTransporte213());
        listaTransporte.add(generacionSalon.disponibilidadSistemasTransporte214());
        return listaTransporte;
    }
}