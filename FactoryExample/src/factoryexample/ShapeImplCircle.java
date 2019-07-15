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
public class ShapeImplCircle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }


}
