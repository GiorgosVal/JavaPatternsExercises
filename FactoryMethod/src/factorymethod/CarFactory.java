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
public class CarFactory implements Factory {

    @Override
    public Car createCar(CarType carType) {
        if (carType == carType.FERRARI) {
            return new Ferrari("Ferrari", 2000, "Red", true);
        }
        return new Fiat("Fiat", 2000, "Blue", true);

    }

}
