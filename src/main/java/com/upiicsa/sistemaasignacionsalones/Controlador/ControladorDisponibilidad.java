package com.upiicsa.sistemaasignacionsalones.Controlador;
import com.upiicsa.sistemaasignacionsalones.Modelo.ModeloExcel;
import com.upiicsa.sistemaasignacionsalones.Vista.VistaDisponibilidadSecuencias;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class ControladorDisponibilidad implements MouseListener, MouseMotionListener{
    ModeloExcel modeloE = new ModeloExcel();
    VistaDisponibilidadSecuencias vistaD = new VistaDisponibilidadSecuencias();
    ArrayList<String[]> listaBasicasIngenieria = new ArrayList<>();
    ArrayList<String[]> listaComputacion = new ArrayList<>();
    ArrayList<String[]> listaInformatica = new ArrayList<>();
    ArrayList<String[]> listaIngIndustrial = new ArrayList<>();
    ArrayList<String[]> listaInvOperaciones = new ArrayList<>();
    ArrayList<String[]> listaProduccion = new ArrayList<>();
    ArrayList<String[]> listaTransporte = new ArrayList<>();
    //ALmacenar posicion de mouse
    int xMouse;
    int yMouse;

    public ControladorDisponibilidad() {
    }

    public ControladorDisponibilidad(VistaDisponibilidadSecuencias vistaD,ModeloExcel modelE) {
        this.modeloE = modelE;
        this.vistaD = vistaD;        
        this.vistaD.lblCerrar.addMouseListener(this);
        this.vistaD.lblMinimizar.addMouseListener(this);
        this.vistaD.paneBackground.addMouseListener(this);
        this.vistaD.paneBackground.addMouseMotionListener(this);
    }         
    
    public void iniciar(){
        vistaD.setTitle("Disponibilidad de Horarios");
        vistaD.setLocationRelativeTo(null);
        //vistaD.txtSecuencias.setEnabled(false);
    }    
    
    public void disponibilidad(String dia){         
                switch(dia){
                    case "Lunes":
                            vistaD.lblTitulo.setText("Horarios Disponibles Lunes");
                            listaBasicasIngenieria = modeloE.disponibilidadBasicasIngenieriaLunes();
                            listaComputacion = modeloE.disponibilidadComputacionLunes();
                            listaInformatica = modeloE.disponibilidadInformaticaLunes();
                            listaIngIndustrial = modeloE.disponibilidadIngIndustrialLunes();
                            listaInvOperaciones = modeloE.disponibilidadInvOperacionesLunes();
                            listaProduccion = modeloE.disponibilidadProduccionLunes();
                            listaTransporte = modeloE.disponibilidadSistemasTransporteLunes();                            
                        break;
                    case "Martes":
                            vistaD.lblTitulo.setText("Horarios Disponibles Martes");
                            listaBasicasIngenieria = modeloE.disponibilidadBasicasIngenieriaMartes();
                            listaComputacion = modeloE.disponibilidadComputacionMartes();
                            listaInformatica = modeloE.disponibilidadInformaticaMartes();
                            listaIngIndustrial = modeloE.disponibilidadIngIndustrialMartes();
                            listaInvOperaciones = modeloE.disponibilidadInvOperacionesMartes();
                            listaProduccion = modeloE.disponibilidadProduccionMartes();
                            listaTransporte = modeloE.disponibilidadSistemasTransporteMartes();                            
                        break;
                    case "Miercoles":
                            vistaD.lblTitulo.setText("Horarios Disponibles Miércoles");
                            listaBasicasIngenieria = modeloE.disponibilidadBasicasIngenieriaMiercoles();
                            listaComputacion = modeloE.disponibilidadComputacionMiercoles();
                            listaInformatica = modeloE.disponibilidadInformaticaMiercoles();
                            listaIngIndustrial = modeloE.disponibilidadIngIndustrialMiercoles();
                            listaInvOperaciones = modeloE.disponibilidadInvOperacionesMiercoles();
                            listaProduccion = modeloE.disponibilidadProduccionMiercoles();
                            listaTransporte = modeloE.disponibilidadSistemasTransporteMiercoles();                            
                        break;
                    case "Jueves":
                            vistaD.lblTitulo.setText("Horarios Disponibles Jueves");
                            listaBasicasIngenieria = modeloE.disponibilidadBasicasIngenieriaJueves();
                            listaComputacion = modeloE.disponibilidadComputacionJueves();
                            listaInformatica = modeloE.disponibilidadInformaticaJueves();
                            listaIngIndustrial = modeloE.disponibilidadIngIndustrialJueves();
                            listaInvOperaciones = modeloE.disponibilidadInvOperacionesJueves();
                            listaProduccion = modeloE.disponibilidadProduccionJueves();
                            listaTransporte = modeloE.disponibilidadSistemasTransporteJueves();                            
                        break;
                    case "Viernes":
                            vistaD.lblTitulo.setText("Horarios Disponibles Viernes");
                            listaBasicasIngenieria = modeloE.disponibilidadBasicasIngenieriaViernes();
                            listaComputacion = modeloE.disponibilidadComputacionViernes();
                            listaInformatica = modeloE.disponibilidadInformaticaViernes();
                            listaIngIndustrial = modeloE.disponibilidadIngIndustrialViernes();
                            listaInvOperaciones = modeloE.disponibilidadInvOperacionesViernes();
                            listaProduccion = modeloE.disponibilidadProduccionViernes();
                            listaTransporte = modeloE.disponibilidadSistemasTransporteViernes();                            
                        break;
                    default:
                        System.out.println("No existe dia");
                        break;
                }
                
                vistaD.txtSecuencias.setText("\t-----Academia de Ciencias Básicas de la Ingeniería-----\n"+
                                     "\nSalón: " + Arrays.toString(listaBasicasIngenieria.get(0))+
                                     "\n\nSalón: " + Arrays.toString(listaBasicasIngenieria.get(1))+
                                     "\n\nSalón: " + Arrays.toString(listaBasicasIngenieria.get(2))+
                                     "\n\nSalón: " + Arrays.toString(listaBasicasIngenieria.get(3))+
                                     "\n\nSalón: " + Arrays.toString(listaBasicasIngenieria.get(4))+
                                     "\n\n\n\t-----Academia de Computación-----\n"+
                                     "\nSalón: " + Arrays.toString(listaComputacion.get(0))+
                                     "\n\nSalón: " + Arrays.toString(listaComputacion.get(1))+
                                     "\n\nSalón: " + Arrays.toString(listaComputacion.get(2))+
                                     "\n\nSalón: " + Arrays.toString(listaComputacion.get(3))+
                                     "\n\nSalón: " + Arrays.toString(listaComputacion.get(4))+
                                     "\n\nSalón: " + Arrays.toString(listaComputacion.get(5))+
                                     "\n\nSalón: " + Arrays.toString(listaComputacion.get(6))+
                                     "\n\nSalón: " + Arrays.toString(listaComputacion.get(7))+
                                     "\n\nSalón: " + Arrays.toString(listaComputacion.get(8))+
                                     "\n\nSalón: " + Arrays.toString(listaComputacion.get(9))+
                                     "\n\n\n\t-----Academia de Informática-----\n"+
                                     "\nSalón: " + Arrays.toString(listaInformatica.get(0))+
                                     "\n\nSalón: " + Arrays.toString(listaInformatica.get(1))+
                                     "\n\nSalón: " + Arrays.toString(listaInformatica.get(2))+
                                     "\n\nSalón: " + Arrays.toString(listaInformatica.get(3))+
                                     "\n\nSalón: " + Arrays.toString(listaInformatica.get(4))+
                                     "\n\nSalón: " + Arrays.toString(listaInformatica.get(5))+
                                     "\n\nSalón: " + Arrays.toString(listaInformatica.get(6))+
                                     "\n\nSalón: " + Arrays.toString(listaInformatica.get(7))+
                                     "\n\nSalón: " + Arrays.toString(listaInformatica.get(8))+
                                     "\n\n\n\t-----Academia de Ingeniería Industrial-----\n"+
                                     "\nSalón: " + Arrays.toString(listaIngIndustrial.get(0))+
                                     "\n\nSalón: " + Arrays.toString(listaIngIndustrial.get(1))+
                                     "\n\nSalón: " + Arrays.toString(listaIngIndustrial.get(2))+
                                     "\n\nSalón: " + Arrays.toString(listaIngIndustrial.get(3))+
                                     "\n\nSalón: " + Arrays.toString(listaIngIndustrial.get(4))+
                                     "\n\nSalón: " + Arrays.toString(listaIngIndustrial.get(5))+
                                     "\n\nSalón: " + Arrays.toString(listaIngIndustrial.get(6))+
                                     "\n\n\n\t-----Academia de Investigación de Operaciones-----\n"+
                                     "\nSalón: " + Arrays.toString(listaInvOperaciones.get(0))+
                                     "\n\nSalón: " + Arrays.toString(listaInvOperaciones.get(1))+
                                     "\n\nSalón: " + Arrays.toString(listaInvOperaciones.get(2))+
                                     "\n\nSalón: " + Arrays.toString(listaInvOperaciones.get(3))+
                                     "\n\nSalón: " + Arrays.toString(listaInvOperaciones.get(4))+
                                     "\n\nSalón: " + Arrays.toString(listaInvOperaciones.get(5))+
                                     "\n\nSalón: " + Arrays.toString(listaInvOperaciones.get(6))+
                                     "\n\nSalón: " + Arrays.toString(listaInvOperaciones.get(7))+
                                     "\n\n\n\t-----Academia de Producción-----\n"+
                                     "\nSalón: " + Arrays.toString(listaProduccion.get(0))+
                                     "\n\nSalón: " + Arrays.toString(listaProduccion.get(1))+
                                     "\n\nSalón: " + Arrays.toString(listaProduccion.get(2))+
                                     "\n\nSalón: " + Arrays.toString(listaProduccion.get(3))+
                                     "\n\nSalón: " + Arrays.toString(listaProduccion.get(4))+
                                     "\n\nSalón: " + Arrays.toString(listaProduccion.get(5))+
                                     "\n\nSalón: " + Arrays.toString(listaProduccion.get(6))+
                                     "\n\n\n\t-----Academia de Sistemas de Transporte-----\n"+
                                     "\nSalón: " + Arrays.toString(listaTransporte.get(0))+
                                     "\n\nSalón: " + Arrays.toString(listaTransporte.get(1))+
                                     "\n\nSalón: " + Arrays.toString(listaTransporte.get(2))+
                                     "\n\nSalón: " + Arrays.toString(listaTransporte.get(3))+
                                     "\n\nSalón: " + Arrays.toString(listaTransporte.get(4))+
                                     "\n\nSalón: " + Arrays.toString(listaTransporte.get(5)));                                                            
    } 
             
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vistaD.lblCerrar){           
                vistaD.dispose();            
        }
        if(e.getSource() == vistaD.lblMinimizar){
            vistaD.setExtendedState(ICONIFIED);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == vistaD.paneBackground) {
            xMouse = e.getX();
            yMouse = e.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }   
    
    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == vistaD.paneBackground) {
            int x = e.getXOnScreen();
            int y = e.getYOnScreen();
            vistaD.setLocation(x - xMouse , y - yMouse);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}