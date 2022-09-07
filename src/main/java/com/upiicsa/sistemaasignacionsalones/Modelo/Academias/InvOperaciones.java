package com.upiicsa.sistemaasignacionsalones.Modelo.Academias;
import com.upiicsa.sistemaasignacionsalones.Modelo.Horario;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class InvOperaciones {
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
    //204
    Horario operaciones204 = new Horario();
    String horariosOperaciones204[] = operaciones204.getHorarios();
    String horariosVerificacionOperaciones204[] = operaciones204.getHorariosVerificacion();
    //205
    Horario operaciones205 = new Horario();
    String horariosOperaciones205[] = operaciones205.getHorarios();
    String horariosVerificacionOperaciones205[] = operaciones205.getHorariosVerificacion();
                   
    String verificarDisponibilidad[];        
    String horario[];
    String horaI1;
    String horaI2;

    public InvOperaciones() {
    }        
    
    //Geters salones Investigacion de operaciones

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

    public String[] getHorariosVerificacionOperaciones204() {
        return horariosVerificacionOperaciones204;
    }

    public String[] getHorariosVerificacionOperaciones205() {
        return horariosVerificacionOperaciones205;
    }

    public void setHorariosVerificacionOperaciones301(String[] horariosVerificacionOperaciones301) {
        this.horariosVerificacionOperaciones301 = horariosVerificacionOperaciones301;
    }

    public void setHorariosVerificacionOperaciones302(String[] horariosVerificacionOperaciones302) {
        this.horariosVerificacionOperaciones302 = horariosVerificacionOperaciones302;
    }

    public void setHorariosVerificacionOperaciones303(String[] horariosVerificacionOperaciones303) {
        this.horariosVerificacionOperaciones303 = horariosVerificacionOperaciones303;
    }

    public void setHorariosVerificacionOperaciones304(String[] horariosVerificacionOperaciones304) {
        this.horariosVerificacionOperaciones304 = horariosVerificacionOperaciones304;
    }

    public void setHorariosVerificacionOperaciones305(String[] horariosVerificacionOperaciones305) {
        this.horariosVerificacionOperaciones305 = horariosVerificacionOperaciones305;
    }

    public void setHorariosVerificacionOperaciones306(String[] horariosVerificacionOperaciones306) {
        this.horariosVerificacionOperaciones306 = horariosVerificacionOperaciones306;
    }

    public void setHorariosVerificacionOperaciones204(String[] horariosVerificacionOperaciones204) {
        this.horariosVerificacionOperaciones204 = horariosVerificacionOperaciones204;
    }

    public void setHorariosVerificacionOperaciones205(String[] horariosVerificacionOperaciones205) {
        this.horariosVerificacionOperaciones205 = horariosVerificacionOperaciones205;
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