/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author giorgos
 */
public interface Factory {
    Car createCar(CarType carType);
    
    static Car getCarFactory(CarType carType) {
        CarFactory f = new CarFactory();
        return f.createCar(carType);
    }
    
}
