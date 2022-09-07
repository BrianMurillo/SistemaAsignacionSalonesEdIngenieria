package com.upiicsa.sistemaasignacionsalones.Modelo;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar 
 */
class GeneracionSalon {
    private Horario horarios = new Horario();
    private String[] vectorHorarios = horarios.getHorarios();
    private VerificarHorario verificarHorario = new VerificarHorario();
    private DisponibilidadDeSalones disponibilidadSalones = new DisponibilidadDeSalones();
    private String secuencia;
        
    public GeneracionSalon() {
    }
    
    //Metodo que retorna el salon por piso
    public String salonPiso(String piso, String horario) {
        if ("-".equals(horario) || " ".equals(horario)) {
            return "-";
        } else {
            String horarios[] = horario.split("-");
            String horaInicio = horarios[0].trim();
            String horaFin = horarios[1].trim();
            secuencia = "";
            secuencia = verificarHorario.seleccionarSecuenciaPorPiso(piso, horaInicio, horaFin);
            return secuencia;
        }
    }
    
    //Metodo que retorna el salon por Lab
    public String salonLab(String academia, String horario) {
        if ("-".equals(horario) || " ".equals(horario)) {
            return "-";
        } else {
            String horarios[] = horario.split("-");
            String horaInicio = horarios[0].trim();
            String horaFin = horarios[1].trim();
            secuencia = "";
            secuencia = verificarHorario.seleccionarSecuenciaPorLaboratiorio(academia, horaInicio, horaFin);
            return secuencia;
        }
    }
    
    //Metodo que retorna el salon por academia
    public String salon(String academia, String horario) {
        if ("-".equals(horario) || " ".equals(horario)) {
            return "-";
        } else {
            String horarios[] = horario.split("-");
            String horaInicio = horarios[0].trim();
            String horaFin = horarios[1].trim();
            secuencia = "";
            secuencia = verificarHorario.seleccionarSecuencia(academia, horaInicio, horaFin);
            return secuencia;
        }
    }
    
    //Metodo que retorna el salon general
    public String salon(String horario) {
        if ("-".equals(horario) || " ".equals(horario)) {
            return "-";
        } else {
            String horarios[] = horario.split("-");
            String horaInicio = horarios[0].trim();
            String horaFin = horarios[1].trim();
            secuencia = "";
            secuencia = verificarHorario.seleccionGeneral(horaInicio, horaFin);
            return secuencia;
        }
    }
    
