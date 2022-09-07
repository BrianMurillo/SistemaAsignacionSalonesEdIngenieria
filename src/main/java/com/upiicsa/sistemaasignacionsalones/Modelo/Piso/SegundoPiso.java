
package com.upiicsa.sistemaasignacionsalones.Modelo.Piso;

import com.upiicsa.sistemaasignacionsalones.Modelo.Horario;

/**
 *
 * @author Brian Murillo, Eduardo Campos ,Yael Rebollar
 */
public class SegundoPiso {
    
    /*Secuencias de academia Computacion*/     
    //201
    Horario computacion201 = new Horario();
    String horariosComputacion201[] = computacion201.getHorarios();
    String horariosVerificacionComputacion201[] = computacion201.getHorariosVerificacion();
    //202
    Horario computacion202 = new Horario();
    String horariosComputacion202[] = computacion202.getHorarios();
    String horariosVerificacionComputacion202[] = computacion202.getHorariosVerificacion();
    //203
    Horario computacion203 = new Horario();
    String horariosComputacion203[] = computacion203.getHorarios();
    String horariosVerificacionComputacion203[] = computacion203.getHorariosVerificacion();
    /*Secuencias de academia Inv. de Operaciones*/
    //204
    Horario operaciones204 = new Horario();
    String horariosOperaciones204[] = operaciones204.getHorarios();
    String horariosVerificacionOperaciones204[] = operaciones204.getHorariosVerificacion();
    //205
    Horario operaciones205 = new Horario();
    String horariosOperaciones205[] = operaciones205.getHorarios();
    String horariosVerificacionOperaciones205[] = operaciones205.getHorariosVerificacion();  
    /*Secuencias de academia sistemas de transporte*/
    //206
    Horario transporte206 = new Horario();
    String horariosTransporte206[] = transporte206.getHorarios();
    String horariosVerificacionTransporte206[] = transporte206.getHorariosVerificacion();
    //211
    Horario transporte211 = new Horario();
    String horariosTransporte211[] = transporte211.getHorarios();
    String horariosVerificacionTransporte211[] = transporte211.getHorariosVerificacion();
    //212
    Horario transporte212 = new Horario();
    String horariosTransporte212[] = transporte212.getHorarios();
    String horariosVerificacionTransporte212[] = transporte212.getHorariosVerificacion();
    //213
    Horario transporte213 = new Horario();
    String horariosTransporte213[] = transporte213.getHorarios();
    String horariosVerificacionTransporte213[] = transporte213.getHorariosVerificacion();
    //214
    Horario transporte214 = new Horario();
    String horariosTransporte214[] = transporte214.getHorarios();
    String horariosVerificacionTransporte214[] = transporte214.getHorariosVerificacion();
    /*Secuencias de academia Informatica*/
    //215
    Horario informatica215 = new Horario();
    String horariosInformatica215[] = informatica215.getHorarios();
    String horariosVerificacionInformatica215[] = informatica215.getHorariosVerificacion();
    /*Secuencias de academia Basicas de la ingenieria*/
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

    public SegundoPiso() {
    }
    
    public String[] getHorariosVerificacionComputacion201() {
        return horariosVerificacionComputacion201;
    }
    
    public String[] getHorariosVerificacionComputacion202() {
        return horariosVerificacionComputacion202;
    }

    public String[] getHorariosVerificacionComputacion203() {
        return horariosVerificacionComputacion203;
    }
    
    public String[] getHorariosVerificacionOperaciones204() {
        return horariosVerificacionOperaciones204;
    }

    public String[] getHorariosVerificacionOperaciones205() {
        return horariosVerificacionOperaciones205;
    }
    public String[] getHorariosVerificacionTransporte206() {
        return horariosVerificacionTransporte206;
    }

    public String[] getHorariosVerificacionTransporte211() {
        return horariosVerificacionTransporte211;
    }

    public String[] getHorariosVerificacionTransporte212() {
        return horariosVerificacionTransporte212;
    }

    public String[] getHorariosVerificacionTransporte213() {
        return horariosVerificacionTransporte213;
    }

    public String[] getHorariosVerificacionTransporte214() {
        return horariosVerificacionTransporte214;
    }
    
    public String[] getHorariosVerificacionInformatica215() {
        return horariosVerificacionInformatica215;
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
    
    public String secuencia201(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosComputacion201.length; i++) {
            horario = horariosComputacion201[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionComputacion201[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosComputacion201.length; j++) {
                        horario = horariosComputacion201[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionComputacion201)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionComputacion201[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "201";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia202(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia202(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia202(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosComputacion202.length; i++) {
            horario = horariosComputacion202[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionComputacion202[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosComputacion202.length; j++) {
                        horario = horariosComputacion202[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionComputacion202)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionComputacion202[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "202";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia203(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia203(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia203(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosComputacion203.length; i++) {
            horario = horariosComputacion203[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionComputacion203[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosComputacion203.length; j++) {
                        horario = horariosComputacion203[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionComputacion203)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionComputacion203[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "203";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia204(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia204(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia204(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosOperaciones204.length; i++) {
            horario = horariosOperaciones204[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionOperaciones204[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosOperaciones204.length; j++) {
                        horario = horariosOperaciones204[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionOperaciones204)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionOperaciones204[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "204";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia205(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia205(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia205(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosOperaciones205.length; i++) {
            horario = horariosOperaciones205[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionOperaciones205[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosOperaciones205.length; j++) {
                        horario = horariosOperaciones205[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionOperaciones205)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionOperaciones205[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "205";
                                break;
                            } else {
                                //no se encontro lugar
                                secuencia = secuencia214(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //no se encontro lugar
                    secuencia = secuencia214(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia206(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosTransporte206.length; i++) {
            horario = horariosTransporte206[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionTransporte206[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosTransporte206.length; j++) {
                        horario = horariosTransporte206[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionTransporte206)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionTransporte206[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "206";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia211(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia211(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia211(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosTransporte211.length; i++) {
            horario = horariosTransporte211[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionTransporte211[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosTransporte211.length; j++) {
                        horario = horariosTransporte211[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionTransporte211)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionTransporte211[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "211";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia212(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia212(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia212(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosTransporte212.length; i++) {
            horario = horariosTransporte212[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionTransporte212[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosTransporte212.length; j++) {
                        horario = horariosTransporte212[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionTransporte212)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionTransporte212[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "212";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia213(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia213(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia213(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosTransporte213.length; i++) {
            horario = horariosTransporte213[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionTransporte213[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosTransporte213.length; j++) {
                        horario = horariosTransporte213[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionTransporte213)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionTransporte213[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "213";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia214(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia214(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia214(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosTransporte214.length; i++) {
            horario = horariosTransporte214[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionTransporte214[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosTransporte214.length; j++) {
                        horario = horariosTransporte214[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionTransporte214)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionTransporte214[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "214";
                                break;
                            } else {
                                //no se encontro lugar
                                secuencia = secuencia215(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //no se encontro lugar
                    secuencia = secuencia215(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia215(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosInformatica215.length; i++) {
            horario = horariosInformatica215[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionInformatica215[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosInformatica215.length; j++) {
                        horario = horariosInformatica215[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionInformatica215)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionInformatica215[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "215";
                                break;
                            } else {
                                //no se encontro lugar
                                secuencia = secuencia216(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //no se encontro lugar
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
