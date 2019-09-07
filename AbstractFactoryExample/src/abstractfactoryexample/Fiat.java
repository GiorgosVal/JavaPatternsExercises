/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryexample;

/**
 *
 * @author giorgos
 */
public class Fiat extends Car {

    public Fiat(String brand, int year, String color, boolean hasABS) {
        super(brand, year, color, hasABS);
    }

    @Override
    void speedUp() {
        System.out.println("Speeds up slowly...");
    }
    
}
