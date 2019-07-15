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
public class ColorImplGreen implements Color {

    @Override
    public void fill() {
        System.out.println("We paint in green");
    }
    
}
