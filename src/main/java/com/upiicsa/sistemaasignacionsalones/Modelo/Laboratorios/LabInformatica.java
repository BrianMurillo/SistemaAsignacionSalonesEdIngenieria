
package com.upiicsa.sistemaasignacionsalones.Modelo.Laboratorios;

import com.upiicsa.sistemaasignacionsalones.Modelo.Horario;

/**
 *
 * @author Brian Murillo, Eduardo Campos ,Yael Rebollar
 */
public class LabInformatica {
    
    /*Secuencias de academia Informatica*/
    //Poniente
    Horario informaticaPoniente = new Horario();
    String horariosInformaticaPoniente[] = informaticaPoniente.getHorarios();
    String horariosVerificacionInformaticaPoniente[] = informaticaPoniente.getHorariosVerificacion();
    
    String verificarDisponibilidad[];        
    String horario[];
    String horaI1;
    String horaI2;

    public LabInformatica() {
    }
    
    public String[] getHorariosVerificacionInformaticaPoniente() {
        return horariosVerificacionInformaticaPoniente;
    }
    
    public String secuenciaPoniente(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosInformaticaPoniente.length; i++) {
            horario = horariosInformaticaPoniente[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionInformaticaPoniente[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosInformaticaPoniente.length; j++) {
                        horario = horariosInformaticaPoniente[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionInformaticaPoniente)) {
                                finPosicion = j;                                
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionInformaticaPoniente[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "Poniente";
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
