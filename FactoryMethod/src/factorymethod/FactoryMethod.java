/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giorgos
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CarMapping cars = new CarMapping();
        cars.addMapping(CarType.FERRARI, new Ferrari("Ferrari", 2000, "Red", true));
        cars.addMapping(CarType.FIAT, new Fiat("Fiat", 2000, "Blue", true));

        
        Car ferrari = Factory.getCarFactory(CarType.FERRARI);
        Car fiat = Factory.getCarFactory(CarType.FIAT);
        ferrari.speedUp();
        fiat.speedUp();

    }

}

/*
In Factory Method design pattern we have:

- A specific class. The class we want to get an instance. It can be a Superclass
of other Child classes. Also it can be an interface wich other classes implement.
Here, our specific class is the superclass Car, parent of Ferrari and Fiat classes.

- A specific factory class. A class that implements a Factory interface. Here,
our specific factory is the class CarFactory which implements the createCar()
method of Factory interface.

- A factory interface. This interface provides an abstract method createCat().
Also provides a static method getCarFactory() that creates a new CarFactory and
returns a Car object.


 */
