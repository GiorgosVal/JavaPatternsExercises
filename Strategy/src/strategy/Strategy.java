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
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Repairman repairman = new Repairman(new Electrician());
        repairman.repair();
        repairman = new Repairman(new Plumber());
        repairman.repair();
        repairman = new Repairman(new OilPainter());
        repairman.repair();
    }
    
}


/*
Strategy pattern is used when we have multiple algorithm for a specific task
and the client decides the actual implementation to be used at runtime.

In Strategy pattern we have:

- A Strategy interface which declares an abstract method. In our example, the
strategy interface is the Repair interface.

- Concrete classes which implement the Strategy pattern and provide different
implementation for the abstract method of strategy interface. Here, the concrete
classes are the Electrician, Plumber and OilPainter classes.

- A Context class which uses the Strategy interface (has it as instance variable).
The Context class provides a method that accepts the Strategy variable and
calls the method of the interface. Here the Context class is the Repainman. 


*/