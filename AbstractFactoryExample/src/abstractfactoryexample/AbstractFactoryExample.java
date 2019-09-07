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
public class AbstractFactoryExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CarMapping carMap = new CarMapping();
        carMap.addMapping(CarType.FERRARI, new Ferrari("Ferrari", 2000, "Red", true));
        carMap.addMapping(CarType.FIAT, new Fiat("Fiat", 2000, "Blue", true));
        
        PersonMapping personMap = new PersonMapping();
        personMap.addMapping(PersonType.MAN, new Man("Brian", 30));
        personMap.addMapping(PersonType.WOMAN, new Woman("Mary", 26));
        personMap.addMapping(PersonType.CHILD, new Child("Johny", 12));
        
        Car ferrari = AbstractFactory.getCarFactory().createCar(CarType.FERRARI);
        Car fiat = AbstractFactory.getCarFactory().createCar(CarType.FIAT);
        Person man = AbstractFactory.getPersonFactory().createPerson(PersonType.MAN);
        Person woman = AbstractFactory.getPersonFactory().createPerson(PersonType.WOMAN);
        Person child = AbstractFactory.getPersonFactory().createPerson(PersonType.CHILD);
        
        ferrari.speedUp();
        fiat.speedUp();
        man.musclePower();
        woman.musclePower();
        child.musclePower();
        
        
    }
    
}


/*

An Abstract Factory is a factory of factories. With this design pattern we add
an extra abstraction level above each specific factory of the Factory Method pattern.

In Abstract Factory we have:

- Specific classes: Classes we want to instantiate. They can be parent classes or
interfaces that other classes implement. Here, we have Person and Car classes
as parent classes, and Ferrari, Fiat, Man, Woman, Child classes as child classes.

- Specific factories: Classes that extend or implement the Abstract Factory. Here
our specific factories are CarFactory and PersonFactory.

- Abstract Factory: A parrent class (or an interface) that provides the definition
of abstract methods of type getInstance(). It also provides static methods to
create instances of the specfic factories.


NOTICE: In this example we used the CarMapping and PersonMapping classes in order
to create a mapping for each CarType and PersonType. We use this mapping in order
to avoid the multiple if/else blocks inside the createCar and createPerson methods
of CarFactory and PersonFactory classes.









*/