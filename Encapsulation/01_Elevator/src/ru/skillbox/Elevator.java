package ru.skillbox;

public class Elevator {

    private int minFloor = 1;
    private int maxFloor = 24;
    private int currentFloor = 1;

    public Elevator(int minFloor, int maxFloor) {

        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.currentFloor = 1;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int moveUp(){
        return currentFloor < maxFloor? currentFloor += 1: currentFloor;
    }

    public int moveDown(){
        return currentFloor > minFloor? currentFloor -= 1: currentFloor;
    }

    public void move(int floor) {
        if ((minFloor > floor) || (floor > maxFloor)) {
            System.out.println("Wrong floor entered");
            return ;
        }

        while (floor != currentFloor) {
            if (floor > currentFloor){
                moveUp();
                System.out.println(currentFloor + "Floor");
            }
            else {
                moveDown();
                System.out.println(currentFloor + "Floor");
            }
        }
    }
}


