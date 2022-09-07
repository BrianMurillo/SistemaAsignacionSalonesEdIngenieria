package com.upiicsa.sistemaasignacionsalones.Modelo.Academias;
import com.upiicsa.sistemaasignacionsalones.Modelo.Horario;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class SistemasDeTransporte {
    /*Secuencias de academia sistemas de transporte*/
    //transporte
    Horario transporte = new Horario();
    String horariosTransporte[] = transporte.getHorarios();
    String horariosVerificacionTransporte[] = transporte.getHorariosVerificacion();
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
       
    String verificarDisponibilidad[];    
    String horario[];
    String horaI1;
    String horaI2;

    public SistemasDeTransporte() {
    }        

    //Geters salones sistemas de transporter
    
    public String[] getHorariosVerificacionTransporte() {
        return horariosVerificacionTransporte;
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

    public void setHorariosVerificacionTransporte(String[] horariosVerificacionTransporte) {
        this.horariosVerificacionTransporte = horariosVerificacionTransporte;
    }

    public void setHorariosVerificacionTransporte206(String[] horariosVerificacionTransporte206) {
        this.horariosVerificacionTransporte206 = horariosVerificacionTransporte206;
    }

    public void setHorariosVerificacionTransporte211(String[] horariosVerificacionTransporte211) {
        this.horariosVerificacionTransporte211 = horariosVerificacionTransporte211;
    }

    public void setHorariosVerificacionTransporte212(String[] horariosVerificacionTransporte212) {
        this.horariosVerificacionTransporte212 = horariosVerificacionTransporte212;
    }

    public void setHorariosVerificacionTransporte213(String[] horariosVerificacionTransporte213) {
        this.horariosVerificacionTransporte213 = horariosVerificacionTransporte213;
    }

    public void setHorariosVerificacionTransporte214(String[] horariosVerificacionTransporte214) {
        this.horariosVerificacionTransporte214 = horariosVerificacionTransporte214;
    }        
    
    public String secuenciatransporte(String horaInicio, String horafin) {
        String secuencia = "";
        int inicioPosicion;
        int finPosicion;
        for (int i = 0; i < horariosTransporte.length; i++) {
            horario = horariosTransporte[i].split("-");
            horaI1 = horario[0];
            if (horaInicio.equals(horaI1)) {
                if ("0".equals(horariosVerificacionTransporte[i])) {
                    inicioPosicion = i;
                    for (int j = i; j < horariosTransporte.length; j++) {
                        horario = horariosTransporte[j].split("-");
                        horaI2 = horario[1];
                        if (horafin.equals(horaI2)) {
                            if (verificarRangoHorario(i,j,horariosVerificacionTransporte)) {
                                finPosicion = j;
                                //Marcamos como ocupado
                                for (int x = inicioPosicion; x <= finPosicion; x++) {
                                    horariosVerificacionTransporte[x] = "1";
                                }
                                //se procede a asignar secuencia
                                secuencia = "Transporte";
                                break;
                            } else {
                                //se entra al siguiente salon
                                secuencia = secuencia206(horaInicio, horafin);
                            }
                        }
                    }
                } else {
                    //se entra al siguiente salon
                    secuencia = secuencia206(horaInicio, horafin);
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
    
    private boolean verificarRangoHorario(int horaInicio, int horafin , String[] verificarHorario){
        verificarDisponibilidad = verificarHorario;
        for (int i = horaInicio; i <= horafin; i++) {
            if("1".equals(verificarDisponibilidad[i])){
                return false;
            } 
        }
        return true;
    }    
}