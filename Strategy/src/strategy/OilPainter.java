/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author giorgos
 */
public class OilPainter implements Repair {

    @Override
    public void fixit() {
        System.out.println("Don't worry about these little chaps, I'll paint the"
                + " wall for you!");
    }
    
}
