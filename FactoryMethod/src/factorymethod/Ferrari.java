/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author giorgos
 */
public class Ferrari extends Car {

    
    public Ferrari(String brand, int year, String color, boolean hasABS) {
        super(brand, year, color, hasABS);
    }
    
    
    @Override
    void speedUp() {
        System.out.println("Speeds up very fast!");
    }
    
    
    
}
