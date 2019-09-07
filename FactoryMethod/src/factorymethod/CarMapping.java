/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author giorgos
 */
public class CarMapping {
    
    static Map<CarType, Car> carMapping = new HashMap();

    public CarMapping() {
    }
    
    void addMapping(CarType carType, Car car) {
        carMapping.put(carType, car);
    }
    
    void removeMapping(CarType carType) {
        carMapping.remove(carType);
    }
    
    
    
}
