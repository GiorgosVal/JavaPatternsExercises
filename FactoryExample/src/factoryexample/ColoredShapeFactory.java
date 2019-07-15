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
public class ColoredShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Shape getColoredShape(String shape, String color) {
        if (shape == null)
    }
    
}
