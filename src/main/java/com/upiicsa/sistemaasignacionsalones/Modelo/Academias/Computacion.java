package com.upiicsa.sistemaasignacionsalones.Modelo.Academias;
import com.upiicsa.sistemaasignacionsalones.Modelo.Horario;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class Computacion {
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

    public void setHorariosVerificacionComputacionOriente(String[] horariosVerificacionComputacionOriente) {
        this.horariosVerificacionComputacionOriente = horariosVerificacionComputacionOriente;
    }

    public void setHorariosVerificacionComputacionRedes(String[] horariosVerificacionComputacionRedes) {
        this.horariosVerificacionComputacionRedes = horariosVerificacionComputacionRedes;
    }

    public void setHorariosVerificacionComputacionProgramacion(String[] horariosVerificacionComputacionProgramacion) {
        this.horariosVerificacionComputacionProgramacion = horariosVerificacionComputacionProgramacion;
    }

    public void setHorariosVerificacionComputacion201(String[] horariosVerificacionComputacion201) {
        this.horariosVerificacionComputacion201 = horariosVerificacionComputacion201;
    }

    public void setHorariosVerificacionComputacion202(String[] horariosVerificacionComputacion202) {
        this.horariosVerificacionComputacion202 = horariosVerificacionComputacion202;
    }

    public void setHorariosVerificacionComputacion203(String[] horariosVerificacionComputacion203) {
        this.horariosVerificacionComputacion203 = horariosVerificacionComputacion203;
    }

    public void setHorariosVerificacionComputacion307(String[] horariosVerificacionComputacion307) {
        this.horariosVerificacionComputacion307 = horariosVerificacionComputacion307;
    }

    public void setHorariosVerificacionComputacion308(String[] horariosVerificacionComputacion308) {
        this.horariosVerificacionComputacion308 = horariosVerificacionComputacion308;
    }

    public void setHorariosVerificacionComputacion309(String[] horariosVerificacionComputacion309) {
        this.horariosVerificacionComputacion309 = horariosVerificacionComputacion309;
    }

    public void setHorariosVerificacionComputacion310(String[] horariosVerificacionComputacion310) {
        this.horariosVerificacionComputacion310 = horariosVerificacionComputacion310;
    }        
                
    String verificarDisponibilidad[];        
    String horario[];
    String horaI1;
    String horaI2;
    
    public Computacion() {
    } 
    
    //Geters salones computacion        
    public String[] getHorariosVerificacionComputacionOriente() {
        return horariosVerificacionComputacionOriente;
    }
    
    public String[] getHorariosVerificacionComputacionRedes() {
        return horariosVerificacionComputacionRedes;
    }
    
    public String[] getHorariosVerificacionComputacionProgramacion() {
        return horariosVerificacionComputacionProgramacion;
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
                                //se entra al siguiente salon
                                secuencia = secuencia201(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia201(horaInicio, horafin);
                }
            }
        }
        return secuencia;
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