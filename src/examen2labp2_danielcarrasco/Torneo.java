/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2labp2_danielcarrasco;

import java.util.ArrayList;

public class Torneo {
    String nombreT;
    ArrayList <Equipos> equiposParticipantes= new ArrayList();
    ArrayList <Partidos> Partidos= new ArrayList();

    public Torneo() {
    }

    public Torneo(String nombreT) {
        this.nombreT = nombreT;
    }
    
    public String getNombreT() {
        return nombreT;
    }

    public void setNombreT(String nombreT) {
        this.nombreT = nombreT;
    }

    public ArrayList<Equipos> getEquiposParticipantes() {
        return equiposParticipantes;
    }

    public void setEquiposParticipantes(ArrayList<Equipos> equiposParticipantes) {
        this.equiposParticipantes = equiposParticipantes;
    }

    public ArrayList<Partidos> getPartidos() {
        return Partidos;
    }

    public void setPartidos(ArrayList<Partidos> Partidos) {
        this.Partidos = Partidos;
    }
}
