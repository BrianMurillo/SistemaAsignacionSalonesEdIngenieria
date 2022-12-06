package com.upiicsa.sistemaasignacionsalones.Modelo;
import com.upiicsa.sistemaasignacionsalones.Modelo.Estilos.EstiloHorario;
import com.upiicsa.sistemaasignacionsalones.Modelo.Estilos.EstiloMateria;
import com.upiicsa.sistemaasignacionsalones.Modelo.Horarios.HorarioSecuenciaJueves;
import com.upiicsa.sistemaasignacionsalones.Modelo.Horarios.HorarioSecuenciaLunes;
import com.upiicsa.sistemaasignacionsalones.Modelo.Horarios.HorarioSecuenciaMartes;
import com.upiicsa.sistemaasignacionsalones.Modelo.Horarios.HorarioSecuenciaMiercoles;
import com.upiicsa.sistemaasignacionsalones.Modelo.Horarios.HorarioSecuenciaViernes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JTable;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class GeneracionHorario {

    EstiloHorario estiloHorario = new EstiloHorario();
    EstiloMateria estiloMateria = new EstiloMateria();
    CellStyle bodyStyle;
    CellStyle bodyStyleTop;
    CellStyle bodyStyleBottom;
    HorarioSecuenciaLunes horarioSecuenciaLunes = new HorarioSecuenciaLunes();
    HorarioSecuenciaMartes horarioSecuenciaMartes = new HorarioSecuenciaMartes();
    HorarioSecuenciaMiercoles horarioSecuenciaMiercoles = new HorarioSecuenciaMiercoles();
    HorarioSecuenciaJueves horarioSecuenciaJueves = new HorarioSecuenciaJueves();
    HorarioSecuenciaViernes horarioSecuenciaViernes = new HorarioSecuenciaViernes();
    String[] datos = new String[8];
    String[] obtenerDatos = new String[8];
    String salon = "";

    public boolean generarHorarios(File archivo, JTable tablaD, String periodoEscolar) throws IOException {
        int filas = tablaD.getRowCount();
        int y = 0;
        Workbook wb;
        if (archivo.getName().endsWith("xls")) {
            wb = new HSSFWorkbook();
        } else {
            wb = new XSSFWorkbook();
        }                               

        try {
            //Basicas de la ingenieria
            Sheet hojaD1 = wb.createSheet("D1");
            Sheet hojaD2 = wb.createSheet("D2");
            Sheet hoja216 = wb.createSheet("216");
            Sheet hoja217 = wb.createSheet("217");
            Sheet hoja218 = wb.createSheet("218");  
            //Computacion
            Sheet hojaOriente = wb.createSheet("Oriente");
            Sheet hojaRedes = wb.createSheet("Redes");
            Sheet hojaProgramacion = wb.createSheet("Programacion");
            Sheet hoja201 = wb.createSheet("201");
            Sheet hoja202 = wb.createSheet("202");
            Sheet hoja203 = wb.createSheet("203");
            Sheet hoja307 = wb.createSheet("307");
            Sheet hoja308 = wb.createSheet("308");
            Sheet hoja309 = wb.createSheet("309");
            Sheet hoja310 = wb.createSheet("310");
            //Informatica
            Sheet hojaPoniente = wb.createSheet("Poniente");
            Sheet hoja104 = wb.createSheet("104");
            Sheet hoja105 = wb.createSheet("105");
            Sheet hoja106 = wb.createSheet("106");
            Sheet hoja113 = wb.createSheet("113");
            Sheet hoja114 = wb.createSheet("114");
            Sheet hoja114A = wb.createSheet("114A");
            Sheet hoja115 = wb.createSheet("115");
            Sheet hoja215 = wb.createSheet("215");
            //Ingenieria Industrial
            Sheet hoja101 = wb.createSheet("101");
            Sheet hoja102 = wb.createSheet("102");
            Sheet hoja103 = wb.createSheet("103");
            Sheet hoja115A = wb.createSheet("115A");
            Sheet hoja116 = wb.createSheet("116");
            Sheet hoja117 = wb.createSheet("117");
            Sheet hoja118 = wb.createSheet("118");
            //Investigacion de operaciones
            Sheet hoja301 = wb.createSheet("301");
            Sheet hoja302 = wb.createSheet("302");
            Sheet hoja303 = wb.createSheet("303");
            Sheet hoja304 = wb.createSheet("304");
            Sheet hoja305 = wb.createSheet("305");
            Sheet hoja306 = wb.createSheet("306");
            Sheet hoja204 = wb.createSheet("204");
            Sheet hoja205 = wb.createSheet("205");
            //Produccion
            Sheet hoja1 = wb.createSheet("1");
            Sheet hoja2 = wb.createSheet("2");
            Sheet hoja3 = wb.createSheet("3");
            Sheet hoja4 = wb.createSheet("4");
            Sheet hoja5 = wb.createSheet("5");
            Sheet hoja6 = wb.createSheet("6");
            Sheet hoja7 = wb.createSheet("7");
            //Sistemas de transporte
            Sheet hojaTransporte = wb.createSheet("Transporte");
            Sheet hoja206 = wb.createSheet("206");
            Sheet hoja211 = wb.createSheet("211");
            Sheet hoja212 = wb.createSheet("212");
            Sheet hoja213 = wb.createSheet("213");
            Sheet hoja214 = wb.createSheet("214");
            
            //Basicas de la ingenieria
            estiloHorario.agregarDiseñoEncabezado(wb, hojaD1, periodoEscolar);            
            estiloHorario.agregarDiseñoEncabezado(wb, hojaD2, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja216, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja217, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja218, periodoEscolar);
            //Computacion
            estiloHorario.agregarDiseñoEncabezado(wb, hojaOriente, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hojaRedes, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hojaProgramacion, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja201, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja202, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja203, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja307, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja308, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja309, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja310, periodoEscolar);
            //Informatica
            estiloHorario.agregarDiseñoEncabezado(wb, hojaPoniente, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja104, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja105, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja106, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja113, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja114, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja114A, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja115, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja215, periodoEscolar);
            //Ingenieria industrial
            estiloHorario.agregarDiseñoEncabezado(wb, hoja101, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja102, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja103, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja115A, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja116, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja117, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja118, periodoEscolar);
            //Investigacion de operaciones
            estiloHorario.agregarDiseñoEncabezado(wb, hoja301, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja302, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja303, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja304, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja305, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja306,periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja204, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja205, periodoEscolar);
            //Produccion
            estiloHorario.agregarDiseñoEncabezado(wb, hoja1, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja2, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja3, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja4, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja5, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja6, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja7, periodoEscolar);
            //Sistemas de transporte
            estiloHorario.agregarDiseñoEncabezado(wb, hojaTransporte, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja206, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja211, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja212, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja213, periodoEscolar);
            estiloHorario.agregarDiseñoEncabezado(wb, hoja214, periodoEscolar);
            //Nombre de salon
            horarioSecuenciaLunes.setSalonStyle(estiloMateria.styleNombreSalon(wb));
            
            //Asignar horarios de -----------LUNES-------------
            while(y < filas){                
                if(!"-".equals(tablaD.getValueAt(y, 6).toString()) && !"s/a".equals(tablaD.getValueAt(y , 6).toString())){
                    //Obetenemos salon de tabla
                    salon = tablaD.getValueAt(y, 6).toString();
                    switch(salon){
                        case "D1":                            
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD); 
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hojaD1, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "D2":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hojaD2, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "216":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja216, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "217":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja217, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "218":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja218, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;                       
                        case "Oriente":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hojaOriente, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Redes":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hojaRedes, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Programacion":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hojaProgramacion, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "201":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja201, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "202":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja202, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "203":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja203, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "307":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja307, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "308":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja308, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "309":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja309, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "310":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja310, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Poniente":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hojaPoniente, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "104":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja104, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "105":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja105, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "106":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja106, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "113":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja113, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "114":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja114, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "114A":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja114A, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "115":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja115, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "215":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja215, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "101":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja101, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "102":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja102, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "103":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja103, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "115A":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja115A, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "116":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja116, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "117":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja117, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "118":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja118, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "301":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja301, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "302":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja302, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "303":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja303, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "304":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja304, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "305":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja305, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "306":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja306, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;                       
                        case "204":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja204, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "205":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja205, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "1":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja1, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "2":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja2, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "3":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja3, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "4":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja4, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "5":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja5, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "6":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja6, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "7":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja7, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Transporte":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hojaTransporte, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "206":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja206, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "211":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja211, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "212":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja212, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "213":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja213, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "214":
                            obtenerDatos=obtenerDatosTablaLunes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaLunes.llenarDatos(hoja214, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        default :
                            break;                        
                    }
                }                
                y++;
            }             
            y=0;
            //Asignar horarios de -----------Martes-------------
            while(y < filas){                
                if(!"-".equals(tablaD.getValueAt(y, 8).toString()) && !"s/a".equals(tablaD.getValueAt(y , 8).toString())){
                    //Obetenemos salon de tabla
                    salon = tablaD.getValueAt(y, 8).toString();
                    switch(salon){
                        case "D1":                            
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hojaD1, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "D2":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hojaD2, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "216":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja216, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "217":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja217, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "218":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja218, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;                        
                        case "Oriente":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hojaOriente, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Redes":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hojaRedes, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Programacion":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hojaProgramacion, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "201":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja201, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "202":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja202, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "203":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja203, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "307":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja307, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "308":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja308, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "309":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja309, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "310":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja310, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Poniente":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hojaPoniente, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "104":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja104, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "105":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja105, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "106":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja106, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "113":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja113, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "114":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja114, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "114A":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja114A, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "115":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja115, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "215":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja215, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "101":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja101, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "102":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja102, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "103":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja103, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "115A":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja115A, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "116":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja116, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "117":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja117, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "118":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja118, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "301":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja301, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "302":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja302, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "303":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja303, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "304":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja304, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "305":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja305, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "306":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja306, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;                        
                        case "204":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja204, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "205":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja205, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "1":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja1, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "2":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja2, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "3":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja3, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "4":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja4, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "5":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja5, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "6":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja6, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "7":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja7, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Transporte":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hojaTransporte, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "206":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja206, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "211":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja211, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "212":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja212, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "213":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja213, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "214":
                            obtenerDatos=obtenerDatosTablaMartes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMartes.llenarDatos(hoja214, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        default :
                            break;                        
                    }
                }                
                y++;
            }
            
            y=0;
            //Asignar horarios de -----------Miercoles-------------
            while(y < filas){                
                if(!"-".equals(tablaD.getValueAt(y, 10).toString()) && !"s/a".equals(tablaD.getValueAt(y , 10).toString())){
                    //Obetenemos salon de tabla
                    salon = tablaD.getValueAt(y, 10).toString();
                    switch(salon){
                        case "D1":                            
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hojaD1, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "D2":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hojaD2, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "216":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja216, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "217":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja217, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "218":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja218, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;                        
                        case "Oriente":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hojaOriente, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Redes":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hojaRedes, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Programacion":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hojaProgramacion, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "201":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja201, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "202":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja202, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "203":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja203, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "307":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja307, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "308":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja308, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "309":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja309, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "310":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja310, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Poniente":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hojaPoniente, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "104":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja104, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "105":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja105, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "106":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja106, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "113":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja113, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "114":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja114, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "114A":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja114A, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "115":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja115, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "215":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja215, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "101":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja101, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "102":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja102, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "103":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja103, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "115A":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja115A, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "116":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja116, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "117":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja117, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "118":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja118, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "301":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja301, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "302":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja302, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "303":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja303, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "304":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja304, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "305":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja305, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "306":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja306, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;                        
                        case "204":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja204, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "205":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja205, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "1":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja1, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "2":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja2, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "3":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja3, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "4":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja4, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "5":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja5, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "6":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja6, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "7":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja7, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Transporte":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hojaTransporte, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "206":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja206, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "211":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja211, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "212":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja212, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "213":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja213, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "214":
                            obtenerDatos=obtenerDatosTablaMiercoles(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaMiercoles.llenarDatos(hoja214, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        default :
                            break;                        
                    }
                }                
                y++;
            }
            
            y=0;
            //Asignar horarios de ----------Jueves-------------
            while(y < filas){                
                if(!"-".equals(tablaD.getValueAt(y, 12).toString()) && !"s/a".equals(tablaD.getValueAt(y , 12).toString())){
                    //Obetenemos salon de tabla
                    salon = tablaD.getValueAt(y, 12).toString();
                    switch(salon){
                        case "D1":                            
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hojaD1, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "D2":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hojaD2, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "216":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja216, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "217":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja217, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "218":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja218, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;                        
                        case "Oriente":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hojaOriente, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Redes":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hojaRedes, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Programacion":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hojaProgramacion, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "201":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja201, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "202":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja202, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "203":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja203, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "307":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja307, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "308":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja308, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "309":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja309, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "310":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja310, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Poniente":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hojaPoniente, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "104":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja104, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "105":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja105, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "106":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja106, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "113":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja113, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "114":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja114, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "114A":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja114A, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "115":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja115, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "215":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja215, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "101":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja101, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "102":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja102, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "103":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja103, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "115A":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja115A, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "116":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja116, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "117":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja117, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "118":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja118, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "301":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja301, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "302":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja302, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "303":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja303, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "304":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja304, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "305":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja305, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "306":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja306, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;                        
                        case "204":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja204, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "205":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja205, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "1":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja1, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "2":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja2, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "3":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja3, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "4":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja4, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "5":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja5, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "6":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja6, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "7":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja7, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Transporte":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hojaTransporte, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "206":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja206, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "211":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja211, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "212":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja212, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "213":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja213, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "214":
                            obtenerDatos=obtenerDatosTablaJueves(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaJueves.llenarDatos(hoja214, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        default :
                            break;                        
                    }
                }                
                y++;
            }
            
            y=0;
            //Asignar horarios de ----------Viernes-------------
            while(y < filas){                
                if(!"-".equals(tablaD.getValueAt(y, 14).toString()) && !"s/a".equals(tablaD.getValueAt(y , 14).toString())){
                    //Obetenemos salon de tabla
                    salon = tablaD.getValueAt(y, 14).toString();
                    switch(salon){
                        case "D1":                            
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hojaD1, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "D2":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hojaD2, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "216":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja216, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "217":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja217, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "218":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja218, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;                        
                        case "Oriente":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hojaOriente, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Redes":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hojaRedes, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Programacion":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hojaProgramacion, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "201":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja201, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "202":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja202, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "203":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja203, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "307":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja307, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "308":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja308, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "309":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja309, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "310":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja310, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Poniente":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hojaPoniente, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "104":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja104, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "105":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja105, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "106":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja106, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "113":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja113, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "114":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja114, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "114A":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja114A, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "115":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja115, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "215":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja215, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "101":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja101, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "102":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja102, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "103":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja103, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "115A":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja115A, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "116":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja116, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "117":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja117, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "118":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja118, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "301":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja301, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "302":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja302, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "303":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja303, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "304":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja304, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "305":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja305, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "306":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja306, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;                        
                        case "204":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja204, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "205":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja205, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "1":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja1, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "2":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja2, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "3":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja3, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "4":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja4, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "5":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja5, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "6":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja6, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "7":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja7, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "Transporte":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hojaTransporte, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "206":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja206, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "211":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja211, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "212":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja212, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "213":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja213, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        case "214":
                            obtenerDatos=obtenerDatosTablaViernes(y,tablaD);
                            estiloSalon(wb,obtenerDatos[5]);
                            horarioSecuenciaViernes.llenarDatos(hoja214, bodyStyleTop, bodyStyleBottom, bodyStyle, obtenerDatos);
                            break;
                        default :
                            break;                        
                    }
                }                
                y++;
            }
            
            estiloHorario.ajustarAnchoColumna(hojaD1);
            estiloHorario.ajustarAnchoColumna(hojaD2);
            estiloHorario.ajustarAnchoColumna(hoja216);
            estiloHorario.ajustarAnchoColumna(hoja217);
            estiloHorario.ajustarAnchoColumna(hoja218);
            estiloHorario.ajustarAnchoColumna(hojaOriente);
            estiloHorario.ajustarAnchoColumna(hojaRedes);
            estiloHorario.ajustarAnchoColumna(hojaProgramacion);
            estiloHorario.ajustarAnchoColumna(hoja201);
            estiloHorario.ajustarAnchoColumna(hoja202);
            estiloHorario.ajustarAnchoColumna(hoja203);
            estiloHorario.ajustarAnchoColumna(hoja307);
            estiloHorario.ajustarAnchoColumna(hoja308);
            estiloHorario.ajustarAnchoColumna(hoja309);
            estiloHorario.ajustarAnchoColumna(hoja310);
            estiloHorario.ajustarAnchoColumna(hojaPoniente);
            estiloHorario.ajustarAnchoColumna(hoja104);
            estiloHorario.ajustarAnchoColumna(hoja105);
            estiloHorario.ajustarAnchoColumna(hoja106);
            estiloHorario.ajustarAnchoColumna(hoja113);
            estiloHorario.ajustarAnchoColumna(hoja114);
            estiloHorario.ajustarAnchoColumna(hoja114A);
            estiloHorario.ajustarAnchoColumna(hoja115);
            estiloHorario.ajustarAnchoColumna(hoja215);   
            estiloHorario.ajustarAnchoColumna(hoja101);
            estiloHorario.ajustarAnchoColumna(hoja102);
            estiloHorario.ajustarAnchoColumna(hoja103);
            estiloHorario.ajustarAnchoColumna(hoja115A);
            estiloHorario.ajustarAnchoColumna(hoja116);
            estiloHorario.ajustarAnchoColumna(hoja117);
            estiloHorario.ajustarAnchoColumna(hoja118);
            estiloHorario.ajustarAnchoColumna(hoja301);
            estiloHorario.ajustarAnchoColumna(hoja302);
            estiloHorario.ajustarAnchoColumna(hoja303);
            estiloHorario.ajustarAnchoColumna(hoja304);
            estiloHorario.ajustarAnchoColumna(hoja305);
            estiloHorario.ajustarAnchoColumna(hoja306);
            estiloHorario.ajustarAnchoColumna(hoja204);
            estiloHorario.ajustarAnchoColumna(hoja205);
            estiloHorario.ajustarAnchoColumna(hoja1);
            estiloHorario.ajustarAnchoColumna(hoja2);
            estiloHorario.ajustarAnchoColumna(hoja3);
            estiloHorario.ajustarAnchoColumna(hoja4);
            estiloHorario.ajustarAnchoColumna(hoja5);
            estiloHorario.ajustarAnchoColumna(hoja6);
            estiloHorario.ajustarAnchoColumna(hoja7);
            estiloHorario.ajustarAnchoColumna(hojaTransporte);
            estiloHorario.ajustarAnchoColumna(hoja206);
            estiloHorario.ajustarAnchoColumna(hoja211);
            estiloHorario.ajustarAnchoColumna(hoja212);
            estiloHorario.ajustarAnchoColumna(hoja213);
            estiloHorario.ajustarAnchoColumna(hoja214);
            wb.write(new FileOutputStream(archivo));            
            wb.close();
            return true;
        }catch (FileNotFoundException e){
            System.out.println(e.toString());            
        }
        return false;
    }
   
    //La variable "y" repesenta la columna
    public String[] obtenerDatosTablaLunes(int y, JTable tabla) {
        //Secuencia
        datos[0] = tabla.getValueAt(y, 1).toString();
        //Nombre materia
        datos[1] = tabla.getValueAt(y, 2).toString();
        //Nombre Profesor
        datos[2] = tabla.getValueAt(y, 4).toString();
        //Hora lunes
        datos[3] = tabla.getValueAt(y, 5).toString();
        //Salon
        datos[4] = tabla.getValueAt(y, 6).toString();
        //Academia
        datos[5] = tabla.getValueAt(y, 3).toString();
        datos[6] = "";
        datos[7] = "";
        return datos;
    }
    
    public String[] obtenerDatosTablaMartes(int y, JTable tabla){
        datos[0] = tabla.getValueAt(y, 1).toString();
        datos[1] = tabla.getValueAt(y, 2).toString();
        datos[2] = tabla.getValueAt(y, 4).toString();
        datos[3] = tabla.getValueAt(y, 7).toString();
        datos[4] = tabla.getValueAt(y, 8).toString();
        datos[5] = tabla.getValueAt(y, 3).toString();
        datos[6] = "";
        datos[7] = "";
        return datos;
    }
    
    public String[] obtenerDatosTablaMiercoles(int y, JTable tabla){
        datos[0] = tabla.getValueAt(y, 1).toString();
        datos[1] = tabla.getValueAt(y, 2).toString();
        datos[2] = tabla.getValueAt(y, 4).toString();
        datos[3] = tabla.getValueAt(y, 9).toString();
        datos[4] = tabla.getValueAt(y, 10).toString();
        datos[5] = tabla.getValueAt(y, 3).toString();
        datos[6] = "";
        datos[7] = "";
        return datos;
    }
    
    public String[] obtenerDatosTablaJueves(int y, JTable tabla){
        datos[0] = tabla.getValueAt(y, 1).toString();
        datos[1] = tabla.getValueAt(y, 2).toString();
        datos[2] = tabla.getValueAt(y, 4).toString();
        datos[3] = tabla.getValueAt(y, 11).toString();
        datos[4] = tabla.getValueAt(y, 12).toString();
        datos[5] = tabla.getValueAt(y, 3).toString();
        datos[6] = "";
        datos[7] = "";
        return datos;
    }
    
    public String[] obtenerDatosTablaViernes(int y, JTable tabla){
        datos[0] = tabla.getValueAt(y, 1).toString();
        datos[1] = tabla.getValueAt(y, 2).toString();
        datos[2] = tabla.getValueAt(y, 4).toString();
        datos[3] = tabla.getValueAt(y, 13).toString();
        datos[4] = tabla.getValueAt(y, 14).toString();
        datos[5] = tabla.getValueAt(y, 3).toString();
        datos[6] = "";
        datos[7] = "";
        return datos;        
    }

    private void estiloSalon(Workbook wb,String obtenerDato) {
        switch(obtenerDato){
            case "COMPUTACION":
                bodyStyle = estiloMateria.bodyStyle(wb, IndexedColors.SKY_BLUE);
                bodyStyleTop = estiloMateria.styleTop(wb, IndexedColors.SKY_BLUE);
                bodyStyleBottom = estiloMateria.styleBottom(wb, IndexedColors.SKY_BLUE);
                break;
            case "INFORMATICA":
                bodyStyle = estiloMateria.bodyStyle(wb, IndexedColors.PINK);
                bodyStyleTop = estiloMateria.styleTop(wb, IndexedColors.PINK);
                bodyStyleBottom = estiloMateria.styleBottom(wb, IndexedColors.PINK);
                break;
            case "CIENCIAS BASICAS DE LA INGENIERIA":
                bodyStyle = estiloMateria.bodyStyle(wb, IndexedColors.ORANGE);
                bodyStyleTop = estiloMateria.styleTop(wb, IndexedColors.ORANGE);
                bodyStyleBottom = estiloMateria.styleBottom(wb, IndexedColors.ORANGE);
                break;
            case "SIST. DE TRANS.":
                bodyStyle = estiloMateria.bodyStyle(wb, IndexedColors.TAN);
                bodyStyleTop = estiloMateria.styleTop(wb, IndexedColors.TAN);
                bodyStyleBottom = estiloMateria.styleBottom(wb, IndexedColors.TAN);
                break;
            case "ING. INDUSTRIAL":
                bodyStyle = estiloMateria.bodyStyle(wb, IndexedColors.VIOLET);
                bodyStyleTop = estiloMateria.styleTop(wb, IndexedColors.VIOLET);
                bodyStyleBottom = estiloMateria.styleBottom(wb, IndexedColors.VIOLET);
                break;
            case "PRODUCCION":
                bodyStyle = estiloMateria.bodyStyle(wb, IndexedColors.BROWN);
                bodyStyleTop = estiloMateria.styleTop(wb, IndexedColors.BROWN);
                bodyStyleBottom = estiloMateria.styleBottom(wb, IndexedColors.BROWN);
                break;
            case "INVESTIGACION DE OPERACIONES":
                bodyStyle = estiloMateria.bodyStyle(wb, IndexedColors.LIME);
                bodyStyleTop = estiloMateria.styleTop(wb, IndexedColors.LIME);
                bodyStyleBottom = estiloMateria.styleBottom(wb, IndexedColors.LIME);
                break;
            default:
                break;            
        }
    }
}