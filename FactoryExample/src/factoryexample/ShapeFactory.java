/*
 * code used from
 * https://www.tutorialspoint.com/design_pattern/factory_pattern
 * 
 */
package factoryexample;

/**
 *
 * @author giorgos
 */
public class ShapeFactory extends AbstractFactory {
    
    @Override
    public Shape getShape(String shape) {
        if(shape == null) {
            return null;
        }
        
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new ShapeImplCircle();
        }
        
        if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new ShapeImplRectangle();
        }
        
        if (shape.equalsIgnoreCase("SQUARE")) {
            return new ShapeImplSquare();
        }
        
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getColoredShape(String shape, String color) {
        return null;
    }

    
}
