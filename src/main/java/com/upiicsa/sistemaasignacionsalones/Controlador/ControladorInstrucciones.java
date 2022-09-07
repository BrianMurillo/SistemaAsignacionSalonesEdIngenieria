package com.upiicsa.sistemaasignacionsalones.Controlador;
import com.upiicsa.sistemaasignacionsalones.Vista.VistaInstrucciones;
import java.awt.Color;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class ControladorInstrucciones implements ActionListener, MouseListener{
    
    private VistaInstrucciones vistaInstrucciones = new VistaInstrucciones();
    private String ruta;
    private String color;

    public ControladorInstrucciones(VistaInstrucciones vistaInstrucciones, String ruta, String color) {
        this.ruta = ruta;
        this.color = color;
        this.vistaInstrucciones = vistaInstrucciones;
        this.vistaInstrucciones.btnAceptar.addActionListener(this);
        this.vistaInstrucciones.lblCerrar.addMouseListener(this);
        this.vistaInstrucciones.lblMinimizar.addMouseListener(this);
    }

    public ControladorInstrucciones() {
    }
    
    public void iniciar(){
        vistaInstrucciones.setLocationRelativeTo(null);
        vistaInstrucciones.lblImagen.setIcon(new ImageIcon(ruta));
        vistaInstrucciones.paneBackground.setBackground(Color.decode(color));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vistaInstrucciones.btnAceptar){
            vistaInstrucciones.dispose();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vistaInstrucciones.lblCerrar){
            vistaInstrucciones.dispose();
        }
        
        if(e.getSource() == vistaInstrucciones.lblMinimizar){
            vistaInstrucciones.setExtendedState(ICONIFIED);
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