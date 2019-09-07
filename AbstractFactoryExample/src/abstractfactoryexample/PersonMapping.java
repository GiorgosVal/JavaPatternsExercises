/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactoryexample;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author giorgos
 */
public class PersonMapping {
    
    static Map<PersonType, Person> personMapping = new HashMap();

    public PersonMapping() {
    }
    
    void addMapping(PersonType personType, Person person) {
        personMapping.put(personType, person);
    }
    
    void removeMapping(PersonType personType) {
        personMapping.remove(personType);
    }
    
    
    
}
