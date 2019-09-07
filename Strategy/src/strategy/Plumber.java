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
public class Plumber implements Repair {

    @Override
    public void fixit() {
        System.out.println("We had a water leackage but now it's OK!");
    }
    
}
