package com.upiicsa.sistemaasignacionsalones.Modelo.Academias;
import com.upiicsa.sistemaasignacionsalones.Modelo.Horario;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class BasicasDeLaIngenieria {
    /*Secuencias de academia Basicas de la ingenieria*/
    //D1
    Horario basicasD1 = new Horario();
    String horariosBasicasD1[] = basicasD1.getHorarios();
    String horariosVerificacionBasicasD1[] = basicasD1.getHorariosVerificacion();
    //D2
    Horario basicasD2 = new Horario();
    String horariosBasicasD2[] = basicasD2.getHorarios();
    String horariosVerificacionBasicasD2[] = basicasD2.getHorariosVerificacion();
    //216
    Horario basicas216 = new Horario();
    String horariosBasicas216[] = basicas216.getHorarios();
    String horariosVerificacionBasicas216[] = basicas216.getHorariosVerificacion();
    //217
    Horario basicas217 = new Horario();
    String horariosBasicas217[] = basicas217.getHorarios();
    String horariosVerificacionBasicas217[] = basicas217.getHorariosVerificacion();
    //218
    Horario basicas218 = new Horario();
    String horariosBasicas218[] = basicas218.getHorarios();
    String horariosVerificacionBasicas218[] = basicas218.getHorariosVerificacion();
    
    String verificarDisponibilidad[];
    String horario[];
    String horaI1;
    String horaI2;
    
    public BasicasDeLaIngenieria() {
    }
    
    //Geters salones basicas de la ingenieria
    
    public String[] getHorariosVerificacionBasicasD1() {
        return horariosVerificacionBasicasD1;
    } 

    public String[] getHorariosVerificacionBasicasD2() {
        return horariosVerificacionBasicasD2;
    }
    
    public String[] getHorariosVerificacionBasicas216() {
        return horariosVerificacionBasicas216;
    }
    
    public String[] getHorariosVerificacionBasicas217() {
        return horariosVerificacionBasicas217;
    }
    
    public String[] getHorariosVerificacionBasicas218() {
        return horariosVerificacionBasicas218;
    }

    public void setHorariosVerificacionBasicasD1(String[] horariosVerificacionBasicasD1) {
        this.horariosVerificacionBasicasD1 = horariosVerificacionBasicasD1;
    }

    public void setHorariosVerificacionBasicasD2(String[] horariosVerificacionBasicasD2) {
        this.horariosVerificacionBasicasD2 = horariosVerificacionBasicasD2;
    }

    public void setHorariosVerificacionBasicas216(String[] horariosVerificacionBasicas216) {
        this.horariosVerificacionBasicas216 = horariosVerificacionBasicas216;
    }

    public void setHorariosVerificacionBasicas217(String[] horariosVerificacionBasicas217) {
        this.horariosVerificacionBasicas217 = horariosVerificacionBasicas217;
    }

    public void setHorariosVerificacionBasicas218(String[] horariosVerificacionBasicas218) {
        this.horariosVerificacionBasicas218 = horariosVerificacionBasicas218;
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
                                //se entra al siguiente salon
                                secuencia = secuencia216(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia216(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia216(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosBasicas216.length; i++) {
            horario = horariosBasicas216[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionBasicas216[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosBasicas216.length; j++) {
                        horario = horariosBasicas216[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionBasicas216)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionBasicas216[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "216";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia217(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia217(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia217(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosBasicas217.length; i++) {
            horario = horariosBasicas217[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionBasicas217[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosBasicas217.length; j++) {
                        horario = horariosBasicas217[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionBasicas217)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionBasicas217[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "217";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia218(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia218(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia218(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosBasicas218.length; i++) {
            horario = horariosBasicas218[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionBasicas218[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosBasicas218.length; j++) {
                        horario = horariosBasicas218[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionBasicas218)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionBasicas218[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "218";
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