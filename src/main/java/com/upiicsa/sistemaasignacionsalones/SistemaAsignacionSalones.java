package com.upiicsa.sistemaasignacionsalones;
import com.upiicsa.sistemaasignacionsalones.Controlador.ControladorPreloading;
import com.upiicsa.sistemaasignacionsalones.Vista.VistaPreloading;
/**
 * 
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class SistemaAsignacionSalones {
    
    public static void main(String[] args) {
        VistaPreloading vistaPreloading = new VistaPreloading();
        ControladorPreloading ctrlPreloading = new ControladorPreloading(vistaPreloading);
        vistaPreloading.setVisible(true);
        ctrlPreloading.iniciar();        
    }    
    
}