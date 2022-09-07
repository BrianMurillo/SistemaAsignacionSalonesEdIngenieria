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
public class HorarioSecuenciaLunes {
    private String[] horario = {"00:00-00:00","00:00-00:00","00:00-00:00","00:00-00:00","00:00-00:00","00:00-00:00","00:00-00:00",
                               "07:00-07:30","07:30-08:00","08:00-08:30","08:30-09:00","09:00-09:30","09:30-10:00","10:00-10:30","10:30-11:00",
                               "11:00-11:30","11:30-12:00","12:00-12:30","12:30-13:00","13:00-13:30","13:30-14:00","14:00-14:30",
                               "14:30-15:00","15:00-15:30","15:30-16:00","16:00-16:30","16:30-17:00","17:00-17:30","17:30-18:00",
                               "18:00-18:30","18:30-19:00","19:00-19:30","19:30-20:00","20:00-20:30","20:30-21:00","21:00-21:30",
                               "21:30-22:00"};
    private String[] basicas = {"D1","D2","216","217","218"};
    private String[] computacion = {"C2","Oriente","Redes","Programacion","201","202","203","307","308","309","310"};
    private String[] informatica = {"Poniente","104","105","106","113","114","114A","115","215"};
    private String[] indutrial = {"101","102","103","115A","116","117","118"};
    private String[] operaciones = {"301","302","303","304","305","306","C1","204","205"};
    private String[] produccion = {"1","2","3","4","5","6","7"};
    private String[] transporte = {"Transporte","206","211","212","213","214"};    
    private CellStyle salonStyle;

    public CellStyle getSalonStyle() {
        return salonStyle;
    }

    public void setSalonStyle(CellStyle salonStyle) {
        this.salonStyle = salonStyle;
    }        
    
    public void llenarDatos(Sheet hojaD1, CellStyle bodyStyleTop, CellStyle bodyStyleBottom, CellStyle bodyStyle, String[] datos) {                                               
        //la posicion 3 representa la hora
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

    public void llenarHorario(Sheet hoja, CellStyle bodyStyleTop, CellStyle bodyStyleBottom, CellStyle bodyStyle, int posInicio, int posFin , String[] datos) {   
        //Dejamos en blanco para que no se encime la hora, el salon y la academia
        String salon = datos[4];        
        datos[3] = "";
        datos[4] = "";
        datos[5] = "";
        int cont = 0;
        for (int k = posInicio; k <= posFin; k++) {
            Row filaModificar = hoja.getRow(k);
            if (k == posInicio) {
                //columna 2  del exel                
                Cell celdaModificar = filaModificar.createCell(1);
                celdaModificar.setCellStyle(bodyStyleTop);
                celdaModificar.setCellValue(datos[cont]);
                cont++;
            } else if (k == posFin) {
                Cell celdaModificar = filaModificar.createCell(1);
                celdaModificar.setCellStyle(bodyStyleBottom);
                celdaModificar.setCellValue(datos[cont]);
            } else {
                Cell celdaModificar = filaModificar.createCell(1);
                celdaModificar.setCellStyle(bodyStyle);
                celdaModificar.setCellValue(datos[cont]);
                cont++;
            }
        }
        Row filaModificar = hoja.getRow(37);      
        Cell celdaModificar = filaModificar.createCell(5);  
        celdaModificar.setCellStyle(getSalonStyle());
        celdaModificar.setCellValue(salon); 
        llenarNombreAcademia(hoja, salon);
    }
    
    public void llenarNombreAcademia(Sheet hoja, String dato){
        
        for (int i = 0; i < basicas.length; i++) {
            if (dato.equals(basicas[i])) {
                String titulo = "ACADEMIA DE CS. BÁSICAS DE LA INGENIERÍA";
                Row filaModificarAcademia = hoja.getRow(4);
                Cell celdaModificarAcademia = filaModificarAcademia.createCell(3);  
                celdaModificarAcademia.setCellStyle(getSalonStyle());
                celdaModificarAcademia.setCellValue(titulo);
                break;
            }
        }
        
        for (int i = 0; i < computacion.length; i++) {
            if (dato.equals(computacion[i])) {
                String titulo = "ACADEMIA DE COMPUTACIÓN";
                Row filaModificarAcademia = hoja.getRow(4);
                Cell celdaModificarAcademia = filaModificarAcademia.createCell(3);  
                celdaModificarAcademia.setCellStyle(getSalonStyle());
                celdaModificarAcademia.setCellValue(titulo);
                break;
            }
        }
        
        for (int i = 0; i < informatica.length; i++) {
            if (dato.equals(informatica[i])) {
                String titulo = "ACADEMIA DE INFORMÁTICA";
                Row filaModificarAcademia = hoja.getRow(4);
                Cell celdaModificarAcademia = filaModificarAcademia.createCell(3);  
                celdaModificarAcademia.setCellStyle(getSalonStyle());
                celdaModificarAcademia.setCellValue(titulo);
                break;
            }
        }
        
        for (int i = 0; i < indutrial.length; i++) {
            if (dato.equals(indutrial[i])) {
                String titulo = "ACADEMIA DE INGENIERÍA INDUSTRIAL";
                Row filaModificarAcademia = hoja.getRow(4);
                Cell celdaModificarAcademia = filaModificarAcademia.createCell(3);  
                celdaModificarAcademia.setCellStyle(getSalonStyle());
                celdaModificarAcademia.setCellValue(titulo);
                break;
            }
        }
        
        for (int i = 0; i < operaciones.length; i++) {
            if (dato.equals(operaciones[i])) {
                String titulo = "ACADEMIA DE INV. DE OPERACIONES";
                Row filaModificarAcademia = hoja.getRow(4);
                Cell celdaModificarAcademia = filaModificarAcademia.createCell(3);  
                celdaModificarAcademia.setCellStyle(getSalonStyle());
                celdaModificarAcademia.setCellValue(titulo);
                break;
            }
        }
        
        for (int i = 0; i < produccion.length; i++) {
            if (dato.equals(produccion[i])) {
                String titulo = "ACADEMIA DE PRODUCCIÓN";
                Row filaModificarAcademia = hoja.getRow(4);
                Cell celdaModificarAcademia = filaModificarAcademia.createCell(3);  
                celdaModificarAcademia.setCellStyle(getSalonStyle());
                celdaModificarAcademia.setCellValue(titulo);
                break;
            }
        }
        
        for (int i = 0; i < transporte.length; i++) {
            if (dato.equals(transporte[i])) {                
                String titulo = "ACADEMIA DE SISTEMAS DE TRANSPORTE";
                Row filaModificarAcademia = hoja.getRow(4);
                Cell celdaModificarAcademia = filaModificarAcademia.createCell(3);  
                celdaModificarAcademia.setCellStyle(getSalonStyle());
                celdaModificarAcademia.setCellValue(titulo);                
                break;
            }
        }        
    }
}