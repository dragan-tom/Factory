
package main.factory;

import java.io.ObjectInputStream;


public class Car {
    
    private final String vehicleType = "Car";
    private String model;
    private int buildYear;
    private int maxSpeed;
    private String color;
    private int maxFuel;
    private int currentFuel;
    private int consumption;
    private int mileage;
    
    public Car(){
        this.model="";
        this.buildYear=0;
        this.color="";
        this.maxFuel=0;
        this.currentFuel=0;
        this.consumption=0;
    }
  
    public Car(String customModel, int customBuildYear, String customColor, int customMaxFuel){
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.color = customColor;
        this.maxFuel = customMaxFuel;
    }
    
    public Car(String customModel, int customBuildYear, String customColor, int customMaxFuel, int customCurrentFuel, int customConsumption){
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.color = customColor;
        this.maxFuel = customMaxFuel;
        this.consumption = customConsumption;
        this.currentFuel = customCurrentFuel;
    }
    
    public Car(String customModel, int customBuildYear, String customColor, int customMaxFuel, int customCurrentFuel, int customConsumption, int customMileage){
        this.model = customModel;
        this.buildYear = customBuildYear;
        this.color = customColor;
        this.maxFuel = customMaxFuel;
        this.consumption = customConsumption;
        this.currentFuel = customCurrentFuel;
        this.mileage = customMileage;
    }
    
    public String getModel(){
        return this.model;
    }

    public void setModel(String customModel){
        this.model = customModel;
    }

    public int getBuildYear(){
        return this.buildYear;
    }
    
    public void setBuildYear(int customBuildYear){
        this.buildYear = customBuildYear;
    }
    
    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public void setMaxSpeed(int customMaxSpeed){
        this.maxSpeed = customMaxSpeed;
    }
    
      public String getColor(){
        return this.color;
    }

    public void setColor(String customColor) {
        this.color = customColor;
    }
    
      public int getMaxFuel(){
        return this.maxFuel;
    }

    public void setMaxFuel(int customMaxFuel) {
        this.maxFuel = customMaxFuel;
    }
    
      public int getCurrentFuel(){
        return this.currentFuel;
    }

    public void setCurrentFuel(int customCurrentFuel) {
        this.currentFuel = customCurrentFuel;
    }
    
      public int getConsumption(){
        return this.consumption;
    }

    public void setConsumption(int customConsumption) {
        this.consumption = customConsumption;
    }
    
      public int getMileage(){
        return this.mileage;
    }

    public void setMileage(int customMileage) {
        this.mileage = customMileage;
    }
        
    public String getVehicleType (){
        return this.vehicleType;
    }
    
    public void showData () {
        System.out.println("----------------------Separator--------");
        System.out.println("Model: "+this.getModel());
        System.out.println("Godina proizvodnje: "+this.getBuildYear());
        System.out.println("Boja: "+this.getColor());
        System.out.println("Potrošnja: "+this.getConsumption());
        System.out.println("Maksimalna brzina: "+this.getMaxSpeed());
        System.out.println("Trenutno goriva: "+this.getCurrentFuel());
        System.out.println("Maksimalno goriva: "+this.getMaxFuel());
        
    }   
    
}
