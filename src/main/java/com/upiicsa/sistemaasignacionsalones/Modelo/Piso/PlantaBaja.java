package com.upiicsa.sistemaasignacionsalones.Modelo.Piso;
import com.upiicsa.sistemaasignacionsalones.Modelo.Horario;
/**
 *
 * @author Brian Murillo, Eduardo Campos ,Yael Rebollar
 */
public class PlantaBaja {
    /*Secuencias de academia Produccion*/
    //1
    Horario produccion1 = new Horario();
    String horariosProduccion1[] = produccion1.getHorarios();
    String horariosVerificacionProduccion1[] = produccion1.getHorariosVerificacion();
    //2
    Horario produccion2 = new Horario();
    String horariosProduccion2[] = produccion2.getHorarios();
    String horariosVerificacionProduccion2[] = produccion2.getHorariosVerificacion();
    //3
    Horario produccion3 = new Horario();
    String horariosProduccion3[] = produccion3.getHorarios();
    String horariosVerificacionProduccion3[] = produccion3.getHorariosVerificacion();
    //4
    Horario produccion4 = new Horario();
    String horariosProduccion4[] = produccion4.getHorarios();
    String horariosVerificacionProduccion4[] = produccion4.getHorariosVerificacion();
    //5
    Horario produccion5 = new Horario();
    String horariosProduccion5[] = produccion5.getHorarios();
    String horariosVerificacionProduccion5[] = produccion5.getHorariosVerificacion();
    //6
    Horario produccion6 = new Horario();
    String horariosProduccion6[] = produccion6.getHorarios();
    String horariosVerificacionProduccion6[] = produccion6.getHorariosVerificacion();
    //7
    Horario produccion7 = new Horario();
    String horariosProduccion7[] = produccion7.getHorarios();
    String horariosVerificacionProduccion7[] = produccion7.getHorariosVerificacion();
        
    String verificarDisponibilidad[];        
    String horario[];
    String horaI1;
    String horaI2;

    public PlantaBaja() {
    }     

    //Geters salones produccion 
    
    public String[] getHorariosVerificacionProduccion1() {
        return horariosVerificacionProduccion1;
    }

    public String[] getHorariosVerificacionProduccion2() {
        return horariosVerificacionProduccion2;
    }

    public String[] getHorariosVerificacionProduccion3() {
        return horariosVerificacionProduccion3;
    }

    public String[] getHorariosVerificacionProduccion4() {
        return horariosVerificacionProduccion4;
    }

    public String[] getHorariosVerificacionProduccion5() {
        return horariosVerificacionProduccion5;
    }

    public String[] getHorariosVerificacionProduccion6() {
        return horariosVerificacionProduccion6;
    }

    public String[] getHorariosVerificacionProduccion7() {
        return horariosVerificacionProduccion7;
    }        
    
    public String secuencia1(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosProduccion1.length; i++) {
            horario = horariosProduccion1[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionProduccion1[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosProduccion1.length; j++) {
                        horario = horariosProduccion1[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionProduccion1)) {
                                finPosicion = j;                                
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionProduccion1[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "1";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia2(horaInicio, horafin);
                            }                            
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia2(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia2(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosProduccion2.length; i++) {
            horario = horariosProduccion2[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionProduccion2[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosProduccion2.length; j++) {
                        horario = horariosProduccion2[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionProduccion2)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionProduccion2[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "2";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia3(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia3(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia3(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosProduccion3.length; i++) {
            horario = horariosProduccion3[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionProduccion3[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosProduccion3.length; j++) {
                        horario = horariosProduccion3[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionProduccion3)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionProduccion3[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "3";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia4(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia4(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia4(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosProduccion4.length; i++) {
            horario = horariosProduccion4[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionProduccion4[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosProduccion4.length; j++) {
                        horario = horariosProduccion4[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionProduccion4)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionProduccion4[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "4";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia5(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia5(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia5(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosProduccion5.length; i++) {
            horario = horariosProduccion5[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionProduccion5[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosProduccion5.length; j++) {
                        horario = horariosProduccion5[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionProduccion5)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionProduccion5[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "5";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia6(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia6(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia6(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosProduccion6.length; i++) {
            horario = horariosProduccion6[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionProduccion6[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosProduccion6.length; j++) {
                        horario = horariosProduccion6[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionProduccion6)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionProduccion6[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "6";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia7(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia7(horaInicio, horafin);
                }
            }
        }
        return secuencia;
    }
    
    public String secuencia7(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosProduccion7.length; i++) {
            horario = horariosProduccion7[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionProduccion7[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosProduccion7.length; j++) {
                        horario = horariosProduccion7[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionProduccion7)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionProduccion7[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "7";
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