    //Disponibilidad Ciencias basicas de la Ingenieria 
    //D1        
    public String[] disponibilidadBasicasIngenieriaD1(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(D1)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadBasicasIngenieriaD1()),verificarHorario.disponibilidadBasicasIngenieriaD1(),vectorHorarios);        
        return disponibilidad; 
    }
    //D2        
    public String[] disponibilidadBasicasIngenieriaD2(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(D2)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadBasicasIngenieriaD2()),verificarHorario.disponibilidadBasicasIngenieriaD2(),vectorHorarios);        
        return disponibilidad; 
    }
    //216        
    public String[] disponibilidadBasicasIngenieria216(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(216)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadBasicasIngenieria216()),verificarHorario.disponibilidadBasicasIngenieria216(),vectorHorarios);        
        return disponibilidad; 
    }
    //217        
    public String[] disponibilidadBasicasIngenieria217(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(217)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadBasicasIngenieria217()),verificarHorario.disponibilidadBasicasIngenieria217(),vectorHorarios);        
        return disponibilidad; 
    }
    //218        
    public String[] disponibilidadBasicasIngenieria218(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(218)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadBasicasIngenieria218()),verificarHorario.disponibilidadBasicasIngenieria218(),vectorHorarios);        
        return disponibilidad; 
    }
    
    //Diponibilidad computacion     
    //Oriente
    public String[] disponibilidadComputacionOriente(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(Oriente)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadComputacionOriente()),verificarHorario.disponibilidadComputacionOriente(),vectorHorarios);        
        return disponibilidad; 
    }
    //Redes
    public String[] disponibilidadComputacionRedes(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(Redes)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadComputacionRedes()),verificarHorario.disponibilidadComputacionRedes(),vectorHorarios);        
        return disponibilidad; 
    }
    //Programacion
    public String[] disponibilidadComputacionProgramacion(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(Programacion)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadComputacionProgramacion()),verificarHorario.disponibilidadComputacionProgramacion(),vectorHorarios);        
        return disponibilidad; 
    }
    //201
    public String[] disponibilidadComputacion201(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(201)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadComputacion201()),verificarHorario.disponibilidadComputacion201(),vectorHorarios);        
        return disponibilidad; 
    }
    //202
    public String[] disponibilidadComputacion202(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(202)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadComputacion202()),verificarHorario.disponibilidadComputacion202(),vectorHorarios);        
        return disponibilidad; 
    }
    //203
    public String[] disponibilidadComputacion203(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(203)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadComputacion203()),verificarHorario.disponibilidadComputacion203(),vectorHorarios);        
        return disponibilidad; 
    }
    //307
    public String[] disponibilidadComputacion307(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(307)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadComputacion307()),verificarHorario.disponibilidadComputacion307(),vectorHorarios);        
        return disponibilidad; 
    }
    //308
    public String[] disponibilidadComputacion308(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(308)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadComputacion308()),verificarHorario.disponibilidadComputacion308(),vectorHorarios);        
        return disponibilidad; 
    }
    //309
    public String[] disponibilidadComputacion309(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(309)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadComputacion309()),verificarHorario.disponibilidadComputacion309(),vectorHorarios);        
        return disponibilidad; 
    }
    //310
    public String[] disponibilidadComputacion310(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(310)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadComputacion310()),verificarHorario.disponibilidadComputacion310(),vectorHorarios);        
        return disponibilidad; 
    }
    
    //Disponibilidad informatica
    //Poniente        
    public String[] disponibilidadInformaticaPoniente(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(Poniente)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadInformaticaPoniente()),verificarHorario.disponibilidadInformaticaPoniente(),vectorHorarios);        
        return disponibilidad; 
    }
    //104        
    public String[] disponibilidadInformatica104(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(104)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadInformatica104()),verificarHorario.disponibilidadInformatica104(),vectorHorarios);        
        return disponibilidad; 
    }
    //105        
    public String[] disponibilidadInformatica105(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(105)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadInformatica105()),verificarHorario.disponibilidadInformatica105(),vectorHorarios);        
        return disponibilidad; 
    }
    //106        
    public String[] disponibilidadInformatica106(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(106)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadInformatica106()),verificarHorario.disponibilidadInformatica106(),vectorHorarios);        
        return disponibilidad; 
    }
    //113        
    public String[] disponibilidadInformatica113(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(113)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadInformatica113()),verificarHorario.disponibilidadInformatica113(),vectorHorarios);        
        return disponibilidad; 
    }
    //114        
    public String[] disponibilidadInformatica114(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(114)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadInformatica114()),verificarHorario.disponibilidadInformatica114(),vectorHorarios);        
        return disponibilidad; 
    }
    //114A        
    public String[] disponibilidadInformatica114A(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(114A)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadInformatica114A()),verificarHorario.disponibilidadInformatica114A(),vectorHorarios);        
        return disponibilidad; 
    }
    //115        
    public String[] disponibilidadInformatica115(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(115)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadInformatica115()),verificarHorario.disponibilidadInformatica115(),vectorHorarios);        
        return disponibilidad; 
    }
    //215        
    public String[] disponibilidadInformatica215(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(215)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadInformatica215()),verificarHorario.disponibilidadInformatica215(),vectorHorarios);        
        return disponibilidad; 
    }    
    
    //Disponibilidad Ing.Industrial
    //101
    public String[] disponibilidadIngIdustrial101(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(101)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadIngIndustrial101()),verificarHorario.disponibilidadIngIndustrial101(),vectorHorarios);        
        return disponibilidad; 
    }
    //102
    public String[] disponibilidadIngIdustrial102(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(102)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadIngIndustrial102()),verificarHorario.disponibilidadIngIndustrial102(),vectorHorarios);        
        return disponibilidad; 
    }
    //103
    public String[] disponibilidadIngIdustrial103(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(103)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadIngIndustrial103()),verificarHorario.disponibilidadIngIndustrial103(),vectorHorarios);        
        return disponibilidad; 
    }
    //115A
    public String[] disponibilidadIngIdustrial115A(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(115A)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadIngIndustrial115A()),verificarHorario.disponibilidadIngIndustrial115A(),vectorHorarios);        
        return disponibilidad; 
    }
    //116
    public String[] disponibilidadIngIdustrial116(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(116)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadIngIndustrial116()),verificarHorario.disponibilidadIngIndustrial116(),vectorHorarios);        
        return disponibilidad; 
    }
    //117
    public String[] disponibilidadIngIdustrial117(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(117)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadIngIndustrial117()),verificarHorario.disponibilidadIngIndustrial117(),vectorHorarios);        
        return disponibilidad; 
    }
    //118
    public String[] disponibilidadIngIdustrial118(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(118)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadIngIndustrial118()),verificarHorario.disponibilidadIngIndustrial118(),vectorHorarios);        
        return disponibilidad; 
    }
    
    //Disponibilidad Investigacion de Operaciones
    public String[] disponibilidadInvOperaciones301(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(301)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadInvOperaciones301()),verificarHorario.disponibilidadInvOperaciones301(),vectorHorarios);        
        return disponibilidad;
    }
    public String[] disponibilidadInvOperaciones302(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(302)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadInvOperaciones302()),verificarHorario.disponibilidadInvOperaciones302(),vectorHorarios);        
        return disponibilidad;
    }
    public String[] disponibilidadInvOperaciones303(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(303)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadInvOperaciones303()),verificarHorario.disponibilidadInvOperaciones303(),vectorHorarios);        
        return disponibilidad;
    }
    public String[] disponibilidadInvOperaciones304(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(304)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadInvOperaciones304()),verificarHorario.disponibilidadInvOperaciones304(),vectorHorarios);        
        return disponibilidad;
    }
    public String[] disponibilidadInvOperaciones305(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(305)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadInvOperaciones305()),verificarHorario.disponibilidadInvOperaciones305(),vectorHorarios);        
        return disponibilidad;
    }
    public String[] disponibilidadInvOperaciones306(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(306)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadInvOperaciones306()),verificarHorario.disponibilidadInvOperaciones306(),vectorHorarios);        
        return disponibilidad;
    }    
    public String[] disponibilidadInvOperaciones204(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(204)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadInvOperaciones204()),verificarHorario.disponibilidadInvOperaciones204(),vectorHorarios);        
        return disponibilidad;
    }
    public String[] disponibilidadInvOperaciones205(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(205)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadInvOperaciones205()),verificarHorario.disponibilidadInvOperaciones205(),vectorHorarios);        
        return disponibilidad;
    }
    
    //Disponibilidad produccion
    public String[] disponibilidadProduccion1(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(1)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadProduccion1()), verificarHorario.disponibilidadProduccion1(), vectorHorarios);
        return disponibilidad;
    }
    public String[] disponibilidadProduccion2(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(2)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadProduccion2()), verificarHorario.disponibilidadProduccion2(), vectorHorarios);
        return disponibilidad;
    }
    public String[] disponibilidadProduccion3(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(3)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadProduccion3()), verificarHorario.disponibilidadProduccion3(), vectorHorarios);
        return disponibilidad;
    }
    public String[] disponibilidadProduccion4(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(4)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadProduccion4()), verificarHorario.disponibilidadProduccion4(), vectorHorarios);
        return disponibilidad;
    }
    public String[] disponibilidadProduccion5(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(5)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadProduccion5()), verificarHorario.disponibilidadProduccion5(), vectorHorarios);
        return disponibilidad;
    }
    public String[] disponibilidadProduccion6(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(6)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadProduccion6()), verificarHorario.disponibilidadProduccion6(), vectorHorarios);
        return disponibilidad;
    }
    public String[] disponibilidadProduccion7(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(7)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadProduccion7()), verificarHorario.disponibilidadProduccion7(), vectorHorarios);
        return disponibilidad;
    }
    
    //Disponibilidad sistemas transporte
    public String[] disponibilidadSistemasTransporte(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(Transporte)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadSistemasTransporte()), verificarHorario.disponibilidadSistemasTransporte(), vectorHorarios);
        return disponibilidad;
    }
            
    public String[] disponibilidadSistemasTransporte206(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(206)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadSistemasTransporte206()), verificarHorario.disponibilidadSistemasTransporte206(), vectorHorarios);
        return disponibilidad;
    }
    public String[] disponibilidadSistemasTransporte211(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(211)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadSistemasTransporte211()), verificarHorario.disponibilidadSistemasTransporte211(), vectorHorarios);
        return disponibilidad;
    }
    public String[] disponibilidadSistemasTransporte212(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(212)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadSistemasTransporte212()), verificarHorario.disponibilidadSistemasTransporte212(), vectorHorarios);
        return disponibilidad;
    }
    public String[] disponibilidadSistemasTransporte213(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(213)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadSistemasTransporte213()), verificarHorario.disponibilidadSistemasTransporte213(), vectorHorarios);
        return disponibilidad;
    }
    public String[] disponibilidadSistemasTransporte214(){
        String[] disponibilidad = disponibilidadSalones.disponibilidad("(214)",disponibilidadSalones.sizeArray(verificarHorario.disponibilidadSistemasTransporte214()), verificarHorario.disponibilidadSistemasTransporte214(), vectorHorarios);
        return disponibilidad;
    }
}