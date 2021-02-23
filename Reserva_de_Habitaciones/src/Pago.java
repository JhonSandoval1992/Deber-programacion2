
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferch
 */
public class Pago {
  private String Nombre;
  private String C,I;
  private String Descripcion;
  private Date FechaPago;
  private  String TotalPago;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getC() {
        return C;
    }

    public void setC(String C) {
        this.C = C;
    }

    public String getI() {
        return I;
    }

    public void setI(String I) {
        this.I = I;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFechaPago() {
        return FechaPago;
    }

    public void setFechaPago(Date FechaPago) {
        this.FechaPago = FechaPago;
    }

    public String getTotalPago() {
        return TotalPago;
    }

    public void setTotalPago(String TotalPago) {
        this.TotalPago = TotalPago;
    }
  
  
  
  
}
