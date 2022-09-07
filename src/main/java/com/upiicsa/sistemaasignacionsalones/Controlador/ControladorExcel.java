package com.upiicsa.sistemaasignacionsalones.Controlador;
import com.upiicsa.sistemaasignacionsalones.Modelo.ModeloExcel;
import com.upiicsa.sistemaasignacionsalones.Vista.VistaAcercaDe;
import com.upiicsa.sistemaasignacionsalones.Vista.VistaDisponibilidadSecuencias;
import com.upiicsa.sistemaasignacionsalones.Vista.VistaExcel;
import com.upiicsa.sistemaasignacionsalones.Vista.VistaInstrucciones;
import com.upiicsa.sistemaasignacionsalones.Vista.VistaInstruccionesComplemento;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class ControladorExcel implements ActionListener{          
    ModeloExcel modeloE = new ModeloExcel();
    VistaExcel vistaE = new VistaExcel();
    JFileChooser selectArchivo = new JFileChooser();    
    File archivo;
    int contAccion;
    int contadorVerHorario=1;
    
    public ControladorExcel() {
    }  
    
    public ControladorExcel(VistaExcel vistaE, ModeloExcel modeloE){        
        this.vistaE = vistaE;
        this.modeloE = modeloE;
        this.vistaE.btnImportar.addActionListener(this);
        this.vistaE.btnExportarSecuencias.addActionListener(this);
        this.vistaE.btnImportarSecuencias.addActionListener(this);
        this.vistaE.btnGenerarHorarios.addActionListener(this);
        this.vistaE.btnBorrar.addActionListener(this);    
        this.vistaE.menuItemLunes.addActionListener(this);
        this.vistaE.menuItemMartes.addActionListener(this);
        this.vistaE.menuItemMiercoles.addActionListener(this);
        this.vistaE.menuItemJueves.addActionListener(this);
        this.vistaE.menuItemViernes.addActionListener(this);
        this.vistaE.menuItemExportarExcel.addActionListener(this);
        this.vistaE.menuItemAcercaDe.addActionListener(this);
        this.vistaE.menuItemPaso1.addActionListener(this);
        this.vistaE.menuItemPaso2.addActionListener(this);
        this.vistaE.menuItemPaso3.addActionListener(this);
        this.vistaE.menuItemPaso4.addActionListener(this);
        this.vistaE.checkBoxVerHorario.addActionListener(this);
    }
    
    public void iniciar() {
        vistaE.setTitle("Sistema de Asignación de salones Edificio de Ingeniería UPIICSA");
        vistaE.setLocationRelativeTo(null);
        vistaE.btnExportarSecuencias.setEnabled(false);
        vistaE.btnImportarSecuencias.setEnabled(false);
        vistaE.btnGenerarHorarios.setEnabled(false); 
        vistaE.menuItemLunes.setEnabled(false);
        vistaE.menuItemMartes.setEnabled(false);
        vistaE.menuItemMiercoles.setEnabled(false);
        vistaE.menuItemJueves.setEnabled(false);
        vistaE.menuItemViernes.setEnabled(false);
        vistaE.menuItemExportarExcel.setEnabled(false);
    }
    
    public void AgregarFiltro(){
        selectArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xls","xls" ));
        selectArchivo.setFileFilter(new FileNameExtensionFilter("Excel (*.xlsx","xlsx" ));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        contAccion++;
        if (contAccion == 1) {
            AgregarFiltro();
        }

        if (e.getSource() == vistaE.btnImportar) {
            if (selectArchivo.showDialog(null, "Seleccionar archivo") == JFileChooser.APPROVE_OPTION) {
                archivo = selectArchivo.getSelectedFile();
                if (archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")) {
                    try {
                        vistaE.jtDatos.removeAll();
                        if (modeloE.importar(archivo, vistaE.jtDatos)) {
                            JOptionPane.showMessageDialog(null, "Importación Exitosa");
                            vistaE.btnImportar.setEnabled(false);
                            vistaE.checkBoxVerHorario.setEnabled(false);
                            vistaE.btnExportarSecuencias.setEnabled(true);
                            vistaE.btnImportarSecuencias.setEnabled(false);
                            vistaE.btnGenerarHorarios.setEnabled(false);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se puedo realizar la importación");
                            vistaE.btnImportar.setEnabled(true);
                            vistaE.btnExportarSecuencias.setEnabled(false);
                            vistaE.btnImportarSecuencias.setEnabled(false);
                            vistaE.btnGenerarHorarios.setEnabled(false);
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(ControladorExcel.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InvalidFormatException ex) {
                        Logger.getLogger(ControladorExcel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else {
                JOptionPane.showMessageDialog(null, "Elija un formato correcto");
                }
            } 
        }
        
        if(e.getSource() == vistaE.btnExportarSecuencias){
            if(selectArchivo.showDialog(null, "Seleccionar archivo") == JFileChooser.APPROVE_OPTION){
                //Nombre del archivo se le dara desde ventana
                archivo = selectArchivo.getSelectedFile();
                if(archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")){
                    try {
                        
                        if(modeloE.exportarSecuencias(archivo, vistaE.jtDatos)){
                            JOptionPane.showMessageDialog(null,"Exportación exitosa");
                            vistaE.btnImportar.setEnabled(false);
                            vistaE.btnExportarSecuencias.setEnabled(false);
                            vistaE.btnImportarSecuencias.setEnabled(true);
                            vistaE.btnGenerarHorarios.setEnabled(false);
                            modeloE.limpiarTabla();
                        }else {
                            JOptionPane.showMessageDialog(null,"No se pudo realizar la exportación");
                            vistaE.btnImportar.setEnabled(false);
                            vistaE.btnExportarSecuencias.setEnabled(true);
                            vistaE.btnImportarSecuencias.setEnabled(false);
                            vistaE.btnGenerarHorarios.setEnabled(false);   
                            modeloE.limpiarObjetos();
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(ControladorExcel.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ArrayIndexOutOfBoundsException ex){
                        JOptionPane.showMessageDialog(null, "Error comprobar que el numero y formato \nde las columnas sea correcto,\n");
                    } catch (NullPointerException ex){
                        JOptionPane.showMessageDialog(null, "Error comprobar el formato del archivo excel.");
                    }
                }else{                    
                    JOptionPane.showMessageDialog(null, "Elija un formato correcto");
                }
            }
        }
        
        if(e.getSource() == vistaE.menuItemExportarExcel){
            if(selectArchivo.showDialog(null, "Seleccionar archivo") == JFileChooser.APPROVE_OPTION){
                archivo = selectArchivo.getSelectedFile();
                if(archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")){
                    try {                        
                        if(modeloE.exportarExcel(archivo, vistaE.jtDatos)){
                            JOptionPane.showMessageDialog(null,"Exportación exitosa");
                        }else {
                            JOptionPane.showMessageDialog(null,"No se pudo realizar la exportación");                                            
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(ControladorExcel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{                    
                    JOptionPane.showMessageDialog(null, "Elija un formato correcto");
                }
            }
        }
        
        if(e.getSource() == vistaE.btnImportarSecuencias){   
            if (selectArchivo.showDialog(null, "Seleccionar archivo") == JFileChooser.APPROVE_OPTION) {
                archivo = selectArchivo.getSelectedFile();
                if (archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")) {
                    try {
                        vistaE.jtDatos.removeAll();
                        if (modeloE.importar(archivo, vistaE.jtDatos)) {
                            JOptionPane.showMessageDialog(null, "Importación Exitosa");
                            vistaE.btnImportar.setEnabled(false);
                            vistaE.btnExportarSecuencias.setEnabled(false);
                            vistaE.btnImportarSecuencias.setEnabled(false);
                            vistaE.btnGenerarHorarios.setEnabled(true);
                            vistaE.checkBoxVerHorario.setEnabled(false);
                            if (vistaE.checkBoxVerHorario.isSelected()) {
                                vistaE.menuItemLunes.setEnabled(false);
                                vistaE.menuItemMartes.setEnabled(false);
                                vistaE.menuItemMiercoles.setEnabled(false);
                                vistaE.menuItemJueves.setEnabled(false);
                                vistaE.menuItemViernes.setEnabled(false);
                                vistaE.menuItemExportarExcel.setEnabled(false);
                            } else {
                                vistaE.menuItemLunes.setEnabled(true);
                                vistaE.menuItemMartes.setEnabled(true);
                                vistaE.menuItemMiercoles.setEnabled(true);
                                vistaE.menuItemJueves.setEnabled(true);
                                vistaE.menuItemViernes.setEnabled(true);
                                vistaE.menuItemExportarExcel.setEnabled(true);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No se puedo realizar la importación");
                            vistaE.btnImportar.setEnabled(false);
                            vistaE.btnExportarSecuencias.setEnabled(false);
                            vistaE.btnImportarSecuencias.setEnabled(true);
                            vistaE.btnGenerarHorarios.setEnabled(false);
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(ControladorExcel.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InvalidFormatException ex) {
                        Logger.getLogger(ControladorExcel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "Elija un formato correcto");
                }
            } 
        } 
        
        if(e.getSource() == vistaE.btnGenerarHorarios){   
            if(selectArchivo.showDialog(null, "Seleccionar archivo") == JFileChooser.APPROVE_OPTION){
                archivo = selectArchivo.getSelectedFile();
                if(archivo.getName().endsWith("xls") || archivo.getName().endsWith("xlsx")){
                    try {                        
                        if(modeloE.generarHorarios(archivo, vistaE.jtDatos)){
                            JOptionPane.showMessageDialog(null,"Exportación de horarios exitosa");
                            limpiar();
                        }else {
                            JOptionPane.showMessageDialog(null,"No se pudo realizar la exportación");                                            
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(ControladorExcel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{                    
                    JOptionPane.showMessageDialog(null, "Elija un formato correcto");
                }
            }
        }
        
        if(e.getSource() == vistaE.menuItemLunes){
            VistaDisponibilidadSecuencias vistaD = new VistaDisponibilidadSecuencias();
            ControladorDisponibilidad controllerDisponibilidad = new ControladorDisponibilidad(vistaD,modeloE);
            controllerDisponibilidad.disponibilidad("Lunes");
            controllerDisponibilidad.iniciar();
            vistaD.setVisible(true);
        }
        
        if(e.getSource() == vistaE.menuItemMartes){
            VistaDisponibilidadSecuencias vistaD = new VistaDisponibilidadSecuencias();
            ControladorDisponibilidad controllerDisponibilidad = new ControladorDisponibilidad(vistaD,modeloE);
            controllerDisponibilidad.disponibilidad("Martes");
            controllerDisponibilidad.iniciar();
            vistaD.setVisible(true);
        }
        
        if(e.getSource() == vistaE.menuItemMiercoles){
            VistaDisponibilidadSecuencias vistaD = new VistaDisponibilidadSecuencias();
            ControladorDisponibilidad controllerDisponibilidad = new ControladorDisponibilidad(vistaD,modeloE);
            controllerDisponibilidad.disponibilidad("Miercoles");
            controllerDisponibilidad.iniciar();
            vistaD.setVisible(true);
        }
        
        if(e.getSource() == vistaE.menuItemJueves){
            VistaDisponibilidadSecuencias vistaD = new VistaDisponibilidadSecuencias();
            ControladorDisponibilidad controllerDisponibilidad = new ControladorDisponibilidad(vistaD,modeloE);
            controllerDisponibilidad.disponibilidad("Jueves");
            controllerDisponibilidad.iniciar();
            vistaD.setVisible(true);
        }
        
        if(e.getSource() == vistaE.menuItemViernes){
            VistaDisponibilidadSecuencias vistaD = new VistaDisponibilidadSecuencias();
            ControladorDisponibilidad controllerDisponibilidad = new ControladorDisponibilidad(vistaD,modeloE);
            controllerDisponibilidad.disponibilidad("Viernes");
            controllerDisponibilidad.iniciar();
            vistaD.setVisible(true);
        }    
        
        if(e.getSource() == vistaE.menuItemAcercaDe){
            VistaAcercaDe vistaAcercaDe = new VistaAcercaDe();
            ControladorAcercaDe controladorAcercaDe = new ControladorAcercaDe(vistaAcercaDe);
            controladorAcercaDe.iniciar();
            vistaAcercaDe.setVisible(true);
        }
        
        if(e.getSource() == vistaE.menuItemPaso1){
            VistaInstrucciones vistaInstrucciones = new VistaInstrucciones();
            String rutaPaso1 = "C:\\imgsistemasalones\\paso1.png";
            String color = "#FF5757";
            ControladorInstrucciones controladorInstrucciones = new ControladorInstrucciones(vistaInstrucciones, rutaPaso1, color);
            controladorInstrucciones.iniciar();
            vistaInstrucciones.setVisible(true);
        }
        
        if(e.getSource() == vistaE.menuItemPaso2){
            VistaInstrucciones vistaInstrucciones = new VistaInstrucciones();
            String rutaPaso2 = "C:\\imgsistemasalones\\paso2.png";
            String color = "#CFB890";
            ControladorInstrucciones controladorInstrucciones = new ControladorInstrucciones(vistaInstrucciones, rutaPaso2, color);
            controladorInstrucciones.iniciar();
            vistaInstrucciones.setVisible(true);
        }
        
        if(e.getSource() == vistaE.menuItemPaso3){
            VistaInstruccionesComplemento vistaComplemento = new VistaInstruccionesComplemento();
            String rutaPaso3 = "C:\\imgsistemasalones\\paso3.png";
            String color = "#62CACA";
            ControladorInstruccionesComplemento controladorInstruccionesComplemento = new ControladorInstruccionesComplemento(vistaComplemento,rutaPaso3,color);
            controladorInstruccionesComplemento.iniciar();
            vistaComplemento.setVisible(true);
        }
        
        if(e.getSource() == vistaE.menuItemPaso4){
            VistaInstruccionesComplemento vistaComplemento = new VistaInstruccionesComplemento();
            String rutaPaso4 = "C:\\imgsistemasalones\\paso4.png";
            String color = "#FFE890";
            ControladorInstruccionesComplemento controladorInstruccionesComplemento = new ControladorInstruccionesComplemento(vistaComplemento,rutaPaso4,color);
            controladorInstruccionesComplemento.iniciar();
            vistaComplemento.setVisible(true);
        }
        
        if(e.getSource() == vistaE.btnBorrar){
            limpiar();
        }
        
        if(e.getSource() == vistaE.checkBoxVerHorario){
            contadorVerHorario++;
            if(contadorVerHorario%2 == 0){
                vistaE.btnImportarSecuencias.setEnabled(true);
                vistaE.btnImportar.setEnabled(false);
            } else{
                vistaE.btnImportarSecuencias.setEnabled(false);
                vistaE.btnImportar.setEnabled(true);
            }
        }
        
        
    }  
    public void limpiar() {
        modeloE.limpiarTabla();
        modeloE.limpiarObjetos();
        vistaE.btnImportar.setEnabled(true);
        vistaE.btnExportarSecuencias.setEnabled(false);
        vistaE.btnImportarSecuencias.setEnabled(false);
        vistaE.btnGenerarHorarios.setEnabled(false);
        vistaE.menuItemLunes.setEnabled(false);
        vistaE.menuItemMartes.setEnabled(false);
        vistaE.menuItemMiercoles.setEnabled(false);
        vistaE.menuItemJueves.setEnabled(false);
        vistaE.menuItemViernes.setEnabled(false);
        vistaE.menuItemExportarExcel.setEnabled(false);
        vistaE.checkBoxVerHorario.setEnabled(true);
        vistaE.checkBoxVerHorario.setSelected(false);
        contadorVerHorario = 1;
    }
}