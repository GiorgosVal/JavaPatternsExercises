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
public class Man extends Person {
    
    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    void musclePower() {
        System.out.println("A man is strong.");
    }
    
}
