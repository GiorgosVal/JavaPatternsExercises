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
public class Repairman {
    private Repair repair;
    
    public Repairman(Repair repair) {
        this.repair = repair;
    }
    
    public void repair() {
        repair.fixit();
    }
    
}
