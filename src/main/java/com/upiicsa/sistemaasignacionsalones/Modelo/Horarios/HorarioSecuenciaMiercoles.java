package com.upiicsa.sistemaasignacionsalones.Modelo.Horarios;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class HorarioSecuenciaMiercoles {
    private String[] horario = {"00:00-00:00","00:00-00:00","00:00-00:00","00:00-00:00","00:00-00:00","00:00-00:00","00:00-00:00",
                               "07:00-07:30","07:30-08:00","08:00-08:30","08:30-09:00","09:00-09:30","09:30-10:00","10:00-10:30","10:30-11:00",
                               "11:00-11:30","11:30-12:00","12:00-12:30","12:30-13:00","13:00-13:30","13:30-14:00","14:00-14:30",
                               "14:30-15:00","15:00-15:30","15:30-16:00","16:00-16:30","16:30-17:00","17:00-17:30","17:30-18:00",
                               "18:00-18:30","18:30-19:00","19:00-19:30","19:30-20:00","20:00-20:30","20:30-21:00","21:00-21:30",
                               "21:30-22:00"};
    
    
    public void llenarDatos(Sheet hojaD1, CellStyle bodyStyleTop, CellStyle bodyStyleBottom, CellStyle bodyStyle, String[] datos) {                                               
        String[] partirHora = datos[3].split("-");
        String horaInicio = partirHora[0];
        String horaFin = partirHora[1]; 
        String horarioPartido[];      
        int posInicio;
        int posFin;
        for(int i=0 ; i<horario.length ; i++){
            horarioPartido = horario[i].split("-");
            if(horaInicio.equals(horarioPartido[0])){
                posInicio = i;
                for (int j = i; j < horario.length; j++) {
                    horarioPartido = horario[j].split("-");
                    if(horaFin.equals(horarioPartido[1])){
                        posFin = j;                        
                        llenarHorario(hojaD1, bodyStyleTop, bodyStyleBottom, bodyStyle, posInicio, posFin, datos);
                        break;
                    }
                }
            }            
        }
    }

    public void llenarHorario(Sheet hoja, CellStyle bodyStyleTop, CellStyle bodyStyleBottom, CellStyle bodyStyle, int posInicio, int posFin, String[] datos) {
        datos[3] = "";
        datos[4] = "";
        datos[5] = "";
        int cont = 0;
        for (int k = posInicio; k <= posFin; k++) {
            Row filaModificar = hoja.getRow(k);
            if (k == posInicio) {
                //columna 4  del exel
                Cell celdaModificar = filaModificar.createCell(3);
                celdaModificar.setCellStyle(bodyStyleTop);
                celdaModificar.setCellValue(datos[cont]);
                cont++;
            } else if (k == posFin) {
                Cell celdaModificar = filaModificar.createCell(3);
                celdaModificar.setCellStyle(bodyStyleBottom);
                celdaModificar.setCellValue(datos[cont]);
            } else {
                Cell celdaModificar = filaModificar.createCell(3);
                celdaModificar.setCellStyle(bodyStyle);
                celdaModificar.setCellValue(datos[cont]);
                cont++;
            }
        }
    }
}