/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryexample;

/**
 *
 * @author giorgos
 */
public class FactoryProducer {
    
    public static AbstractFactory getFactory(String choise) {
        if(choise.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        }
        
        if (choise.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        
        return null;
    }
    
}
