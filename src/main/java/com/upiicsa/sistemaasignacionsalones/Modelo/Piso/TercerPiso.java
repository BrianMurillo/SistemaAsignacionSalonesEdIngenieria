
package com.upiicsa.sistemaasignacionsalones.Modelo.Piso;

import com.upiicsa.sistemaasignacionsalones.Modelo.Horario;

/**
 *
 * @author Brian Murillo, Eduardo Campos ,Yael Rebollar
 */
public class TercerPiso {
    
    /*Secuencias de academia Inv. de Operaciones*/
    //301
    Horario operaciones301 = new Horario();
    String horariosOperaciones301[] = operaciones301.getHorarios();
    String horariosVerificacionOperaciones301[] = operaciones301.getHorariosVerificacion();
    //302
    Horario operaciones302 = new Horario();
    String horariosOperaciones302[] = operaciones302.getHorarios();
    String horariosVerificacionOperaciones302[] = operaciones302.getHorariosVerificacion();
    //303
    Horario operaciones303 = new Horario();
    String horariosOperaciones303[] = operaciones303.getHorarios();
    String horariosVerificacionOperaciones303[] = operaciones303.getHorariosVerificacion();
    //304
    Horario operaciones304 = new Horario();
    String horariosOperaciones304[] = operaciones304.getHorarios();
    String horariosVerificacionOperaciones304[] = operaciones304.getHorariosVerificacion();
    //305
    Horario operaciones305 = new Horario();
    String horariosOperaciones305[] = operaciones305.getHorarios();
    String horariosVerificacionOperaciones305[] = operaciones305.getHorariosVerificacion();
    //306
    Horario operaciones306 = new Horario();
    String horariosOperaciones306[] = operaciones306.getHorarios();
    String horariosVerificacionOperaciones306[] = operaciones306.getHorariosVerificacion();
    /*Secuencias de academia Computacion*/
    //307
    Horario computacion307 = new Horario();
    String horariosComputacion307[] = computacion307.getHorarios();
    String horariosVerificacionComputacion307[] = computacion307.getHorariosVerificacion();
    //308
    Horario computacion308 = new Horario();
    String horariosComputacion308[] = computacion308.getHorarios();
    String horariosVerificacionComputacion308[] = computacion308.getHorariosVerificacion();
    //309
    Horario computacion309 = new Horario();
    String horariosComputacion309[] = computacion309.getHorarios();
    String horariosVerificacionComputacion309[] = computacion309.getHorariosVerificacion();
    //310
    Horario computacion310 = new Horario();
    String horariosComputacion310[] = computacion310.getHorarios();
    String horariosVerificacionComputacion310[] = computacion310.getHorariosVerificacion();
    
    String verificarDisponibilidad[];        
    String horario[];
    String horaI1;
    String horaI2;

    public TercerPiso() {
    }
    
    public String[] getHorariosVerificacionOperaciones301() {
        return horariosVerificacionOperaciones301;
    }

    public String[] getHorariosVerificacionOperaciones302() {
        return horariosVerificacionOperaciones302;
    }

    public String[] getHorariosVerificacionOperaciones303() {
        return horariosVerificacionOperaciones303;
    }

    public String[] getHorariosVerificacionOperaciones304() {
        return horariosVerificacionOperaciones304;
    }

    public String[] getHorariosVerificacionOperaciones305() {
        return horariosVerificacionOperaciones305;
    }

    public String[] getHorariosVerificacionOperaciones306() {
        return horariosVerificacionOperaciones306;
    } 
    
    public String[] getHorariosVerificacionComputacion307() {
        return horariosVerificacionComputacion307;
    }

    public String[] getHorariosVerificacionComputacion308() {
        return horariosVerificacionComputacion308;
    }

    public String[] getHorariosVerificacionComputacion309() {
        return horariosVerificacionComputacion309;
    }

    public String[] getHorariosVerificacionComputacion310() {
        return horariosVerificacionComputacion310;
    }  
    
    public String secuencia301(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosOperaciones301.length; i++) {
            horario = horariosOperaciones301[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionOperaciones301[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosOperaciones301.length; j++) {
                        horario = horariosOperaciones301[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionOperaciones301)) {
                                finPosicion = j;                                
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionOperaciones301[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "301";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia302(horaInicio, horafin);
                            }                            
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia302(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia302(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosOperaciones302.length; i++) {
            horario = horariosOperaciones302[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionOperaciones302[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosOperaciones302.length; j++) {
                        horario = horariosOperaciones302[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionOperaciones302)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionOperaciones302[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "302";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia303(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia303(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia303(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosOperaciones303.length; i++) {
            horario = horariosOperaciones303[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionOperaciones303[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosOperaciones303.length; j++) {
                        horario = horariosOperaciones303[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionOperaciones303)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionOperaciones303[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "303";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia304(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia304(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia304(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosOperaciones304.length; i++) {
            horario = horariosOperaciones304[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionOperaciones304[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosOperaciones304.length; j++) {
                        horario = horariosOperaciones304[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionOperaciones304)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionOperaciones304[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "304";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia305(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia305(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia305(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosOperaciones305.length; i++) {
            horario = horariosOperaciones305[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionOperaciones305[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosOperaciones305.length; j++) {
                        horario = horariosOperaciones305[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionOperaciones305)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionOperaciones305[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "305";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia306(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia306(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia306(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosOperaciones306.length; i++) {
            horario = horariosOperaciones306[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionOperaciones306[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosOperaciones306.length; j++) {
                        horario = horariosOperaciones306[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionOperaciones306)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionOperaciones306[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "306";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia307(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia307(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia307(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosComputacion307.length; i++) {
            horario = horariosComputacion307[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionComputacion307[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosComputacion307.length; j++) {
                        horario = horariosComputacion307[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionComputacion307)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionComputacion307[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "307";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia308(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia308(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia308(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosComputacion308.length; i++) {
            horario = horariosComputacion308[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionComputacion308[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosComputacion308.length; j++) {
                        horario = horariosComputacion308[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionComputacion308)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionComputacion308[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "308";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia309(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia309(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
        public String secuencia309(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosComputacion309.length; i++) {
            horario = horariosComputacion309[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionComputacion309[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosComputacion309.length; j++) {
                        horario = horariosComputacion309[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionComputacion309)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionComputacion309[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "309";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia310(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia310(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
        
        public String secuencia310(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosComputacion310.length; i++) {
            horario = horariosComputacion310[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionComputacion310[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosComputacion310.length; j++) {
                        horario = horariosComputacion310[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionComputacion310)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionComputacion310[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "310";
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
