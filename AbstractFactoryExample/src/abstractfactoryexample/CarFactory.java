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
public class CarFactory extends AbstractFactory {

    @Override
    public Car createCar(CarType carType) {
        return CarMapping.carMapping.get(carType);
    }

    @Override
    Person createPerson(PersonType personType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
