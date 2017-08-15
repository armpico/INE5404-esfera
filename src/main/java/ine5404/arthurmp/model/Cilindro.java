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
public class Cilindro extends Circulo {
    private double altura;

    public Cilindro(double altura, double raio) {
        super(raio);
        this.altura = altura;
    }
    
    public double getArea(){
        return 2*Math.PI*raio*(altura+raio);
    }
    
    public double getVolume(){
        return (Math.PI*raio*raio*altura);
    }
}
