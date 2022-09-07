package com.upiicsa.sistemaasignacionsalones.Modelo.Academias;
import com.upiicsa.sistemaasignacionsalones.Modelo.Horario;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class IngIndustrial {
    /*Secuencias de academia Ing. Industrial*/
    //101
    Horario industrial101 = new Horario();
    String horariosIndustria1101[] = industrial101.getHorarios();
    String horariosVerificacionIndustrial101[] = industrial101.getHorariosVerificacion();
    //102
    Horario industrial102 = new Horario();
    String horariosIndustria1102[] = industrial102.getHorarios();
    String horariosVerificacionIndustrial102[] = industrial102.getHorariosVerificacion();
    //103
    Horario industrial103 = new Horario();
    String horariosIndustria1103[] = industrial103.getHorarios();
    String horariosVerificacionIndustrial103[] = industrial103.getHorariosVerificacion();
    //115A
    Horario industrial15A = new Horario();
    String horariosIndustria115A[] = industrial15A.getHorarios();
    String horariosVerificacionIndustrial15A[] = industrial15A.getHorariosVerificacion();
    //116
    Horario industrial116 = new Horario();
    String horariosIndustria1116[] = industrial116.getHorarios();
    String horariosVerificacionIndustrial116[] = industrial116.getHorariosVerificacion();
    //117
    Horario industrial117 = new Horario();
    String horariosIndustria1117[] = industrial117.getHorarios();
    String horariosVerificacionIndustrial117[] = industrial117.getHorariosVerificacion();
    //118
    Horario industrial118 = new Horario();
    String horariosIndustria1118[] = industrial118.getHorarios();
    String horariosVerificacionIndustrial118[] = industrial118.getHorariosVerificacion();
            
    String verificarDisponibilidad[];        
    String horario[];
    String horaI1;
    String horaI2;

    public IngIndustrial() {
    }      
    
    //Geters salones Ing. Industrial
    
    public String[] getHorariosVerificacionIndustrial101() {
        return horariosVerificacionIndustrial101;
    }

    public String[] getHorariosVerificacionIndustrial102() {
        return horariosVerificacionIndustrial102;
    }

    public String[] getHorariosVerificacionIndustrial103() {
        return horariosVerificacionIndustrial103;
    }

    public String[] getHorariosVerificacionIndustrial15A() {
        return horariosVerificacionIndustrial15A;
    }

    public String[] getHorariosVerificacionIndustrial116() {
        return horariosVerificacionIndustrial116;
    }

    public String[] getHorariosVerificacionIndustrial117() {
        return horariosVerificacionIndustrial117;
    }

    public String[] getHorariosVerificacionIndustrial118() {
        return horariosVerificacionIndustrial118;
    }

    public void setHorariosVerificacionIndustrial101(String[] horariosVerificacionIndustrial101) {
        this.horariosVerificacionIndustrial101 = horariosVerificacionIndustrial101;
    }

    public void setHorariosVerificacionIndustrial102(String[] horariosVerificacionIndustrial102) {
        this.horariosVerificacionIndustrial102 = horariosVerificacionIndustrial102;
    }

    public void setHorariosVerificacionIndustrial103(String[] horariosVerificacionIndustrial103) {
        this.horariosVerificacionIndustrial103 = horariosVerificacionIndustrial103;
    }

    public void setHorariosVerificacionIndustrial15A(String[] horariosVerificacionIndustrial15A) {
        this.horariosVerificacionIndustrial15A = horariosVerificacionIndustrial15A;
    }

    public void setHorariosVerificacionIndustrial116(String[] horariosVerificacionIndustrial116) {
        this.horariosVerificacionIndustrial116 = horariosVerificacionIndustrial116;
    }

    public void setHorariosVerificacionIndustrial117(String[] horariosVerificacionIndustrial117) {
        this.horariosVerificacionIndustrial117 = horariosVerificacionIndustrial117;
    }

    public void setHorariosVerificacionIndustrial118(String[] horariosVerificacionIndustrial118) {
        this.horariosVerificacionIndustrial118 = horariosVerificacionIndustrial118;
    }            
    
    public String secuencia101(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosIndustria1101.length; i++) {
            horario = horariosIndustria1101[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionIndustrial101[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosIndustria1101.length; j++) {
                        horario = horariosIndustria1101[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionIndustrial101)) {
                                finPosicion = j;                                
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionIndustrial101[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "101";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia102(horaInicio, horafin);
                            }                            
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia102(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia102(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosIndustria1102.length; i++) {
            horario = horariosIndustria1102[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionIndustrial102[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosIndustria1102.length; j++) {
                        horario = horariosIndustria1102[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionIndustrial102)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionIndustrial102[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "102";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia103(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia103(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia103(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosIndustria1103.length; i++) {
            horario = horariosIndustria1103[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionIndustrial103[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosIndustria1103.length; j++) {
                        horario = horariosIndustria1103[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionIndustrial103)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionIndustrial103[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "103";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia15A(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia15A(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia15A(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosIndustria115A.length; i++) {
            horario = horariosIndustria115A[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionIndustrial15A[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosIndustria115A.length; j++) {
                        horario = horariosIndustria115A[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionIndustrial15A)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionIndustrial15A[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "115A";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia116(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia116(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia116(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosIndustria1116.length; i++) {
            horario = horariosIndustria1116[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionIndustrial116[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosIndustria1116.length; j++) {
                        horario = horariosIndustria1116[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionIndustrial116)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionIndustrial116[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "116";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia117(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia117(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia117(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosIndustria1117.length; i++) {
            horario = horariosIndustria1117[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionIndustrial117[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosIndustria1117.length; j++) {
                        horario = horariosIndustria1117[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionIndustrial117)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionIndustrial117[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "117";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia118(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia118(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia118(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosIndustria1118.length; i++) {
            horario = horariosIndustria1118[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionIndustrial118[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosIndustria1118.length; j++) {
                        horario = horariosIndustria1118[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionIndustrial118)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionIndustrial118[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "118";
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