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
public class FactoryExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        
        
        
        
        
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
        
        Shape square = shapeFactory.getShape("square");
        square.draw();
    }
    
}
