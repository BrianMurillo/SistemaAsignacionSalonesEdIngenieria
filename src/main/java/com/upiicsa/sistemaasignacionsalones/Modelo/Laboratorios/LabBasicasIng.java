
package com.upiicsa.sistemaasignacionsalones.Modelo.Laboratorios;

import com.upiicsa.sistemaasignacionsalones.Modelo.Horario;

/**
 *
 * @author Brian Murillo, Eduardo Campos ,Yael Rebollar
 */

public class LabBasicasIng {
    
    /*Secuencias de academia Basicas de la ingenieria*/
    //D1
    Horario basicasD1 = new Horario();
    String horariosBasicasD1[] = basicasD1.getHorarios();
    String horariosVerificacionBasicasD1[] = basicasD1.getHorariosVerificacion();
    //D2
    Horario basicasD2 = new Horario();
    String horariosBasicasD2[] = basicasD2.getHorarios();
    String horariosVerificacionBasicasD2[] = basicasD2.getHorariosVerificacion();
    
    String verificarDisponibilidad[];
    String horario[];
    String horaI1;
    String horaI2;

    public LabBasicasIng() {
    }
    
    public String[] getHorariosVerificacionBasicasD1() {
        return horariosVerificacionBasicasD1;
    } 

    public String[] getHorariosVerificacionBasicasD2() {
        return horariosVerificacionBasicasD2;
    }
    
    public String secuenciaD1(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosBasicasD1.length; i++) {
            horario = horariosBasicasD1[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionBasicasD1[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosBasicasD1.length; j++) {
                        horario = horariosBasicasD1[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionBasicasD1)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionBasicasD1[x] = "1";                                    
                                }                                
                                //se procede a asignar secuencia
                                secuencia = "D1";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuenciaD2(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuenciaD2(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuenciaD2(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosBasicasD2.length; i++) {
            horario = horariosBasicasD2[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionBasicasD2[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosBasicasD2.length; j++) {
                        horario = horariosBasicasD2[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionBasicasD2)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionBasicasD2[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "D2";
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
    
    private boolean verificarRangoHorario(int horaInicio, int horafin, String[] verificarHorario) {
        verificarDisponibilidad = verificarHorario;
        for (int i = horaInicio; i <= horafin; i++) {
            if("1".equals(verificarDisponibilidad[i])){
                return false;
            } 
        }
        return true;
    }  
    
}