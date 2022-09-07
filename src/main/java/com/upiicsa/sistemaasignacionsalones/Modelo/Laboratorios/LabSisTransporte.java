
package com.upiicsa.sistemaasignacionsalones.Modelo.Laboratorios;

import com.upiicsa.sistemaasignacionsalones.Modelo.Horario;

/**
 *
 * @author Brian Murillo, Eduardo Campos ,Yael Rebollar
 */
public class LabSisTransporte {
    
    /*Secuencias de academia sistemas de transporte*/
    //transporte
    Horario transporte = new Horario();
    String horariosTransporte[] = transporte.getHorarios();
    String horariosVerificacionTransporte[] = transporte.getHorariosVerificacion();
    
    String verificarDisponibilidad[];    
    String horario[];
    String horaI1;
    String horaI2;

    public LabSisTransporte() {
    }
    
    public String[] getHorariosVerificacionTransporte() {
        return horariosVerificacionTransporte;
    }
    
    public String secuenciatransporte(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosTransporte.length; i++) {
            horario = horariosTransporte[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionTransporte[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosTransporte.length; j++) {
                        horario = horariosTransporte[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionTransporte)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionTransporte[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "Transporte";
                                break;
                            } else {
                                //no se encontro lugar
                                secuencia = "s/a";
                            }
                        }
                    }
                } else {
                    //no se encontro lugar
                    secuencia = "s/a";
                }
            }
        }
        return secuencia;
    }
    
    private boolean verificarRangoHorario(int horaInicio, int horafin , String[] verificarHorario){
        verificarDisponibilidad = verificarHorario;
        for (int i = horaInicio; i <= horafin; i++) {
            if("1".equals(verificarDisponibilidad[i])){
                return false;
            } 
        }
        return true;
    } 
}
