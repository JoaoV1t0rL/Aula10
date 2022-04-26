/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Vitor
 */
public class Horario {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Horario(){
        hora = 0; minuto = 0; segundo = 0;
    }
    
    public Horario(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto; 
        this.segundo = segundo; 
    }
    
    public void setTempo(int hora, int minuto, int segundo){
        if(segundo >= 60){
            minuto += 1;
        } else if (minuto >= 60){
            hora += 1;
        } else if (hora >= 24) {
            hora = 00;
        }
        
        this.hora = hora;
        this.minuto = minuto; 
        this.segundo = segundo; 
    }
    
    public String retornoString() {
        return hora + ":" + minuto + ":" + segundo;
    }
    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
}    
