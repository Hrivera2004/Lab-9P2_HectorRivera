/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg9p2_hectorrivera;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author hriverav
 */
public class fecha extends Thread {

    private Date fecha;
    private SimpleDateFormat fechaActual = new SimpleDateFormat("yyyy-MM-dd");
    private SimpleDateFormat tiempoActual = new SimpleDateFormat("HH:mm:ss");
    private JLabel hour;
    private JLabel mes;

    public fecha(JLabel hour, JLabel mes) {
        this.hour = hour;
        this.mes = mes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public SimpleDateFormat getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(SimpleDateFormat fechaActual) {
        this.fechaActual = fechaActual;
    }

    public SimpleDateFormat getTiempoActual() {
        return tiempoActual;
    }

    public void setTiempoActual(SimpleDateFormat tiempoActual) {
        this.tiempoActual = tiempoActual;
    }

    public JLabel getHour() {
        return hour;
    }

    public void setHour(JLabel hour) {
        this.hour = hour;
    }

    public JLabel getMes() {
        return mes;
    }

    public void setMes(JLabel mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "fecha{" + "fecha=" + fecha + ", fechaActual=" + fechaActual + ", tiempoActual=" + tiempoActual + ", hour=" + hour + ", mes=" + mes + '}';
    }

    @Override
    public void run() {
        while (true) {
            fecha = new Date();
            mes.setText(fechaActual.format(fecha));
            hour.setText(tiempoActual.format(fecha));
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println("thread exploto");
            }

        }
    }

}
