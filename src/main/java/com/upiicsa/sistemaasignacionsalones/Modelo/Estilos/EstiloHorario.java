package com.upiicsa.sistemaasignacionsalones.Modelo.Estilos;
import com.upiicsa.sistemaasignacionsalones.Modelo.Horario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.Picture;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.IOUtils;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class EstiloHorario {
    //Horarios
    Horario horario = new Horario();
    String [] listaHorarios = horario.getHorarios();
    //Objetos para creacion de imagen en excel
    CreationHelper help;
    Drawing draw;
    ClientAnchor anchor;
    Picture pict;
    InputStream inputStream;    
    byte[] bytes;
    int imgIndex;
    
    
    public void agregarDiseñoEncabezado(Workbook wb, Sheet hoja, String periodoEscolar) throws FileNotFoundException, IOException {
        Row filasEncabezado;
        InputStream inputStream;
        Row fila = hoja.createRow(0);            
            //Imagen ipn
            inputStream = new FileInputStream("C://imgsistemasalones/ipn.png");
            bytes = IOUtils.toByteArray(inputStream);
            imgIndex = wb.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);
            inputStream.close();            
            //Alinear a la izquierda
            help = wb.getCreationHelper();
            draw = hoja.createDrawingPatriarch();
            anchor = help.createClientAnchor();
            anchor.setCol1(0);
            anchor.setRow1(1);
            pict = draw.createPicture(anchor, imgIndex);
            pict.resize(1, 4);  
            
            //Imagen upiicsa
            inputStream = new FileInputStream("C://imgsistemasalones/upiicsa.png");
            bytes = IOUtils.toByteArray(inputStream);
            imgIndex = wb.addPicture(bytes, Workbook.PICTURE_TYPE_PNG);
            inputStream.close();            
            //Alinear a la derecha
            help = wb.getCreationHelper();
            draw = hoja.createDrawingPatriarch();
            anchor = help.createClientAnchor();
            anchor.setCol1(5);
            anchor.setRow1(1);
            pict = draw.createPicture(anchor, imgIndex);
            pict.resize(.99, 3);
            
            //Alinear texto
            CellStyle tituloEstilo = wb.createCellStyle();
            tituloEstilo.setAlignment(HorizontalAlignment.CENTER);
            tituloEstilo.setVerticalAlignment(VerticalAlignment.CENTER);          
            //Estilo texto nombre escuela
            Font fuenteTitulo = wb.createFont();
            fuenteTitulo.setFontName("Calibri");
            fuenteTitulo.setBold(true);
            fuenteTitulo.setFontHeightInPoints((short) 14);
            tituloEstilo.setFont(fuenteTitulo);
            
            //Alinear texto 
            CellStyle subtituloEstilo = wb.createCellStyle();
            subtituloEstilo.setAlignment(HorizontalAlignment.CENTER);
            subtituloEstilo.setVerticalAlignment(VerticalAlignment.CENTER);          
            //Estilo texto subtitulo
            Font fuenteSubtitulo = wb.createFont();
            fuenteSubtitulo.setFontName("Calibri");
            fuenteSubtitulo.setBold(false);
            fuenteSubtitulo.setFontHeightInPoints((short) 11);
            subtituloEstilo.setFont(fuenteSubtitulo);
            
            //Nombre Escuela
            filasEncabezado = hoja.createRow(1);
            Cell celdaTitulo = filasEncabezado.createCell(1);
            celdaTitulo.setCellStyle(tituloEstilo);
            celdaTitulo.setCellValue("Unidad Profesional Interdisciplinaria de Ingeniería y Ciencias  Sociales y Administrativas");
            hoja.addMergedRegion(new CellRangeAddress(1, 1, 1, 4));            
            
            //subtitulo
            filasEncabezado = hoja.createRow(2);
            Cell celdaSubTitulo = filasEncabezado.createCell(1);
            celdaSubTitulo.setCellStyle(subtituloEstilo);
            celdaSubTitulo.setCellValue("SUBDIRECCIÓN ACADÉMICA");
            hoja.addMergedRegion(new CellRangeAddress(2, 2, 1, 4));   
            
            //Departamento
            filasEncabezado = hoja.createRow(3);
            Cell celdaDepartamento = filasEncabezado.createCell(1);
            celdaDepartamento.setCellStyle(tituloEstilo);
            celdaDepartamento.setCellValue("Departamento de Desarrollo Profesional Específico");
            hoja.addMergedRegion(new CellRangeAddress(3, 3, 1, 4));            
            
            //Periodo
            filasEncabezado = hoja.createRow(4);
            Cell celdaPeriodo = filasEncabezado.createCell(1);
            celdaPeriodo.setCellStyle(tituloEstilo);
            celdaPeriodo.setCellValue("Ciclo Escolar: "+periodoEscolar);
            hoja.addMergedRegion(new CellRangeAddress(4, 4, 1, 2));            
            //Academia
            Cell celdaAcademia = filasEncabezado.createCell(3);
            celdaAcademia.setCellStyle(tituloEstilo);
            celdaAcademia.setCellValue("ACADEMIA ");
            hoja.addMergedRegion(new CellRangeAddress(4, 4, 3, 4));
                        
            //Encabezado tabla            
            String[] cabecera = new String[]{"  HORARIO  ", "              Lunes             ", "             Martes             ", "           Miércoles           ", "             Jueves             ", "            Viernes           "};
            //Estilo cabecero
            CellStyle headerStyle = wb.createCellStyle();
            headerStyle.setBorderBottom(BorderStyle.MEDIUM);
            headerStyle.setBorderLeft(BorderStyle.MEDIUM);
            headerStyle.setBorderRight(BorderStyle.MEDIUM);
            headerStyle.setBorderTop(BorderStyle.MEDIUM);
            headerStyle.setAlignment(HorizontalAlignment.CENTER);            
            Font font = wb.createFont();
            font.setFontName("Calibri");
            font.setBold(true);
            font.setFontHeightInPoints((short) 14);
            headerStyle.setFont(font);
            
            //Horario estilo
            CellStyle horarioStyle = wb.createCellStyle();
            horarioStyle.setBorderBottom(BorderStyle.MEDIUM);
            horarioStyle.setBorderLeft(BorderStyle.MEDIUM);
            horarioStyle.setBorderRight(BorderStyle.MEDIUM);
            horarioStyle.setBorderTop(BorderStyle.MEDIUM);
            horarioStyle.setAlignment(HorizontalAlignment.CENTER);            
            Font fonthorario = wb.createFont();
            fonthorario.setFontName("Calibri");
            fonthorario.setBold(false);
            fonthorario.setFontHeightInPoints((short) 11);
            horarioStyle.setFont(fonthorario);
            
            //Agregar cabecera
            Row filaEncabezado = hoja.createRow(6);
            for (int k = 0; k < cabecera.length; k++) {
                Cell celdaEncabezado = filaEncabezado.createCell(k);
                celdaEncabezado.setCellStyle(headerStyle);
                celdaEncabezado.setCellValue(cabecera[k]);
            }
            
            //Insertar horarios en la columna horario
            int contador= 0;
            for (int k = 7; k < listaHorarios.length+7; k++) {
                Row filaCuerpo = hoja.createRow(k);
                Cell celdaCuerpo = filaCuerpo.createCell(0);
                celdaCuerpo.setCellStyle(horarioStyle);
                celdaCuerpo.setCellValue(listaHorarios[contador]);
                contador++;
            }  
            //Fila extra para el nombre del salon
            Row filaCuerpo = hoja.createRow(37);
            
            //Darles un borde a las celdas vacias
            for (int i = 7; i < listaHorarios.length+7; i++) {
                for (int j = 1; j < 6; j++) {
                    Row filaCuerpoHoja = hoja.getRow(i);
                    Cell celdaCuerpoHoja = filaCuerpoHoja.createCell(j);
                    celdaCuerpoHoja.setCellStyle(horarioStyle);
                }
            } 
    }
    
    public void ajustarAnchoColumna(Sheet hoja){
        //Las columnas se ajustaran al contenido
            hoja.autoSizeColumn(0);
            hoja.autoSizeColumn(1);
            hoja.autoSizeColumn(2);
            hoja.autoSizeColumn(3);
            hoja.autoSizeColumn(4);
            hoja.autoSizeColumn(5);
    }
}