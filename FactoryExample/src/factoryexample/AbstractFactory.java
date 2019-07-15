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
public abstract class AbstractFactory {
    
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
    abstract Shape getColoredShape(String shape, String color);
    
    
    
}
