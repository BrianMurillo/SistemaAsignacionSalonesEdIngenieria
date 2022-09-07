package com.upiicsa.sistemaasignacionsalones.Controlador;
import com.upiicsa.sistemaasignacionsalones.Vista.VistaAcercaDe;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class ControladorAcercaDe implements MouseListener{
    
    private VistaAcercaDe vistaAcercaDe = new VistaAcercaDe();

    public ControladorAcercaDe(VistaAcercaDe vistaAcercaDe) {
        this.vistaAcercaDe = vistaAcercaDe;
        this.vistaAcercaDe.lblCerrar.addMouseListener(this);
    }

    public ControladorAcercaDe() {
    }        
    
    public void iniciar(){
        vistaAcercaDe.setLocationRelativeTo(null);
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vistaAcercaDe.lblCerrar){            
                vistaAcercaDe.dispose();             
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
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
    
}
