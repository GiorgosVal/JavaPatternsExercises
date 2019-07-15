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
public class ObserverExample {
    
    public static void main (String[] args) {
        
        ConcreteProduct observableProduct = new ConcreteProduct();
        
        ConcreteCustomer observerCustomer1 = new ConcreteCustomer();
        ConcreteCustomer observerCustomer2 = new ConcreteCustomer();
        ConcreteCustomer observerCustomer3 = new ConcreteCustomer();
        
        observableProduct.addObserver(observerCustomer1);
        observableProduct.addObserver(observerCustomer2);
        observableProduct.addObserver(observerCustomer3);
        
        observableProduct.setProduct("T-shirt", 5, "Red", "L");
        System.out.println();
        observableProduct.setProduct("Swearshirt", 10, "Blue", "XL");
        
        observableProduct.removeObserver(observerCustomer3);
        
        System.out.println();
        observableProduct.setProduct("Hoodie", 35, "Black", "XXL");
        
        
       
       
        
    }
    
}
