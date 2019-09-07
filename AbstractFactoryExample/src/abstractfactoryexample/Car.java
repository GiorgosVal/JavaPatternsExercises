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
public abstract class Car {
    
    protected String brand;
    protected int year;
    protected String color;
    protected boolean hasABS;
    
    abstract void speedUp();

    public Car(String brand, int year, String color, boolean hasABS) {
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.hasABS = hasABS;
    }

    public boolean isHasABS() {
        return hasABS;
    }

    public void setHasABS(boolean hasABS) {
        this.hasABS = hasABS;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    
    
    
    
    
}
