/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author giorgos
 */
public class Company {

    private final List<Employee> employees;

    public Company() {
        employees = new ArrayList();
        employees.add(new Ceo("John"));
        employees.add(new Accountant("George"));
        employees.add(new Accountant("Mary"));
        employees.add(new Accountant("Brian"));
        employees.add(new Cleaner("Victoria"));
    }

    private static void makeActions(List<Employee> employees, 
            Employee.Action... actions) {
        for (Employee employee : employees) {
            employee.makeAction(actions);
        }
    }

    public void startNewDay() {
        makeActions(employees, Employee.Action.ARRIVE, Employee.Action.MAKE_COFFEE);
    }

    public void work() {
        makeActions(employees, Employee.Action.WORK, Employee.Action.TAKE_BREAK,
                Employee.Action.WORK);
    }

    public void endDay() {
        makeActions(employees, Employee.Action.LEAVE);
    }

}
