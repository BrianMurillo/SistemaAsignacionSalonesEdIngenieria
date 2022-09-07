package com.upiicsa.sistemaasignacionsalones.Modelo;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class ModeloExcel {          
    Workbook wb;        
    DefaultTableModel modeloT = new DefaultTableModel();    
    DisponibilidadDeSalones disponibilidadSalones;        

    GeneracionSalon generacionSalonLunes = new GeneracionSalon();
    GeneracionSalon generacionSalonMartes = new GeneracionSalon();
    GeneracionSalon generacionSalonMiercoles = new GeneracionSalon();
    GeneracionSalon generacionSalonJueves = new GeneracionSalon();
    GeneracionSalon generacionSalonViernes = new GeneracionSalon();  
    //Objeto para generar horarios
    GeneracionHorario generacionHorarios = new GeneracionHorario();
    
    public ModeloExcel() {
    } 
    
    public boolean importar(File archivo, JTable tablaD) throws IOException, InvalidFormatException {
        tablaD.setModel(modeloT);
        try {
            wb = WorkbookFactory.create(new FileInputStream(archivo));
            Sheet hoja = wb.getSheetAt(0);
            Iterator filaIterator = hoja.rowIterator();
            int indiceFila = -1;
            while (filaIterator.hasNext()) {
                indiceFila++;
                Row fila = (Row) filaIterator.next();
                Iterator columnaIterator = fila.cellIterator();
                Object[] listaColumna = new Object[20];
                int indiceColumna = -1;
                while (columnaIterator.hasNext()) {                    
                    indiceColumna++;
                    Cell celda = (Cell) columnaIterator.next();
                    if (indiceFila == 0) {
                        modeloT.addColumn(celda.getStringCellValue());
                    } else {
                        if (celda != null) {
                            switch (celda.getCellTypeEnum().toString()) {
                                case "NUMERIC":
                                    listaColumna[indiceColumna] = (int) Math.round(celda.getNumericCellValue());
                                    break;
                                case "STRING":
                                    listaColumna[indiceColumna] = celda.getStringCellValue();
                                    break;
                                case "BLANK":
                                    listaColumna[indiceColumna] = "-";
                                    break;
                            }
                        }
                    }
                }
                if (indiceFila != 0) {
                    modeloT.addRow(listaColumna);
                }
            }
            return true;
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        return false;
    }
    
    public boolean exportarSecuencias(File archivo, JTable tablaD) throws IOException {
        int numFila = tablaD.getRowCount();
        int i = 0;
        int y = 0;
        int j = 0;
        int decremento_H = 0;
        int decremento_B = 0;
        Cell celdaCuerpo = null;
        try {
            if (archivo.getName().endsWith("xls")) {
                wb = new HSSFWorkbook();
            } else {
                wb = new XSSFWorkbook();
            }
            Sheet hoja = wb.createSheet("asignacion salones");
            Row fila = hoja.createRow(0);
            //Header excel
            while (i < 16) {
                if (i > 4) {
                    if (i == 5 || i == 7 || i == 9 || i == 11 | i == 13) {
                        Cell celda = fila.createCell(i);
                        celda.setCellValue("SALON");
                        decremento_H++;
                        i++;
                    } else {
                            Cell celda = fila.createCell(i);
                            celda.setCellValue(tablaD.getColumnName((i - decremento_H)));
                            i++;                       
                    }
                } else {
                    Cell celda = fila.createCell(i);
                    celda.setCellValue(tablaD.getColumnName(i));
                    i++;
                }
            }
            //Body excel
            while (y < numFila) {
                Row filaCuerpo = hoja.createRow(y + 1);
                while (j < 16) {
                    if (j > 4) {
                        if (j == 5 || j == 7 || j ==9 || j == 11 | j == 13) {  
                            String salon="";                             
                            switch (j) {                                
                                case 5:
                                    celdaCuerpo = filaCuerpo.createCell(j);
                                    //Piso y horario recibe el metodo
                                    salon=generacionSalonLunes.salonPiso(tablaD.getValueAt(y, 10).toString(),tablaD.getValueAt(y, 4).toString());
                                    celdaCuerpo.setCellValue(salon);
                                    decremento_B++;
                                    j++;
                                    break;
                                case 7:
                                    celdaCuerpo = filaCuerpo.createCell(j);
                                    //Piso y horario recibe el metodo
                                    salon=generacionSalonMartes.salonPiso(tablaD.getValueAt(y, 10).toString(),tablaD.getValueAt(y, 5).toString());
                                    celdaCuerpo.setCellValue(salon);
                                    decremento_B++;
                                    j++;
                                    break;
                                case 9:
                                    celdaCuerpo = filaCuerpo.createCell(j);
                                    //Piso y horario recibe el metodo
                                    salon=generacionSalonMiercoles.salonPiso(tablaD.getValueAt(y, 10).toString(),tablaD.getValueAt(y, 6).toString());
                                    celdaCuerpo.setCellValue(salon);;
                                    decremento_B++;
                                    j++;
                                    break;
                                case 11:
                                    celdaCuerpo = filaCuerpo.createCell(j);
                                    //Piso y horario recibe el metodo
                                    salon=generacionSalonJueves.salonPiso(tablaD.getValueAt(y, 10).toString(),tablaD.getValueAt(y, 7).toString());
                                    celdaCuerpo.setCellValue(salon);
                                    decremento_B++;
                                    j++;
                                    break;
                                case 13:
                                    celdaCuerpo = filaCuerpo.createCell(j);
                                    //Piso y horario recibe el metodo
                                    salon=generacionSalonViernes.salonPiso(tablaD.getValueAt(y, 10).toString(),tablaD.getValueAt(y, 8).toString());
                                    celdaCuerpo.setCellValue(salon);
                                    decremento_B++;
                                    j++;
                                    break;
                            }
                        } else {
                                celdaCuerpo = filaCuerpo.createCell(j); 
                                try{
                                    celdaCuerpo.setCellValue(tablaD.getValueAt(y, j-decremento_B).toString());
                                    j++;
                                } catch(NullPointerException e) {
                                    celdaCuerpo.setCellValue("-");
                                    j++; 
                                }                                                                
                        }
                    } else {
                        celdaCuerpo = filaCuerpo.createCell(j);
                        if (tablaD.getValueAt(y, j) != null) {
                            celdaCuerpo.setCellValue(tablaD.getValueAt(y, j).toString());
                        }
                        j++;
                    }
                }
                j = 0;
                decremento_B = 0;                  
                             
                y++;
            }
            segundaAsignacionLab(hoja,numFila);
            terceraAsignacionAcademia(hoja, numFila);
            cuartaAsignacionGeneral(hoja, numFila);
            wb.write(new FileOutputStream(archivo));            
            wb.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
        return false;
    }
    
    private void segundaAsignacionLab(Sheet hoja, int numFila) {
        int y = 0;
        int j = 0;
        //Leemos hoja
        Sheet sheet = wb.getSheetAt(0);
        while (y < numFila) {
            //Leeemos fila
            Row row = sheet.getRow(y + 1);
            while (j < 16) {
                if (j == 5 || j == 7 || j == 9 || j == 11 | j == 13) {
                    switch (j) {
                        case 5:
                            Cell academiaL = row.getCell(2);
                            Cell salonL = row.getCell(5);
                            Cell horarioL = row.getCell(4);
                            Cell laboratorioL = row.getCell(14);
                            if ("s/a".equals(salonL.toString()) && "LAB".equals(laboratorioL.toString())) {
                                String nombreSalon = generacionSalonLunes.salonLab(academiaL.toString(),horarioL.toString());
                                salonL.setCellValue(nombreSalon);
                            }
                            j++;
                            break;
                        case 7:
                            Cell academiaM = row.getCell(2);
                            Cell salonM = row.getCell(7);
                            Cell horarioM = row.getCell(6);
                            Cell laboratorioM = row.getCell(14);
                            if ("s/a".equals(salonM.toString()) && "LAB".equals(laboratorioM.toString())) {
                                String nombreSalon = generacionSalonMartes.salonLab(academiaM.toString(),horarioM.toString());
                                salonM.setCellValue(nombreSalon);
                            }
                            j++;
                            break;
                        case 9:
                            Cell academiaMi = row.getCell(2);
                            Cell salonMi = row.getCell(9);
                            Cell horarioMi = row.getCell(8);
                            Cell laboratorioMi = row.getCell(14);
                            if ("s/a".equals(salonMi.toString()) && "LAB".equals(laboratorioMi.toString())) {
                                String nombreSalon = generacionSalonMiercoles.salonLab(academiaMi.toString(),horarioMi.toString());
                                salonMi.setCellValue(nombreSalon);
                            }
                            j++;
                            break;
                        case 11:
                            Cell academiaJ = row.getCell(2);
                            Cell salonJ = row.getCell(11);
                            Cell horarioJ = row.getCell(10);
                            Cell laboratorioJ = row.getCell(14);
                            if ("s/a".equals(salonJ.toString()) && "LAB".equals(laboratorioJ.toString())) {
                                String nombreSalon = generacionSalonJueves.salonLab(academiaJ.toString(),horarioJ.toString());
                                salonJ.setCellValue(nombreSalon);
                            }
                            j++;
                            break;
                        case 13:
                            Cell academiaV = row.getCell(2);
                            Cell salonV = row.getCell(13);
                            Cell horarioV = row.getCell(12);
                            Cell laboratorioV = row.getCell(14);
                            if ("s/a".equals(salonV.toString()) && "LAB".equals(laboratorioV.toString())) {
                                String nombreSalon = generacionSalonViernes.salon(academiaV.toString(),horarioV.toString());
                                salonV.setCellValue(nombreSalon);
                            }
                            j++;
                            break;
                    }
                }
                j++;
            }
            j = 0;
            y++;
        }
    }
    
    private void terceraAsignacionAcademia(Sheet hoja, int numFila) {
        int y = 0;
        int j = 0;
        //Leemos hoja
        Sheet sheet = wb.getSheetAt(0);
        while (y < numFila) {
            //Leeemos fila
            Row row = sheet.getRow(y + 1);
            while (j < 16) {
                if (j == 5 || j == 7 || j == 9 || j == 11 | j == 13) {
                    switch (j) {
                        case 5:
                            Cell academiaL = row.getCell(2);
                            Cell salonL = row.getCell(5);
                            Cell horarioL = row.getCell(4);
                            if ("s/a".equals(salonL.toString())) {
                                String nombreSalon = generacionSalonLunes.salon(academiaL.toString(),horarioL.toString());
                                salonL.setCellValue(nombreSalon);
                            }
                            j++;
                            break;
                        case 7:
                            Cell academiaM = row.getCell(2);
                            Cell salonM = row.getCell(7);
                            Cell horarioM = row.getCell(6);
                            if ("s/a".equals(salonM.toString())) {
                                String nombreSalon = generacionSalonMartes.salon(academiaM.toString(),horarioM.toString());
                                salonM.setCellValue(nombreSalon);
                            }
                            j++;
                            break;
                        case 9:
                            Cell academiaMi = row.getCell(2);
                            Cell salonMi = row.getCell(9);
                            Cell horarioMi = row.getCell(8);
                            if ("s/a".equals(salonMi.toString())) {
                                String nombreSalon = generacionSalonMiercoles.salon(academiaMi.toString(),horarioMi.toString());
                                salonMi.setCellValue(nombreSalon);
                            }
                            j++;
                            break;
                        case 11:
                            Cell academiaJ = row.getCell(2);
                            Cell salonJ = row.getCell(11);
                            Cell horarioJ = row.getCell(10);
                            if ("s/a".equals(salonJ.toString())) {
                                String nombreSalon = generacionSalonJueves.salon(academiaJ.toString(),horarioJ.toString());
                                salonJ.setCellValue(nombreSalon);
                            }
                            j++;
                            break;
                        case 13:
                            Cell academiaV = row.getCell(2);
                            Cell salonV = row.getCell(13);
                            Cell horarioV = row.getCell(12);
                            if ("s/a".equals(salonV.toString())) {
                                String nombreSalon = generacionSalonViernes.salon(academiaV.toString(),horarioV.toString());
                                salonV.setCellValue(nombreSalon);
                            }
                            j++;
                            break;
                    }
                }
                j++;
            }
            j = 0;
            y++;
        }
    }
    
    private void cuartaAsignacionGeneral(Sheet hoja, int numFila) {
        int y = 0;
        int j = 0;
        //Leemos hoja
        Sheet sheet = wb.getSheetAt(0);
        while (y < numFila) {
            //Leeemos fila
            Row row = sheet.getRow(y + 1);
            while (j < 16) {
                if (j == 5 || j == 7 || j == 9 || j == 11 | j == 13) {
                    switch (j) {
                        case 5:
                            Cell salonL = row.getCell(5);
                            Cell horarioL = row.getCell(4);
                            if ("s/a".equals(salonL.toString())) {
                                String nombreSalon = generacionSalonLunes.salon(horarioL.toString());
                                salonL.setCellValue(nombreSalon);
                            }
                            j++;
                            break;
                        case 7:
                            Cell salonM = row.getCell(7);
                            Cell horarioM = row.getCell(6);
                            if ("s/a".equals(salonM.toString())) {
                                String nombreSalon = generacionSalonMartes.salon(horarioM.toString());
                                salonM.setCellValue(nombreSalon);
                            }
                            j++;
                            break;
                        case 9:
                            Cell salonMi = row.getCell(9);
                            Cell horarioMi = row.getCell(8);
                            if ("s/a".equals(salonMi.toString())) {
                                String nombreSalon = generacionSalonMiercoles.salon(horarioMi.toString());
                                salonMi.setCellValue(nombreSalon);
                            }
                            j++;
                            break;
                        case 11:
                            Cell salonJ = row.getCell(11);
                            Cell horarioJ = row.getCell(10);
                            if ("s/a".equals(salonJ.toString())) {
                                String nombreSalon = generacionSalonJueves.salon(horarioJ.toString());
                                salonJ.setCellValue(nombreSalon);
                            }
                            j++;
                            break;
                        case 13:
                            Cell salonV = row.getCell(13);
                            Cell horarioV = row.getCell(12);
                            if ("s/a".equals(salonV.toString())) {
                                String nombreSalon = generacionSalonViernes.salon(horarioV.toString());
                                salonV.setCellValue(nombreSalon);
                            }
                            j++;
                            break;
                    }
                }
                j++;
            }
            j = 0;
            y++;
        }
    }

    public boolean exportarExcel(File archivo, JTable tablaD) throws IOException {
        Cell celdaCuerpo = null;
        int numFila = tablaD.getRowCount();
        int numColum = tablaD.getColumnCount();
        int i = 0;
        int y = 0;
        int j = 0;
        try {
            if (archivo.getName().endsWith("xls")) {
                wb = new HSSFWorkbook();
            } else {
                wb = new XSSFWorkbook();
            }
            Sheet hoja = wb.createSheet("asignacion salones");
            Row fila = hoja.createRow(0);
            //Header table
            while (i < numColum) {
                Cell celda = fila.createCell(i);
                celda.setCellValue(tablaD.getColumnName(i));
                i++;
            }
            //Body table
            while (y < numFila) {
                Row filaCuerpo = hoja.createRow(y + 1);
                while(j < numColum){
                    celdaCuerpo = filaCuerpo.createCell(j);                                
                    celdaCuerpo.setCellValue(tablaD.getValueAt(y, j).toString());                                
                    j++;
                }
                j=0;
                y++;
            }
            wb.write(new FileOutputStream(archivo));            
            wb.close();
            return true;
        }catch (FileNotFoundException e){
            System.out.println(e.toString());            
        }
        return false;
    }
    
    public boolean generarHorarios(File archivo, JTable tablaD) throws IOException {
        try{
            if(generacionHorarios.generarHorarios(archivo, tablaD)){
                return true;
            } else {
                return false;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Error comprobar que el archivo sea el correcto");
            return false;
        }
    }

    public void limpiarTabla(){
        modeloT.setRowCount(0);
        modeloT.setColumnCount(0);        
    }
    
    public void limpiarObjetos(){
        generacionSalonLunes=new GeneracionSalon();
        generacionSalonMartes=new GeneracionSalon();
        generacionSalonMiercoles=new GeneracionSalon();
        generacionSalonJueves=new GeneracionSalon();
        generacionSalonViernes=new GeneracionSalon();
    }
    
    //Disponibilidad basicas de la ingenieria     
    public ArrayList<String[]> disponibilidadBasicasIngenieriaLunes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadBasicasIngenieria(generacionSalonLunes);
    }    
    public ArrayList<String[]> disponibilidadBasicasIngenieriaMartes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadBasicasIngenieria(generacionSalonMartes);
    }    
    public ArrayList<String[]> disponibilidadBasicasIngenieriaMiercoles(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadBasicasIngenieria(generacionSalonMiercoles);
    }    
    public ArrayList<String[]> disponibilidadBasicasIngenieriaJueves(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadBasicasIngenieria(generacionSalonJueves);
    }    
    public ArrayList<String[]> disponibilidadBasicasIngenieriaViernes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadBasicasIngenieria(generacionSalonViernes);
    }
    
    //Disponibilidad Computacion
    public ArrayList<String[]> disponibilidadComputacionLunes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadComputacion(generacionSalonLunes);
    }
    public ArrayList<String[]> disponibilidadComputacionMartes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadComputacion(generacionSalonMartes);
    }
    public ArrayList<String[]> disponibilidadComputacionMiercoles(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadComputacion(generacionSalonMiercoles);
    }
    public ArrayList<String[]> disponibilidadComputacionJueves(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadComputacion(generacionSalonJueves);
    }
    public ArrayList<String[]> disponibilidadComputacionViernes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadComputacion(generacionSalonViernes);
    }
    
    //Disponibilidad Informatica
    public ArrayList<String[]> disponibilidadInformaticaLunes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadInformatica(generacionSalonLunes);
    }
    public ArrayList<String[]> disponibilidadInformaticaMartes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadInformatica(generacionSalonMartes);
    }
    public ArrayList<String[]> disponibilidadInformaticaMiercoles(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadInformatica(generacionSalonMiercoles);
    }
    public ArrayList<String[]> disponibilidadInformaticaJueves(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadInformatica(generacionSalonJueves);
    }
    public ArrayList<String[]> disponibilidadInformaticaViernes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadInformatica(generacionSalonViernes);
    }
    
    //Disponibilidad Industrial
    public ArrayList<String[]> disponibilidadIngIndustrialLunes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadIngIndustrial(generacionSalonLunes);
    }
    public ArrayList<String[]> disponibilidadIngIndustrialMartes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadIngIndustrial(generacionSalonMartes);
    }
    public ArrayList<String[]> disponibilidadIngIndustrialMiercoles(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadIngIndustrial(generacionSalonMiercoles);
    }
    public ArrayList<String[]> disponibilidadIngIndustrialJueves(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadIngIndustrial(generacionSalonJueves);
    }
    public ArrayList<String[]> disponibilidadIngIndustrialViernes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadIngIndustrial(generacionSalonViernes);
    }
    
    //Disponibiidad Operaciones
    public ArrayList<String[]> disponibilidadInvOperacionesLunes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadInvOperaciones(generacionSalonLunes);
    }
    public ArrayList<String[]> disponibilidadInvOperacionesMartes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadInvOperaciones(generacionSalonMartes);
    }
    public ArrayList<String[]> disponibilidadInvOperacionesMiercoles(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadInvOperaciones(generacionSalonMiercoles);
    }
    public ArrayList<String[]> disponibilidadInvOperacionesJueves(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadInvOperaciones(generacionSalonJueves);
    }
    public ArrayList<String[]> disponibilidadInvOperacionesViernes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadInvOperaciones(generacionSalonViernes);
    }
    
    //Disponibilidad Produccion
    public ArrayList<String[]> disponibilidadProduccionLunes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadProduccion(generacionSalonLunes);
    }
    public ArrayList<String[]> disponibilidadProduccionMartes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadProduccion(generacionSalonMartes);
    }
    public ArrayList<String[]> disponibilidadProduccionMiercoles(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadProduccion(generacionSalonMiercoles);
    }
    public ArrayList<String[]> disponibilidadProduccionJueves(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadProduccion(generacionSalonJueves);
    }
    public ArrayList<String[]> disponibilidadProduccionViernes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadProduccion(generacionSalonViernes);
    }
    
    //Disponibilidad Sistemas de transporte
    public ArrayList<String[]> disponibilidadSistemasTransporteLunes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadTransporte(generacionSalonLunes);
    }
    public ArrayList<String[]> disponibilidadSistemasTransporteMartes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadTransporte(generacionSalonMartes);
    }
    public ArrayList<String[]> disponibilidadSistemasTransporteMiercoles(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadTransporte(generacionSalonMiercoles);
    }
    public ArrayList<String[]> disponibilidadSistemasTransporteJueves(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadTransporte(generacionSalonJueves);
    }
    public ArrayList<String[]> disponibilidadSistemasTransporteViernes(){
        disponibilidadSalones = new DisponibilidadDeSalones();
        return disponibilidadSalones.disponibilidadTransporte(generacionSalonViernes);
    }    
}