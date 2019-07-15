/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexample;

/**
 *
 * @author giorgos
 */
public class ConcreteCustomer implements Customer{
    private Product product;
    
    
    @Override
    public void update(Product product) {
        this.product = product;
        System.out.println("Product state: " + product);
    }
    
}


/*
The ConcreteObserver class:

- keeps a copy of the state of ConcreteSubject
- implements the update() method of Observer interface


Automatically displays the state and reflects changes whenever the state is updated.




*/