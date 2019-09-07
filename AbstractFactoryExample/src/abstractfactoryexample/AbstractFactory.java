/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryexample;

/**
 *
 * @author giorgos
 */
public abstract class AbstractFactory {
    
    abstract Car createCar(CarType carType);
    abstract Person createPerson(PersonType personType);
    
    static CarFactory getCarFactory() {
        return new CarFactory();
    }
    
    static PersonFactory getPersonFactory() {
        return new PersonFactory();
    }
    
}
