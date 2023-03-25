/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2labp2_danielcarrasco;

//import java.io.Serializable;
import java.util.ArrayList;

public class Deporte {
    String nombreD;
    ArrayList <Torneo> torneos= new ArrayList();
    String periodo;

    public Deporte(String nombreD, String periodo) {
        this.nombreD = nombreD;
        this.periodo = periodo;
    }

    public Deporte() {
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    
    
    
}
