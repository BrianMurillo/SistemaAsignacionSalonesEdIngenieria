package com.upiicsa.sistemaasignacionsalones.Modelo;
import com.upiicsa.sistemaasignacionsalones.Modelo.Academias.AsignacionGeneral;
import com.upiicsa.sistemaasignacionsalones.Modelo.Academias.BasicasDeLaIngenieria;
import com.upiicsa.sistemaasignacionsalones.Modelo.Academias.Computacion;
import com.upiicsa.sistemaasignacionsalones.Modelo.Academias.Informatica;
import com.upiicsa.sistemaasignacionsalones.Modelo.Academias.IngIndustrial;
import com.upiicsa.sistemaasignacionsalones.Modelo.Academias.InvOperaciones;
import com.upiicsa.sistemaasignacionsalones.Modelo.Academias.Produccion;
import com.upiicsa.sistemaasignacionsalones.Modelo.Academias.SistemasDeTransporte;
import com.upiicsa.sistemaasignacionsalones.Modelo.Laboratorios.LabBasicasIng;
import com.upiicsa.sistemaasignacionsalones.Modelo.Laboratorios.LabComputacion;
import com.upiicsa.sistemaasignacionsalones.Modelo.Laboratorios.LabInformatica;
import com.upiicsa.sistemaasignacionsalones.Modelo.Laboratorios.LabSisTransporte;
import com.upiicsa.sistemaasignacionsalones.Modelo.Piso.PlantaBaja;
import com.upiicsa.sistemaasignacionsalones.Modelo.Piso.PrimerPiso;
import com.upiicsa.sistemaasignacionsalones.Modelo.Piso.SegundoPiso;
import com.upiicsa.sistemaasignacionsalones.Modelo.Piso.TercerPiso;
/**
 *
 * @author Brian Murillo, Dante Baños
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class VerificarHorario {
    //Academias
    BasicasDeLaIngenieria basicasDeLaIngenieria = new BasicasDeLaIngenieria();
    SistemasDeTransporte sistemasDeTransporte = new SistemasDeTransporte();
    IngIndustrial industrial = new IngIndustrial();
    Produccion produccion = new Produccion();
    Informatica informatica = new Informatica();
    Computacion computacion = new Computacion();
    InvOperaciones operaciones = new InvOperaciones();
    
    //Piso
    PlantaBaja plantaBaja = new PlantaBaja();
    PrimerPiso primerPiso = new PrimerPiso();
    SegundoPiso segundoPiso = new SegundoPiso();
    TercerPiso tercerPiso = new TercerPiso();
    
    //Laboratorios
    LabBasicasIng labBasicasIng = new LabBasicasIng();
    LabComputacion labComputacion = new LabComputacion();
    LabInformatica labInformatica = new LabInformatica();
    LabSisTransporte labSisTransporte = new LabSisTransporte();
    
    //General
    AsignacionGeneral asignacionGeneral = new AsignacionGeneral();
    
    public VerificarHorario() {
    }
    
    public String seleccionarSecuenciaPorPiso(String piso,String horaInicio, String horafin){
        String secuencia = "";
        switch(piso){
            case "PB":
                secuencia = plantaBaja.secuencia1(horaInicio, horafin);
                produccion.setHorariosVerificacionProduccion1(plantaBaja.getHorariosVerificacionProduccion1());
                produccion.setHorariosVerificacionProduccion2(plantaBaja.getHorariosVerificacionProduccion2());
                produccion.setHorariosVerificacionProduccion3(plantaBaja.getHorariosVerificacionProduccion3());
                produccion.setHorariosVerificacionProduccion4(plantaBaja.getHorariosVerificacionProduccion4());
                produccion.setHorariosVerificacionProduccion5(plantaBaja.getHorariosVerificacionProduccion5());
                produccion.setHorariosVerificacionProduccion6(plantaBaja.getHorariosVerificacionProduccion6());
                produccion.setHorariosVerificacionProduccion7(plantaBaja.getHorariosVerificacionProduccion7());
                break;
            case "P1":
                secuencia = primerPiso.secuencia101(horaInicio, horafin);
                industrial.setHorariosVerificacionIndustrial101(primerPiso.getHorariosVerificacionIndustrial101());
                industrial.setHorariosVerificacionIndustrial102(primerPiso.getHorariosVerificacionIndustrial102());
                industrial.setHorariosVerificacionIndustrial103(primerPiso.getHorariosVerificacionIndustrial103());
                informatica.setHorariosVerificacionInformatica104(primerPiso.getHorariosVerificacionInformatica104());
                informatica.setHorariosVerificacionInformatica105(primerPiso.getHorariosVerificacionInformatica105());
                informatica.setHorariosVerificacionInformatica106(primerPiso.getHorariosVerificacionInformatica106());
                informatica.setHorariosVerificacionInformatica113(primerPiso.getHorariosVerificacionInformatica113());
                informatica.setHorariosVerificacionInformatica114(primerPiso.getHorariosVerificacionInformatica114());
                informatica.setHorariosVerificacionInformatica114A(primerPiso.getHorariosVerificacionInformatica114A());
                informatica.setHorariosVerificacionInformatica115(primerPiso.getHorariosVerificacionInformatica115());
                industrial.setHorariosVerificacionIndustrial15A(primerPiso.getHorariosVerificacionIndustrial15A());
                industrial.setHorariosVerificacionIndustrial116(primerPiso.getHorariosVerificacionIndustrial116());
                industrial.setHorariosVerificacionIndustrial117(primerPiso.getHorariosVerificacionIndustrial117());
                industrial.setHorariosVerificacionIndustrial118(primerPiso.getHorariosVerificacionIndustrial118());
                break;
            case "P2":
                secuencia = segundoPiso.secuencia201(horaInicio, horafin);
                computacion.setHorariosVerificacionComputacion201(segundoPiso.getHorariosVerificacionComputacion201());
                computacion.setHorariosVerificacionComputacion202(segundoPiso.getHorariosVerificacionComputacion202());
                computacion.setHorariosVerificacionComputacion203(segundoPiso.getHorariosVerificacionComputacion203());
                operaciones.setHorariosVerificacionOperaciones204(segundoPiso.getHorariosVerificacionOperaciones204());
                operaciones.setHorariosVerificacionOperaciones205(segundoPiso.getHorariosVerificacionOperaciones205());                
                sistemasDeTransporte.setHorariosVerificacionTransporte206(segundoPiso.getHorariosVerificacionTransporte206());
                sistemasDeTransporte.setHorariosVerificacionTransporte211(segundoPiso.getHorariosVerificacionTransporte211());
                sistemasDeTransporte.setHorariosVerificacionTransporte212(segundoPiso.getHorariosVerificacionTransporte212());
                sistemasDeTransporte.setHorariosVerificacionTransporte213(segundoPiso.getHorariosVerificacionTransporte213());
                sistemasDeTransporte.setHorariosVerificacionTransporte214(segundoPiso.getHorariosVerificacionTransporte214());
                informatica.setHorariosVerificacionInformatica215(segundoPiso.getHorariosVerificacionInformatica215());
                basicasDeLaIngenieria.setHorariosVerificacionBasicas216(segundoPiso.getHorariosVerificacionBasicas216());
                basicasDeLaIngenieria.setHorariosVerificacionBasicas217(segundoPiso.getHorariosVerificacionBasicas217());
                basicasDeLaIngenieria.setHorariosVerificacionBasicas218(segundoPiso.getHorariosVerificacionBasicas218());
                break;
            case "P3":
                secuencia = tercerPiso.secuencia301(horaInicio, horafin);
                operaciones.setHorariosVerificacionOperaciones301(tercerPiso.getHorariosVerificacionOperaciones301());
                operaciones.setHorariosVerificacionOperaciones302(tercerPiso.getHorariosVerificacionOperaciones302());
                operaciones.setHorariosVerificacionOperaciones303(tercerPiso.getHorariosVerificacionOperaciones303());
                operaciones.setHorariosVerificacionOperaciones304(tercerPiso.getHorariosVerificacionOperaciones304());
                operaciones.setHorariosVerificacionOperaciones305(tercerPiso.getHorariosVerificacionOperaciones305());
                operaciones.setHorariosVerificacionOperaciones306(tercerPiso.getHorariosVerificacionOperaciones306());
                computacion.setHorariosVerificacionComputacion307(tercerPiso.getHorariosVerificacionComputacion307());
                computacion.setHorariosVerificacionComputacion308(tercerPiso.getHorariosVerificacionComputacion308());
                computacion.setHorariosVerificacionComputacion309(tercerPiso.getHorariosVerificacionComputacion309());
                computacion.setHorariosVerificacionComputacion310(tercerPiso.getHorariosVerificacionComputacion310());
                break;
            default:
                secuencia = "s/a";
                break;
        }
        return secuencia;
    }

    public String seleccionarSecuenciaPorLaboratiorio(String academia,String horaInicio, String horafin){
        String secuencia = "";
        switch(academia){
            case "INFORMATICA":
                secuencia = labInformatica.secuenciaPoniente(horaInicio, horafin);
                informatica.setHorariosVerificacionInformaticaPoniente(labInformatica.getHorariosVerificacionInformaticaPoniente());
                break;
            case "SIST. DE TRANS.":
                secuencia = labSisTransporte.secuenciatransporte(horaInicio, horafin);
                sistemasDeTransporte.setHorariosVerificacionTransporte(labSisTransporte.getHorariosVerificacionTransporte());
                break;
            case "COMPUTACION":
                secuencia = labComputacion.secuenciaOriente(horaInicio, horafin);
                computacion.setHorariosVerificacionComputacionOriente(labComputacion.getHorariosVerificacionComputacionOriente());
                computacion.setHorariosVerificacionComputacionRedes(labComputacion.getHorariosVerificacionComputacionRedes());
                computacion.setHorariosVerificacionComputacionProgramacion(labComputacion.getHorariosVerificacionComputacionProgramacion());
                break;            
            default:
                secuencia = "s/a";
                break;
        }
        return secuencia;
    }
    
    public String seleccionarSecuencia(String academia, String horaInicio, String horafin) {
        String secuencia = "";

        //Filtro por academia
        switch (academia) {
            case "CIENCIAS BASICAS DE LA INGENIERIA":
                secuencia = basicasDeLaIngenieria.secuencia216(horaInicio, horafin);
                asignacionGeneral.setHorariosVerificacionBasicas216(basicasDeLaIngenieria.getHorariosVerificacionBasicas216());
                asignacionGeneral.setHorariosVerificacionBasicas217(basicasDeLaIngenieria.getHorariosVerificacionBasicas217());
                asignacionGeneral.setHorariosVerificacionBasicas218(basicasDeLaIngenieria.getHorariosVerificacionBasicas218());
                break;
            case "COMPUTACION":
                secuencia = computacion.secuenciaOriente(horaInicio, horafin);
                asignacionGeneral.setHorariosVerificacionComputacion201(computacion.getHorariosVerificacionComputacion201());
                asignacionGeneral.setHorariosVerificacionComputacion202(computacion.getHorariosVerificacionComputacion202());
                asignacionGeneral.setHorariosVerificacionComputacion203(computacion.getHorariosVerificacionComputacion203());
                asignacionGeneral.setHorariosVerificacionComputacion307(computacion.getHorariosVerificacionComputacion307());
                asignacionGeneral.setHorariosVerificacionComputacion308(computacion.getHorariosVerificacionComputacion308());
                asignacionGeneral.setHorariosVerificacionComputacion309(computacion.getHorariosVerificacionComputacion309());
                asignacionGeneral.setHorariosVerificacionComputacion310(computacion.getHorariosVerificacionComputacion310());
                break;
            case "INFORMATICA":
                secuencia = informatica.secuenciaPoniente(horaInicio, horafin);
                asignacionGeneral.setHorariosVerificacionInformatica104(informatica.getHorariosVerificacionInformatica104());
                asignacionGeneral.setHorariosVerificacionInformatica105(informatica.getHorariosVerificacionInformatica105());
                asignacionGeneral.setHorariosVerificacionInformatica106(informatica.getHorariosVerificacionInformatica106());
                asignacionGeneral.setHorariosVerificacionInformatica113(informatica.getHorariosVerificacionInformatica113());
                asignacionGeneral.setHorariosVerificacionInformatica114(informatica.getHorariosVerificacionInformatica114());
                asignacionGeneral.setHorariosVerificacionInformatica114A(informatica.getHorariosVerificacionInformatica114A());
                asignacionGeneral.setHorariosVerificacionInformatica115(informatica.getHorariosVerificacionInformatica115());
                asignacionGeneral.setHorariosVerificacionInformatica215(informatica.getHorariosVerificacionInformatica215());                
                break;
            case "ING. INDUSTRIAL":
                secuencia = industrial.secuencia101(horaInicio, horafin);
                asignacionGeneral.setHorariosVerificacionIndustrial101(industrial.getHorariosVerificacionIndustrial101());
                asignacionGeneral.setHorariosVerificacionIndustrial102(industrial.getHorariosVerificacionIndustrial102());
                asignacionGeneral.setHorariosVerificacionIndustrial103(industrial.getHorariosVerificacionIndustrial103());
                asignacionGeneral.setHorariosVerificacionIndustrial116(industrial.getHorariosVerificacionIndustrial116());
                asignacionGeneral.setHorariosVerificacionIndustrial117(industrial.getHorariosVerificacionIndustrial117());
                asignacionGeneral.setHorariosVerificacionIndustrial118(industrial.getHorariosVerificacionIndustrial118());
                asignacionGeneral.setHorariosVerificacionIndustrial15A(industrial.getHorariosVerificacionIndustrial15A());
                break;
            case "INVESTIGACION DE OPERACIONES":
                secuencia = operaciones.secuencia301(horaInicio, horafin);
                asignacionGeneral.setHorariosVerificacionOperaciones204(operaciones.getHorariosVerificacionOperaciones204());
                asignacionGeneral.setHorariosVerificacionOperaciones205(operaciones.getHorariosVerificacionOperaciones205());
                asignacionGeneral.setHorariosVerificacionOperaciones301(operaciones.getHorariosVerificacionOperaciones301());
                asignacionGeneral.setHorariosVerificacionOperaciones302(operaciones.getHorariosVerificacionOperaciones302());
                asignacionGeneral.setHorariosVerificacionOperaciones303(operaciones.getHorariosVerificacionOperaciones302());
                asignacionGeneral.setHorariosVerificacionOperaciones304(operaciones.getHorariosVerificacionOperaciones304());
                asignacionGeneral.setHorariosVerificacionOperaciones305(operaciones.getHorariosVerificacionOperaciones305());
                asignacionGeneral.setHorariosVerificacionOperaciones306(operaciones.getHorariosVerificacionOperaciones306());
                break;
            case "PRODUCCION":
                secuencia = produccion.secuencia1(horaInicio, horafin);
                asignacionGeneral.setHorariosVerificacionProduccion1(produccion.getHorariosVerificacionProduccion1());
                asignacionGeneral.setHorariosVerificacionProduccion2(produccion.getHorariosVerificacionProduccion2());
                asignacionGeneral.setHorariosVerificacionProduccion3(produccion.getHorariosVerificacionProduccion3());
                asignacionGeneral.setHorariosVerificacionProduccion4(produccion.getHorariosVerificacionProduccion4());
                asignacionGeneral.setHorariosVerificacionProduccion5(produccion.getHorariosVerificacionProduccion5());
                asignacionGeneral.setHorariosVerificacionProduccion6(produccion.getHorariosVerificacionProduccion6());
                asignacionGeneral.setHorariosVerificacionProduccion7(produccion.getHorariosVerificacionProduccion7());
                break;
            case "SIST. DE TRANS.":
                secuencia = sistemasDeTransporte.secuenciatransporte(horaInicio, horafin);
                asignacionGeneral.setHorariosVerificacionTransporte206(sistemasDeTransporte.getHorariosVerificacionTransporte206());
                asignacionGeneral.setHorariosVerificacionTransporte211(sistemasDeTransporte.getHorariosVerificacionTransporte211());
                asignacionGeneral.setHorariosVerificacionTransporte212(sistemasDeTransporte.getHorariosVerificacionTransporte212());
                asignacionGeneral.setHorariosVerificacionTransporte213(sistemasDeTransporte.getHorariosVerificacionTransporte213());
                asignacionGeneral.setHorariosVerificacionTransporte214(sistemasDeTransporte.getHorariosVerificacionTransporte214());
                break;
            default:
                secuencia = "s/a";
                break;
        }
        return secuencia;
    }
    
    public String seleccionGeneral(String horaInicio,String horaFin){
        String secuencia="";
        secuencia = asignacionGeneral.secuencia1(horaInicio, horaFin);
        return secuencia;
    }
    
    //Disponibilidad Ciencias Basicas de la Ingenieria
    public String[] disponibilidadBasicasIngenieriaD1(){
        return basicasDeLaIngenieria.getHorariosVerificacionBasicasD1();
    }
    public String[] disponibilidadBasicasIngenieriaD2(){
        return basicasDeLaIngenieria.getHorariosVerificacionBasicasD2();
    }
    public String[] disponibilidadBasicasIngenieria216(){
        return asignacionGeneral.getHorariosVerificacionBasicas216();
    }
    public String[] disponibilidadBasicasIngenieria217(){
        return asignacionGeneral.getHorariosVerificacionBasicas217();
    }
    public String[] disponibilidadBasicasIngenieria218(){
        return asignacionGeneral.getHorariosVerificacionBasicas218();
    }
    
    //Disponibilidad computacion   
    public String[] disponibilidadComputacionOriente(){
        return computacion.getHorariosVerificacionComputacionOriente();
    }
    public String[] disponibilidadComputacionRedes(){
        return computacion.getHorariosVerificacionComputacionRedes();
    }
    public String[] disponibilidadComputacionProgramacion(){
        return computacion.getHorariosVerificacionComputacionProgramacion();
    }
    public String[] disponibilidadComputacion201(){
        return asignacionGeneral.getHorariosVerificacionComputacion201();
    }
    public String[] disponibilidadComputacion202(){
        return asignacionGeneral.getHorariosVerificacionComputacion202();
    }
    public String[] disponibilidadComputacion203(){
        return asignacionGeneral.getHorariosVerificacionComputacion203();
    }
    public String[] disponibilidadComputacion307(){
        return asignacionGeneral.getHorariosVerificacionComputacion307();
    }
    public String[] disponibilidadComputacion308(){
        return asignacionGeneral.getHorariosVerificacionComputacion308();
    }
    public String[] disponibilidadComputacion309(){
        return asignacionGeneral.getHorariosVerificacionComputacion309();
    }
    public String[] disponibilidadComputacion310(){
        return asignacionGeneral.getHorariosVerificacionComputacion310();
    }
    
    //Disponibilidad Informatica
    public String[] disponibilidadInformaticaPoniente(){
        return informatica.getHorariosVerificacionInformaticaPoniente();
    }
    public String[] disponibilidadInformatica104(){
        return asignacionGeneral.getHorariosVerificacionInformatica104();
    }
    public String[] disponibilidadInformatica105(){
        return asignacionGeneral.getHorariosVerificacionInformatica105();
    }
    public String[] disponibilidadInformatica106(){
        return asignacionGeneral.getHorariosVerificacionInformatica106();
    }
    public String[] disponibilidadInformatica113(){
        return asignacionGeneral.getHorariosVerificacionInformatica113();
    }
    public String[] disponibilidadInformatica114(){
        return asignacionGeneral.getHorariosVerificacionInformatica114();
    }
    public String[] disponibilidadInformatica114A(){
        return asignacionGeneral.getHorariosVerificacionInformatica114A();
    }
    public String[] disponibilidadInformatica115(){
        return asignacionGeneral.getHorariosVerificacionInformatica115();
    }
    public String[] disponibilidadInformatica215(){
        return asignacionGeneral.getHorariosVerificacionInformatica215();
    }
    
    //Disponibilidad Ing. Informatica
    public String[] disponibilidadIngIndustrial101(){
        return asignacionGeneral.getHorariosVerificacionIndustrial101();
    }
    public String[] disponibilidadIngIndustrial102(){
        return asignacionGeneral.getHorariosVerificacionIndustrial102();
    }
    public String[] disponibilidadIngIndustrial103(){
        return asignacionGeneral.getHorariosVerificacionIndustrial103();
    }
    public String[] disponibilidadIngIndustrial115A(){
        return asignacionGeneral.getHorariosVerificacionIndustrial15A();
    }
    public String[] disponibilidadIngIndustrial116(){
        return asignacionGeneral.getHorariosVerificacionIndustrial116();
    }
    public String[] disponibilidadIngIndustrial117(){
        return asignacionGeneral.getHorariosVerificacionIndustrial117();
    }
    public String[] disponibilidadIngIndustrial118(){
        return asignacionGeneral.getHorariosVerificacionIndustrial118();
    }
    
    //Disponibilidad Investidacion de operaciones
    public String[] disponibilidadInvOperaciones301(){
        return asignacionGeneral.getHorariosVerificacionOperaciones301();
    }
    public String[] disponibilidadInvOperaciones302(){
        return asignacionGeneral.getHorariosVerificacionOperaciones302();
    }
    public String[] disponibilidadInvOperaciones303(){
        return asignacionGeneral.getHorariosVerificacionOperaciones303();
    }
    public String[] disponibilidadInvOperaciones304(){
        return asignacionGeneral.getHorariosVerificacionOperaciones304();
    }
    public String[] disponibilidadInvOperaciones305(){
        return asignacionGeneral.getHorariosVerificacionOperaciones305();
    }
    public String[] disponibilidadInvOperaciones306(){
        return asignacionGeneral.getHorariosVerificacionOperaciones306();
    }   
    public String[] disponibilidadInvOperaciones204(){
        return asignacionGeneral.getHorariosVerificacionOperaciones204();
    }
    public String[] disponibilidadInvOperaciones205(){
        return asignacionGeneral.getHorariosVerificacionOperaciones205();
    }
    
    //Disponibilidad Produccion
    public String[] disponibilidadProduccion1(){
        return asignacionGeneral.getHorariosVerificacionProduccion1();
    }
    public String[] disponibilidadProduccion2(){
        return asignacionGeneral.getHorariosVerificacionProduccion2();
    }
    public String[] disponibilidadProduccion3(){
        return asignacionGeneral.getHorariosVerificacionProduccion3();
    }
    public String[] disponibilidadProduccion4(){
        return asignacionGeneral.getHorariosVerificacionProduccion4();
    }
    public String[] disponibilidadProduccion5(){
        return asignacionGeneral.getHorariosVerificacionProduccion5();
    }
    public String[] disponibilidadProduccion6(){
        return asignacionGeneral.getHorariosVerificacionProduccion6();
    }
    public String[] disponibilidadProduccion7(){
        return asignacionGeneral.getHorariosVerificacionProduccion7();
    }
    
    //Disponibilidad sistemas de transporte
    public String[] disponibilidadSistemasTransporte(){
        return sistemasDeTransporte.getHorariosVerificacionTransporte();
    }
    public String[] disponibilidadSistemasTransporte206(){
        return asignacionGeneral.getHorariosVerificacionTransporte206();
    }
    public String[] disponibilidadSistemasTransporte211(){
        return asignacionGeneral.getHorariosVerificacionTransporte211();
    }
    public String[] disponibilidadSistemasTransporte212(){
        return asignacionGeneral.getHorariosVerificacionTransporte212();
    }
    public String[] disponibilidadSistemasTransporte213(){
        return asignacionGeneral.getHorariosVerificacionTransporte213();
    }
    public String[] disponibilidadSistemasTransporte214(){
        return asignacionGeneral.getHorariosVerificacionTransporte214();
    }    
}