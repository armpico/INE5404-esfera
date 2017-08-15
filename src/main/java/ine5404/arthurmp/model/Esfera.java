/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.arthurmp.model;

/**
 *
 * @author pixels
 */
public class Esfera extends Circulo {

    public Esfera(double raio) {
        super(raio);
    }
    
    public double getArea(){
        return 4*Math.PI*raio*raio;
    }
    
    public double getVolume(){
        return (4*Math.PI*raio*raio*raio)/3;
    }
}
