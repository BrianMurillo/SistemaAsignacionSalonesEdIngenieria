
package com.upiicsa.sistemaasignacionsalones.Modelo.Laboratorios;

import com.upiicsa.sistemaasignacionsalones.Modelo.Horario;

/**
 *
 * @author Brian Murillo, Eduardo Campos ,Yael Rebollar
 */
public class LabComputacion {
    
    /*Secuencias de academia Computacion*/    
    //Oriente
    Horario computacionOriente = new Horario();
    String horariosComputacionOriente[] = computacionOriente.getHorarios();
    String horariosVerificacionComputacionOriente[] = computacionOriente.getHorariosVerificacion();
    //Redes
    Horario computacionRedes = new Horario();
    String horariosComputacionRedes[] = computacionRedes.getHorarios();
    String horariosVerificacionComputacionRedes[] = computacionRedes.getHorariosVerificacion();
    //Programacion
    Horario computacionProgramacion = new Horario();
    String horariosComputacionProgramacion[] = computacionProgramacion.getHorarios();
    String horariosVerificacionComputacionProgramacion[] = computacionProgramacion.getHorariosVerificacion();

    public String[] getHorariosVerificacionComputacionOriente() {
        return horariosVerificacionComputacionOriente;
    }

    public String[] getHorariosVerificacionComputacionRedes() {
        return horariosVerificacionComputacionRedes;
    }

    public String[] getHorariosVerificacionComputacionProgramacion() {
        return horariosVerificacionComputacionProgramacion;
    }
    
    
    
    String verificarDisponibilidad[];        
    String horario[];
    String horaI1;
    String horaI2;

    public LabComputacion() {
    }
    
    public String secuenciaOriente(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosComputacionOriente.length; i++) {
            horario = horariosComputacionOriente[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionComputacionOriente[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosComputacionOriente.length; j++) {
                        horario = horariosComputacionOriente[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionComputacionOriente)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionComputacionOriente[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "Oriente";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuenciaRedes(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuenciaRedes(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuenciaRedes(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosComputacionRedes.length; i++) {
            horario = horariosComputacionRedes[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionComputacionRedes[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosComputacionRedes.length; j++) {
                        horario = horariosComputacionRedes[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionComputacionRedes)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionComputacionRedes[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "Redes";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuenciaProgramacion(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuenciaProgramacion(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuenciaProgramacion(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosComputacionProgramacion.length; i++) {
            horario = horariosComputacionProgramacion[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionComputacionProgramacion[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosComputacionProgramacion.length; j++) {
                        horario = horariosComputacionProgramacion[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionComputacionProgramacion)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionComputacionProgramacion[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "Programacion";
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
