/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

/**
 *
 * @author mforte
 */
public class Animale {
    private String nome;
    private double spazio; // dimensione della cuccia
    private double cibo;   // quantità di cibo giornaliera
    private char dieta;    // tipo di cibo che mangia
    Animale(String nome){
        this.nome=nome; spazio=cibo=1.0;dieta='A';}

    public String getNome()  { return nome;    }
    public double getSpazio(){ return spazio;  }
    public double getCibo()  { return cibo;    }
    public char getDieta()   { return dieta;   }

    public String parla(){ return "...";}
}
