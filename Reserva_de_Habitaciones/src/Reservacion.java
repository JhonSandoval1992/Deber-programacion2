
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
public class Reservacion {
    private String Reservacion;
    private Date FechaIngredo;
    private Date FechaSalida;
    private String Cantidad;
    private String TipoHabitacion;
    private Integer Idcliente;

    public String getReservacion() {
        return Reservacion;
    }

    public void setReservacion(String Reservacion) {
        this.Reservacion = Reservacion;
    }

    public Date getFechaIngredo() {
        return FechaIngredo;
    }

    public void setFechaIngredo(Date FechaIngredo) {
        this.FechaIngredo = FechaIngredo;
    }

    public Date getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(Date FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getTipoHabitacion() {
        return TipoHabitacion;
    }

    public void setTipoHabitacion(String TipoHabitacion) {
        this.TipoHabitacion = TipoHabitacion;
    }

    public Integer getIdcliente() {
        return Idcliente;
    }

    public void setIdcliente(Integer Idcliente) {
        this.Idcliente = Idcliente;
    }
    
}
