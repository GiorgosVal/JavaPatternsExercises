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
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("red")) {
            return new ColorImplRed();
        }

        if (color.equalsIgnoreCase("green")) {
            return new ColorImplGreen();
        }

        if (color.equalsIgnoreCase("blue")) {
            return new ColorImplBlue();
        }
        
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Shape getColoredShape(String shape, String color) {
        return null;
    }

}
