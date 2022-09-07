package com.upiicsa.sistemaasignacionsalones.Modelo.Academias;
import com.upiicsa.sistemaasignacionsalones.Modelo.Horario;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class Informatica {
    /*Secuencias de academia Informatica*/
    //Poniente
    Horario informaticaPoniente = new Horario();
    String horariosInformaticaPoniente[] = informaticaPoniente.getHorarios();
    String horariosVerificacionInformaticaPoniente[] = informaticaPoniente.getHorariosVerificacion();
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
    //215
    Horario informatica215 = new Horario();
    String horariosInformatica215[] = informatica215.getHorarios();
    String horariosVerificacionInformatica215[] = informatica215.getHorariosVerificacion();
                
    String verificarDisponibilidad[];        
    String horario[];
    String horaI1;
    String horaI2;
    
    public Informatica() {
    } 
    
    //Geters salones informatica
    public String[] getHorariosVerificacionInformaticaPoniente() {
        return horariosVerificacionInformaticaPoniente;
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

    public String[] getHorariosVerificacionInformatica215() {
        return horariosVerificacionInformatica215;
    }    

    public void setHorariosVerificacionInformaticaPoniente(String[] horariosVerificacionInformaticaPoniente) {
        this.horariosVerificacionInformaticaPoniente = horariosVerificacionInformaticaPoniente;
    }

    public void setHorariosVerificacionInformatica104(String[] horariosVerificacionInformatica104) {
        this.horariosVerificacionInformatica104 = horariosVerificacionInformatica104;
    }

    public void setHorariosVerificacionInformatica105(String[] horariosVerificacionInformatica105) {
        this.horariosVerificacionInformatica105 = horariosVerificacionInformatica105;
    }

    public void setHorariosVerificacionInformatica106(String[] horariosVerificacionInformatica106) {
        this.horariosVerificacionInformatica106 = horariosVerificacionInformatica106;
    }

    public void setHorariosVerificacionInformatica113(String[] horariosVerificacionInformatica113) {
        this.horariosVerificacionInformatica113 = horariosVerificacionInformatica113;
    }

    public void setHorariosVerificacionInformatica114(String[] horariosVerificacionInformatica114) {
        this.horariosVerificacionInformatica114 = horariosVerificacionInformatica114;
    }

    public void setHorariosVerificacionInformatica114A(String[] horariosVerificacionInformatica114A) {
        this.horariosVerificacionInformatica114A = horariosVerificacionInformatica114A;
    }

    public void setHorariosVerificacionInformatica115(String[] horariosVerificacionInformatica115) {
        this.horariosVerificacionInformatica115 = horariosVerificacionInformatica115;
    }

    public void setHorariosVerificacionInformatica215(String[] horariosVerificacionInformatica215) {
        this.horariosVerificacionInformatica215 = horariosVerificacionInformatica215;
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
                                secuencia = secuencia215(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
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