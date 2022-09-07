package com.upiicsa.sistemaasignacionsalones.Modelo.Estilos;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
/**
 *
 * @author Brian Murillo, Dante Baños 
 * Tester and documentation: Eduardo Campos, Arely Cuellar ,Yael Rebollar
 */
public class EstiloMateria{
    
    private Font fontBody;
    private CellStyle bodyStyle;
    private CellStyle styleTop;
    private CellStyle styleBottom;
    CellStyle salonStyle;
    
    public CellStyle bodyStyle(Workbook wb, IndexedColors indexedColors){
        bodyStyle = wb.createCellStyle();
        bodyStyle.setFillForegroundColor(indexedColors.getIndex());
        bodyStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        bodyStyle.setBorderLeft(BorderStyle.MEDIUM);
        bodyStyle.setBorderRight(BorderStyle.MEDIUM);
        bodyStyle.setAlignment(HorizontalAlignment.CENTER);
        fontBody = wb.createFont();
        fontBody.setFontName("Calibri");
        fontBody.setBold(true);
        fontBody.setFontHeightInPoints((short) 9);
        bodyStyle.setFont(fontBody);
        return bodyStyle;
    }
    
    public CellStyle styleTop(Workbook wb, IndexedColors indexedColors){
        styleTop = wb.createCellStyle();
        styleTop.setFillForegroundColor(indexedColors.getIndex());
        styleTop.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        styleTop.setBorderTop(BorderStyle.MEDIUM);
        styleTop.setBorderLeft(BorderStyle.MEDIUM);
        styleTop.setBorderRight(BorderStyle.MEDIUM);
        styleTop.setAlignment(HorizontalAlignment.CENTER);
        Font fontBodyTop = wb.createFont();
        fontBodyTop.setFontName("Calibri");
        fontBodyTop.setBold(true);
        fontBodyTop.setFontHeightInPoints((short) 9);
        styleTop.setFont(fontBodyTop);
        return styleTop;
    }
    
    public CellStyle styleBottom(Workbook wb, IndexedColors indexedColors){
        styleBottom = wb.createCellStyle();
        styleBottom.setFillForegroundColor(indexedColors.getIndex());
        styleBottom.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        styleBottom.setBorderBottom(BorderStyle.MEDIUM);
        styleBottom.setBorderLeft(BorderStyle.MEDIUM);
        styleBottom.setBorderRight(BorderStyle.MEDIUM);
        styleBottom.setAlignment(HorizontalAlignment.CENTER);
        Font fontBodyBottom = wb.createFont();
        fontBodyBottom.setFontName("Calibri");
        fontBodyBottom.setBold(true);
        fontBodyBottom.setFontHeightInPoints((short) 9);
        styleBottom.setFont(fontBodyBottom);
        return styleBottom;
    }    
    
    public CellStyle styleNombreSalon(Workbook wb){
        salonStyle = wb.createCellStyle();
        salonStyle.setAlignment(HorizontalAlignment.CENTER);
        Font fontSalon = wb.createFont();
        fontSalon.setFontName("Calibri");
        fontSalon.setBold(true);
        fontSalon.setItalic(true);
        fontSalon.setFontHeightInPoints((short) 14);
        salonStyle.setFont(fontSalon);
        return salonStyle;
    }
}