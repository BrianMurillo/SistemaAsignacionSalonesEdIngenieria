package com.upiicsa.sistemaasignacionsalones.Controlador;
import com.upiicsa.sistemaasignacionsalones.Modelo.ModeloExcel;
import com.upiicsa.sistemaasignacionsalones.Vista.VistaExcel;
import com.upiicsa.sistemaasignacionsalones.Vista.VistaPreloading;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class ControladorPreloading {

    VistaPreloading vistaPreloading = new VistaPreloading();
    
    
    public ControladorPreloading(VistaPreloading vistaPreloading) {
        this.vistaPreloading = vistaPreloading;
    }

    public void iniciar(){
        vistaPreloading.setLocationRelativeTo(null);
        threadPreloading();        
    }
    
    public void threadPreloading(){
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);
                vistaPreloading.ProgressBar.setValue(i);
                vistaPreloading.lblPorcentaje.setText(Integer.toString(i) + "%");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }  
        VistaExcel vista = new VistaExcel();
        ModeloExcel modelo = new ModeloExcel();
        ControladorExcel ctrlExcel = new ControladorExcel(vista, modelo);
        ctrlExcel.iniciar();
        vista.setVisible(true);
        vistaPreloading.dispose();      
    }
}