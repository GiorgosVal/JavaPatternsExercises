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
public class Electrician implements Repair {

    @Override
    public void fixit() {
        System.out.println("I changed the fuses inside your electrical panel.");
    }
    
}
