/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giorgos
 */
public class ConcreteProduct {      // ConcreteSubject
    
    private Product product;        // it has a state
    
    private List<Customer> observers = new ArrayList();
    
    
    public ConcreteProduct() {
        this.product = new Product();
    }
    
    public void addObserver(Customer observer) {
        this.observers.add(observer);
    }
    
    public void removeObserver(Customer observer) {
        this.observers.remove(observer);
    }
    
    public void setProduct(String name, int quantity, String color, String size){
        Product newProduct = new Product(name, quantity, color, size);
        if (!(this.product.equals(newProduct))) {
            
            this.product = newProduct;
            
            for(Customer customer : observers) {
                System.out.println("Updating product for customer");
                customer.update(product);
            }
        }
    }
    
     
    /*
    This is the Observable class. 
    
    - It has a state
    - It has a list of observers
    - It has methods to add / remove observers
    - It has a method to set it's state, and notify observers.
    
    When the state (product) gets updated, the class
    notifies the observers about this fact by calling their update() method.
    
    */

   
    
    
    
    
    
    
}
