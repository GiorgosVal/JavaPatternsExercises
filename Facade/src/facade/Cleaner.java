/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author giorgos
 */
public class Cleaner extends Employee {

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(this.getName() + " does accounting stuff.");
    }

    @Override
    public void takeABreak() {
        System.out.println(this.getName() + " usually takes a 30-minute break.");
    }
    
    
    
}
