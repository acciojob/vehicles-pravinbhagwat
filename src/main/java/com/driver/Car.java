package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels =  wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentGear = 1;
    }

    public Car(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getCurrentSpeed() {
        return super.getCurrentSpeed();
    }

    @Override
    public void setCurrentSpeed(int currentSpeed) {
        super.setCurrentSpeed(currentSpeed);
    }

    @Override
    public int getCurrentDirection() {
        return super.getCurrentDirection();
    }

    @Override
    public void setCurrentDirection(int currentDirection) {
        super.setCurrentDirection(currentDirection);
    }

    @Override
    public void steer(int direction) {
        super.steer(direction);
    }

    @Override
    public void move(int speed, int direction) {
        super.move(speed, direction);
    }

    @Override
    public void stop() {
        super.stop();
    }

    public void changeGear(int newGear){
        setCurrentGear(newGear);
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void setCurrentGear(int newGear) {
        this.currentGear = newGear;
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
