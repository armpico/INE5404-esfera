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
public class Circulo {
    protected double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public double getArea(){
        return Math.PI*raio*raio;
    }
}
