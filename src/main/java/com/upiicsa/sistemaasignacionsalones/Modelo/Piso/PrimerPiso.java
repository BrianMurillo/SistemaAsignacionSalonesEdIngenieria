package com.upiicsa.sistemaasignacionsalones.Modelo.Piso;

import com.upiicsa.sistemaasignacionsalones.Modelo.Horario;

/**
 *
 * @author Brian Murillo, Eduardo Campos ,Yael Rebollar
 */
public class PrimerPiso {
    
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
    /*Secuencias de academia Informatica*/    
    //104
    Horario informatica104 = new Horario();
    String horariosInformatica104[] = informatica104.getHorarios();
    String horariosVerificacionInformatica104[] = informatica104.getHorariosVerificacion();
    //105
    Horario informatica105 = new Horario();
    String horariosInformatica105[] = informatica105.getHorarios();
    String horariosVerificacionInformatica105[] = informatica105.getHorariosVerificacion();
    //106
    Horario informatica106 = new Horario();
    String horariosInformatica106[] = informatica106.getHorarios();
    String horariosVerificacionInformatica106[] = informatica106.getHorariosVerificacion();
    //113
    Horario informatica113 = new Horario();
    String horariosInformatica113[] = informatica113.getHorarios();
    String horariosVerificacionInformatica113[] = informatica113.getHorariosVerificacion();
    //114
    Horario informatica114 = new Horario();
    String horariosInformatica114[] = informatica114.getHorarios();
    String horariosVerificacionInformatica114[] = informatica114.getHorariosVerificacion();
    //114A
    Horario informatica114A = new Horario();
    String horariosInformatica114A[] = informatica114A.getHorarios();
    String horariosVerificacionInformatica114A[] = informatica114A.getHorariosVerificacion();
    //115
    Horario informatica115 = new Horario();
    String horariosInformatica115[] = informatica115.getHorarios();
    String horariosVerificacionInformatica115[] = informatica115.getHorariosVerificacion();    
    /*Secuencias de academia Ing. Industrial*/
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

    public PrimerPiso() {
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
    
    public String[] getHorariosVerificacionInformatica104() {
        return horariosVerificacionInformatica104;
    }

    public String[] getHorariosVerificacionInformatica105() {
        return horariosVerificacionInformatica105;
    }

    public String[] getHorariosVerificacionInformatica106() {
        return horariosVerificacionInformatica106;
    }
    
    public String[] getHorariosVerificacionInformatica113() {
        return horariosVerificacionInformatica113;
    }

    public String[] getHorariosVerificacionInformatica114() {
        return horariosVerificacionInformatica114;
    }

    public String[] getHorariosVerificacionInformatica114A() {
        return horariosVerificacionInformatica114A;
    }

    public String[] getHorariosVerificacionInformatica115() {
        return horariosVerificacionInformatica115;
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
                                secuencia = secuencia104(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia104(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia104(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosInformatica104.length; i++) {
            horario = horariosInformatica104[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionInformatica104[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosInformatica104.length; j++) {
                        horario = horariosInformatica104[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionInformatica104)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionInformatica104[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "104";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia105(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia105(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia105(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosInformatica105.length; i++) {
            horario = horariosInformatica105[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionInformatica105[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosInformatica105.length; j++) {
                        horario = horariosInformatica105[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionInformatica105)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionInformatica105[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "105";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia106(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia106(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia106(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosInformatica106.length; i++) {
            horario = horariosInformatica106[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionInformatica106[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosInformatica106.length; j++) {
                        horario = horariosInformatica106[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionInformatica106)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionInformatica106[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "106";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia113(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia113(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia113(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosInformatica113.length; i++) {
            horario = horariosInformatica113[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionInformatica113[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosInformatica113.length; j++) {
                        horario = horariosInformatica113[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionInformatica113)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionInformatica113[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "113";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia114(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia114(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia114(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosInformatica114.length; i++) {
            horario = horariosInformatica114[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionInformatica114[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosInformatica114.length; j++) {
                        horario = horariosInformatica114[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionInformatica114)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionInformatica114[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "114";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia114A(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia114A(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia114A(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosInformatica114A.length; i++) {
            horario = horariosInformatica114A[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionInformatica114A[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosInformatica114A.length; j++) {
                        horario = horariosInformatica114A[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionInformatica114A)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionInformatica114A[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "114A";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia115(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia115(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia115(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosInformatica115.length; i++) {
            horario = horariosInformatica115[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionInformatica115[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosInformatica115.length; j++) {
                        horario = horariosInformatica115[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionInformatica115)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionInformatica115[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "115";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia115A(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia115A(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia115A(String horaInicio, String horafin) {
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
