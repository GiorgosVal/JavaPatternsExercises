/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.Map;

/**
 *
 * @author giorgos
 */
public class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    enum Action {
        ARRIVE, MAKE_COFFEE, LEAVE, WORK, TAKE_BREAK
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void arriveAtWork() {
        System.out.println(this.name + " arrived at work.");
    }

    public void makeCoffee() {
        System.out.println(this.name + " makes cofee.");
    }

    public void leaveFromWork() {
        System.out.println(this.name + " left from work.");
    }

    public void work() {
    }

    public void takeABreak() {
    }

    public void action(Action action) {
        switch (action) {
            case ARRIVE:
                arriveAtWork();
                break;
            case LEAVE:
                leaveFromWork();
                break;
            case MAKE_COFFEE:
                makeCoffee();
                break;
            case TAKE_BREAK:
                takeABreak();
                break;
            case WORK:
                work();
                break;
        }
    }

    public void makeAction(Action... actions) {
        for (Action action : actions) {
            action(action);
        }
    }

}
