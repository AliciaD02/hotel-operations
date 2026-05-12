package com.pluralsight;

public class Room {
    // in order to know the properties
    //is mostly boolean
    private int numberOfBeds;   // asking for number of beds
    private double price;  // asking for price
    private boolean isOccupied;    //is usually yes or no
    private boolean isDirty;//is mostly boolean

    //exercise 2 add check in,checkout,and cleanroom method not properties they are actions


    //will not have a property for is available why?   we need to know if it is  clean and not occupied to get the number

      // attributes - they are things that an object have
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;


    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    // calculated (using other information properties) or derived
    public boolean isAvailable() {
          // if it is not dirty and not occupied then its available
        // make an if statement
        // I prefer the if statement because it is cleaner

        //if the room is not occupied and is not dirty then it is available
        if(!this.isOccupied() && !this.isDirty()) {
            return true;

        }

        //otherwise it is not available
        return false;
    }


    // we are creating a method when the guest checks in

    // we have to do an if statement because there is two options (occupied or not)
    // both things have to check two things occupied/dirty to see availability
    public void checkIn() {
        if(isAvailable()) {
            isOccupied = true;
            isDirty = true;
            System.out.println("Guess checked in ");
        } else {
                System.out.println("Room is not available ");
            }
        }


       public void checkOut() {
       // you need to do more things to do when you check out so it's good to have more methods as in you also need to clean room
           //
        isOccupied = false;
            System.out.println("Guest checked out, room needs cleaning");
            cleanRoom();
        }

        public void cleanRoom() {
           isDirty = false;
            System.out.println("Room is now cleaned, available for new guest");
        }


       }







