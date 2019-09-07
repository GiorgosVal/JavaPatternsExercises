/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author giorgos
 */
public class Facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Company company = new Company();
        
        company.startNewDay();
        System.out.println("");
        company.work();
        System.out.println("");
        company.endDay();
        
    }
    
}

/*
Facade pattern hides the complexities of the system and provides an interface 
to the client using which the client can access the system.
It involves a single class which provides simplified methods required by client
and delegates calls to methods of existing system classes. 

In this example the Facade class is the Company class through which we delegate
calls to the methods of the Employee class hierarcy.

*/
