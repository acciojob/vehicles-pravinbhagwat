package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name, 4, 2, 5, isManual, "F1", 2);
    }


    public F1(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name, wheels, doors, gears, isManual, type, seats);
    }

    public F1(String name) {
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
    public void setCurrentGear(int currentGear) {
        super.setCurrentGear(currentGear);
    }

    @Override
    public void move(int speed, int direction) {
        super.move(speed, direction);
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void changeGear(int newGear) {
        super.changeGear(newGear);
    }

    @Override
    public void changeSpeed(int newSpeed, int newDirection) {
        super.changeSpeed(newSpeed, newDirection);
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        newSpeed = getCurrentSpeed() + rate;

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            setCurrentGear(1);
            stop();
        } else if (newSpeed > 0 && newSpeed <=50) {
            setCurrentGear(1);
        } else if (newSpeed > 50 && newSpeed <=100) {
            setCurrentSpeed(2);
        } else if (newSpeed > 100 && newSpeed <= 150) {
            setCurrentGear(3);
        } else if (newSpeed > 150 && newSpeed <= 200) {
            setCurrentGear(4);
        } else if (newSpeed > 200 && newSpeed <=250) {
            setCurrentGear(5);
        } else if (newSpeed > 250) {
            setCurrentGear(6);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }


    }
}
