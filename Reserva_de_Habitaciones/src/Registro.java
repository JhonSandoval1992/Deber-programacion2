
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
public class Registro {
    private String CantidadPer;
    private String TipoHabitacion;
    private Date FechaIngreso;
    private Date FechaSalida;
    private Integer Idcliente;
    private Integer Idreserva;

    public String getCantidadPer() {
        return CantidadPer;
    }

    public void setCantidadPer(String CantidadPer) {
        this.CantidadPer = CantidadPer;
    }

    public String getTipoHabitacion() {
        return TipoHabitacion;
    }

    public void setTipoHabitacion(String TipoHabitacion) {
        this.TipoHabitacion = TipoHabitacion;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Date FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Date FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public Integer getIdcliente() {
        return Idcliente;
    }

    public void setIdcliente(Integer Idcliente) {
        this.Idcliente = Idcliente;
    }

    public Integer getIdreserva() {
        return Idreserva;
    }

    public void setIdreserva(Integer Idreserva) {
        this.Idreserva = Idreserva;
    }
    
            
    
    
}
